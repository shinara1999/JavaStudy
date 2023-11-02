package com.sist.client3;

import javax.swing.*;

import com.sist.common3.Function3;
// import com.sist.client.Login3;
import com.sist.common3.ImageChange3;
import com.sist.manager.BookManager;
import com.sist.vo.BookHouseVO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//서버임포트
import java.util.*;
import java.io.*;
import java.net.*;

public class ClientMainForm3 extends JFrame implements ActionListener, Runnable{
	MenuPanel3 mp=new MenuPanel3();
	ControllPanel3 cp=new ControllPanel3();
	JLabel logo=new JLabel();
	Login3 login=new Login3();
	BookManager fm=new BookManager();
	
	// 네트워크 관련
    Socket s; // 전화기
    OutputStream out; // 송신
    BufferedReader in; // 수신
	
	public ClientMainForm3()
	{
		setLayout(null);
		
		logo.setBounds(0, 0, 200, 200);
		logo.setIcon(new ImageIcon(ImageChange3.getImage(new ImageIcon("C:\\javaDev\\logo3.png"), 200, 200)));
		add(logo);
		
		mp.setBounds(10, 200, 200, 500);
		add(mp);
		
		cp.setBounds(230, 15, 1030, 750);
		add(cp);
		
		setSize(1280, 800);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
		
//		ArrayList<BookHouseVO> list=fm.bookListData(1);
//		cp.hp.cardInit(list);
//		cp.hp.cardPrint(list);
		//cp.hp.homeList();
		// 채팅 등록
    	cp.cp.tf.addActionListener(this);
    	cp.cp.b6.addActionListener(this); // 프로그램 종료
    	
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		
		new ClientMainForm3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==mp.b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6)
		{
			try
			{
				out.write((Function3.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		else if(e.getSource()==login.b1)
		{
			// 서버연결
						String id=login.tf1.getText();
						if(id.trim().length()<1)
						{
							login.tf1.requestFocus();
						}
						
						String name=login.tf2.getText();
						if(name.trim().length()<1)
						{
							login.tf2.requestFocus();
						}
						
						String sex="";
						if(login.rb1.isSelected())
						{
							sex="남자";
						}
						else
						{
							sex="여자";
						}
						
						// 서버 연결
						connect(id, name, sex);
		}
		else if(e.getSource()==cp.cp.tf)
		{
			String msg=cp.cp.tf.getText();
			if(msg.trim().length()<1)
				return;
			
			// 채팅 메세지 전송
			try
			{
				out.write((Function3.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.cp.b6)
		{
			try
			{
				out.write((Function3.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
	}
	
	// 서버와 연결
		public void connect(String id, String name, String sex)
		{
			try
			{
				s=new Socket("localhost", 10000); // 서버연결됨
				out=s.getOutputStream(); // 서버전송됨
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				out.write((Function3.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
				
			}catch(Exception ex) {}
			// 서버로부터 들어오는 데이터를 받아서 처리
			new Thread(this).start();
		}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg, "|");
				int protocol=Integer.parseInt(st.nextToken());
				// Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos => 4개니까 토큰도 4개
				switch(protocol)
				{
				case Function3.LOGIN:
				{
					String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
					};
					cp.cp.model2.addRow(data);
				}
				break;
				case Function3.MYLOG:
				{
					login.setVisible(false);
					setVisible(true);
				}
				break;
				case Function3.WAITCHAT:
				{
					cp.cp.bar.setValue(cp.cp.bar.getMaximum());
					cp.cp.pane.append(st.nextToken()+"\n");
				}
				break;
				case Function3.MYEXIT:
				{
					System.exit(0);
				}
				break;
				case Function3.EXIT:
				{
					String id=st.nextToken();
					for(int i=0;i<cp.cp.model2.getRowCount();i++) // getRowCount() : 목록 출력한 것을 다 가져오기
					{
						String temp=cp.cp.model2.getValueAt(i, 0).toString();
						if(id.equals(temp)) {
							cp.cp.model2.removeRow(i);
							break;
						}
					}
				}
				break;
				}
			}
		}catch(Exception ex) {}
	}
	

}
