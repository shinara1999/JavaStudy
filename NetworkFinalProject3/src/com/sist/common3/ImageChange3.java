package com.sist.common3;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageChange3 {
	public static Image getImage(ImageIcon icon, int w, int h) // 이미지 조절
	{
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
