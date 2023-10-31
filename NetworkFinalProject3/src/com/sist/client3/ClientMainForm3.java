package com.sist.client3;

import javax.swing.*;

// import com.sist.client.Login3;
import com.sist.common3.ImageChange3;
import com.sist.manager.BookManager;
import com.sist.vo.BookCategoryVO;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClientMainForm3 extends JFrame implements ActionListener{
	MenuPanel3 mp=new MenuPanel3();
	ControllPanel3 cp=new ControllPanel3();
	JLabel logo=new JLabel();
	Login3 login=new Login3();
	BookManager fm=new BookManager();
	
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
		
		ArrayList<BookCategoryVO> list=fm.bookCategoryData(1);
		// cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
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
			cp.card.show(cp, "search");
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
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			// 서버연결
			login.setVisible(false);
			setVisible(true);
		}
	}

}
