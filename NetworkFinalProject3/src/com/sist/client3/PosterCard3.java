package com.sist.client3;

import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common3.ImageChange3;
import com.sist.vo.*;

public class PosterCard3 extends JPanel{
	JLabel poLa=new JLabel();
	JLabel tLa=new JLabel();
	public PosterCard3(BookCategoryVO vo)
	{
		setLayout(null);
		poLa.setBounds(30, 5, 280, 120);
		tLa.setBounds(30, 130, 280, 30);
		
		add(poLa);
		add(tLa);
		
		try
		{
			if(vo.getPoster().startsWith("http"))
			{
				System.out.println(vo.getPoster());
				URL url=new URL(vo.getPoster().replaceAll("[가-힣]", ""));
				Image image=ImageChange3.getImage(new ImageIcon(url), 280, 150);
				poLa.setIcon(new ImageIcon(image));	
			}
			else
			{
				Image image=ImageChange3.getImage(new ImageIcon("c:\\java_data\\noimage.jpg"), 280, 150);
				poLa.setIcon(new ImageIcon(image));
			}
			tLa.setText(vo.getTitle());
		}catch(Exception ex) {}
	}
}
