package com.sist.client;

import java.awt.CardLayout;

import javax.swing.*;

public class ControllPanel extends JPanel{
	
	public HomePanel hp=new HomePanel();
	public SearchPanel sp=new SearchPanel();
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp=new BoardListPanel();
	public NewsPanel np=new NewsPanel();
	
	public CardLayout card=new CardLayout();
	public ControllPanel()
	{
		setLayout(card);
		add("home", hp);
		add("search", sp);
		add("chat", cp);
		add("board", blp);
		add("news", np);
	}
}
