package com.sist.client3;

import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common3.ImageChange3;
import com.sist.vo.*;

public class PosterCard extends JPanel{
	JLabel poLa=new JLabel();
	JLabel tLa=new JLabel();
	public PosterCard(BookCategoryVO vo)
	{
		setLayout(null);
		poLa.setBounds(30, 5, 60, 100);
		tLa.setBounds(30, 130, 280, 30);
		
		add(poLa);
		add(tLa);
		
		try
		{
			if(vo.getPoster().startsWith("http"))
			{
				URL url=new URL(vo.getPoster());
				Image image=ImageChange3.getImage(new ImageIcon(url), 280, 150);
				poLa.setIcon(new ImageIcon(image));
			}
			else // (이미지없음)
			{
				Image image=ImageChange3.getImage(new ImageIcon("c:\\java_data\\noimage.jpg"), 280, 150);
				poLa.setIcon(new ImageIcon(image));
			}
			
			tLa.setText(vo.getTitle());
		}catch(Exception ex) {ex.printStackTrace();}
	}
}
