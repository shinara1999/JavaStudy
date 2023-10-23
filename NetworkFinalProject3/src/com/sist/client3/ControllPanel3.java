package com.sist.client3;

import java.awt.CardLayout;

import javax.swing.*;
import java.awt.*;

public class ControllPanel3 extends JPanel{
	
	public HomePanel3 hp=new HomePanel3();
	public SearchPanel3 sp=new SearchPanel3();
	public ChatPanel3 cp=new ChatPanel3();
	public BoardListPanel3 blp=new BoardListPanel3();
	public NewsPanel3 np=new NewsPanel3();
	
	public CardLayout card=new CardLayout();
	public ControllPanel3()
	{
		setLayout(card);
		add("home", hp);
		add("search", sp);
		add("chat", cp);
		add("board", blp);
		add("news", np);
	}
}
