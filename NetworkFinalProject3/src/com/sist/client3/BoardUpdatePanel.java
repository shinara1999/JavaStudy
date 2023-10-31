package com.sist.client3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sist.manager.BoardManager;
import com.sist.vo.BoardVO;

public class BoardUpdatePanel extends JPanel implements ActionListener{
	ControllPanel3 cp;
    JLabel titleLa;
    JLabel la1,la2,la3,la4,la5;
    JTextField tf1,tf2;
    JPasswordField pf;
    JTextArea ta;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardUpdatePanel(ControllPanel3 cp)
    {
   	     this.cp=cp;
   	     titleLa=new JLabel("수정하기");
    	 titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	 titleLa.setHorizontalAlignment(JLabel.CENTER);
    	 
    	 la1=new JLabel("이름");//<label for="name">이름</label>
    	 la2=new JLabel("제목");
    	 la3=new JLabel("내용");
    	 la4=new JLabel("비밀번호");
    	 la5=new JLabel("");
    	 la5.setVisible(false);
    	 tf1=new JTextField();//<input type=text>
    	 tf2=new JTextField();
    	 ta=new JTextArea();//<textarea></textarea>
    	 JScrollPane js=new JScrollPane(ta);
    	 pf=new JPasswordField();//<input type=password>
    	 
    	 b1=new JButton("수정");//<input type=button>
    	 b2=new JButton("취소");
    	 
    	 // 배치 
    	 setLayout(null);// css
    	 titleLa.setBounds(100, 15, 700, 50);
	   	 add(titleLa);
	   	 
	   	 la1.setBounds(10,75, 70, 30);
	   	 tf1.setBounds(85,75,150, 30);
	   	 
	   	 la2.setBounds(10,115, 70, 30);
	   	 tf2.setBounds(85,115,450, 30);
	   	 
	   	 la3.setBounds(10,155, 70, 30);
	   	 js.setBounds(85,155,850, 450);
	   	 
	   	 la4.setBounds(10,615, 70, 30);
	   	 pf.setBounds(85,615,150, 30);
	   	 
//	   	 JPanel p=new JPanel();
//	   	 p.add(b1);
//	   	 p.add(b2);
//	   	 p.setBounds(150, 650, 675 , 35);
	   	 add(la5);
	   	 
	   	 b1.setBounds(875, 615, 65, 25);
		 b2.setBounds(875, 75, 65, 25);
		 add(b1); add(b2);
	   	 
	   	 // 추가
	   	 add(la1);add(tf1);
	   	 add(la2);add(tf2);
	   	 add(la3);add(js);
	   	 add(la4);add(pf);
	   	 //add(p);
	   	 
	   	 b1.addActionListener(this);
	   	 b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b2)
		{
			cp.card.show(cp, "detail");
		}
		else if(e.getSource()==b1)
		{
			String name=tf1.getText();
			String subject=tf2.getText();
			String content=ta.getText();
			String pwd=String.valueOf(pf.getPassword());
			
			if(pwd.trim().length()<1) // 입력이 안됐다면
			{
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요.");
				// 사용자 오류 발생 => 예외처리
				pf.requestFocus();
				return;
			}
			String no=la5.getText();
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setNo(Integer.parseInt(no));
			
			// Board Manager 연결
			String res=bm.boardUpdate(vo);
			if(res.equals("YES"))
			{
				cp.card.show(cp, "board");
				cp.blp.boardList();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다.");
				pf.setText("");
				pf.requestFocus();
				
			}
			// sendReDirect("detail.jsp")
			
		}
	}
    
    
}









