package com.sist.client3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import com.sist.manager.BookManager;
import com.sist.vo.BookCategoryVO;
import com.sist.vo.BookHouseVO;
public class HomePanel3 extends JPanel implements MouseListener{
   JButton b1,b2,b3;
   PosterCard3[] pcs=new PosterCard3[12];
   BookManager fm=new BookManager();
   JPanel pan=new JPanel();
   ControllPanel3 cp;
   public HomePanel3(ControllPanel3 cp)
   {
	   this.cp=cp;
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,3,20,20));
	   b1=new JButton("국내 도서 베스트");
	   b1.setPreferredSize(new Dimension(300,45));
	   b2=new JButton("국내 CD / LP 베스트");
	   b2.setPreferredSize(new Dimension(300,45));
	   b3=new JButton("국내 DVD 베스트");
	   b3.setPreferredSize(new Dimension(300,45));
	   p.add(b1);p.add(b2);p.add(b3);
	   
	   pan.setLayout(new GridLayout(4,3,5,5));
	   //pan.setBackground(Color.black);
	   // 배치 
	   setLayout(new BorderLayout());
	   //add("North",p);
	   add("Center",pan);
	   
//	   b1.addActionListener(this);
//	   b2.addActionListener(this);
//	   b3.addActionListener(this);
	   
   }
   public void cardPrint(ArrayList<BookCategoryVO> list)
   {
	   int i=0;
	   for(BookCategoryVO vo:list)
	   {
		   //System.out.println(vo.getPoster().substring(0,vo.getPoster().lastIndexOf("?")));
		   pcs[i]=new PosterCard3(vo);
		   
		   pan.add(pcs[i]);
		   pcs[i].addMouseListener(this);
		   i++;
	   }
	   
   }
   public void cardInit(ArrayList<BookCategoryVO> list)
   {
	   for(int i=0;i<list.size();i++)
	   {
		   pcs[i].poLa.setIcon(null);
		   pcs[i].tLa.setText("");
	   }
	   pan.removeAll();// 데이터 제거
	   pan.validate();// Panel 재배치 
   }
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()==b1)
//		{
//			ArrayList<BookCategoryVO> list=
//					fm.BookCategoryData(1);
//			cardInit(list);
//			cardPrint(list);
//			  
//		}
//		else if(e.getSource()==b2)
//		{
//			   ArrayList<BookCategoryVO> list=
//					fm.BookCategoryData(2);
//			   
//			   BookCategoryVO fvo=
//					   new BookCategoryVO();
//			   //fvo.setPoster("c:\\javaDev\\def.png");
//			   fvo.setPoster(null);
//			   fvo.setTitle("");
//			   for(int j=0;j<6;j++)
//			   {
//				   list.add(fvo);
//			   }
//			cardInit(list);
//			cardPrint(list);
//		}
//		else if(e.getSource()==b3)
//		{
//			ArrayList<BookCategoryVO> list=
//					fm.BookCategoryData(3);
//			cardInit(list);
//			cardPrint(list);
//		}
//	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<pcs.length;i++)
		{
			if(e.getSource()==pcs[i])
			{
				if(e.getClickCount()==2)
				{
					String title=pcs[i].tLa.getText();
					BookCategoryVO vo=fm.categoryInfoData(title);
					cp.fdp.la1.setText(vo.getTitle());
					cp.fdp.la2.setText(vo.getSubject());
					ArrayList<BookHouseVO> list=
							   fm.BookHouseListData(vo.getCno());
					cp.fdp.BookPrint(list);
					cp.card.show(cp,"cateBook");
				}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}