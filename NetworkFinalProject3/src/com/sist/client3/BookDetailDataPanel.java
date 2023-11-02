package com.sist.client3;

import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.*;
import java.util.*;
import com.sist.vo.*;
import com.sist.common3.ImageChange3;
import com.sist.manager.*;
/*
 	1|더 마인드|하와이 대저택|https://image.yes24.com/goods/123155346/L|웅진지식하우스|10.0
 */
public class BookDetailDataPanel extends JPanel implements ActionListener{
	JLabel posterLa;
	JLabel nameLa;
	JLabel authorLa, publLa, scoreLa;
	JButton b;
	ControllPanel3 cp;
	JLabel la1, la2, la3;
	
	public BookDetailDataPanel(ControllPanel3 cp)
	{
		this.cp=cp;
		posterLa=new JLabel();
		nameLa=new JLabel();
		authorLa=new JLabel();
		publLa=new JLabel();
		scoreLa=new JLabel();
		
		b=new JButton("목록");
		la1=new JLabel("작가");
		la2=new JLabel("출판사");
		la3=new JLabel("평점");
		
		// 배치
		setLayout(null);
		posterLa.setBounds(10, 15, 300, 375);
		add(posterLa);
		
		nameLa.setBounds(320, 15, 300, 35);
		nameLa.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		add(nameLa);
		
		la1.setBounds(320, 60, 70, 35);
		authorLa.setBounds(395, 60, 400, 35);
		add(la1); add(authorLa);
		
		la2.setBounds(320, 100, 70, 35);
		publLa.setBounds(395, 100, 400, 35);
		add(la2); add(publLa);
		
		la3.setBounds(320, 140, 70, 35);
		scoreLa.setBounds(395, 140, 400, 35);
		add(la3); add(scoreLa);
		
		b.setBounds(320, 340, 100, 35);
		add(b);
		
		b.addActionListener(this);
	}
	public void bookPrint(BookHouseVO vo)
	{
		try
		{
			nameLa.setText(vo.getName());
			authorLa.setText(vo.getAuthor());
			publLa.setText(vo.getPubl());
			scoreLa.setText(String.valueOf(vo.getScore()));
			
			URL url=new URL(vo.getPoster());
			Image image=ImageChange3.getImage(new ImageIcon(url), 300, 200);
			posterLa.setIcon(new ImageIcon(image));
		}catch(Exception ex)
		{
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			cp.card.show(cp, "home");
		}
	}
}








