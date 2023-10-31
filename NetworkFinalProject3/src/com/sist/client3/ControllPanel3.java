package com.sist.client3;

import java.awt.CardLayout;

import javax.swing.*;
import java.awt.*;

public class ControllPanel3 extends JPanel{
	
	public HomePanel3 hp=new HomePanel3();
	public SearchPanel3 sp=new SearchPanel3();
	public ChatPanel3 cp=new ChatPanel3();
	public BoardListPanel3 blp;
	public NewsPanel3 np=new NewsPanel3();
	public BoardInsertPanel bip;
	public BoardDetailPanel bdp;
	public BoardDeletePanel bdel;
	public BoardUpdatePanel bup;
	
	public CardLayout card=new CardLayout();
	public ControllPanel3()
	{
		blp=new BoardListPanel3(this); // 화면 이동
		bip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this);
		bdel=new BoardDeletePanel(this);
		bup=new BoardUpdatePanel(this);
		
		setLayout(card);
		add("home", hp);
		//add("search", sp);
		add("chat", cp);
		add("board", blp);
		add("news", np);
		add("insert", bip);
		add("detail", bdp);
		add("delete", bdel);
		add("update", bup); // => @RequestMapping("update.jsp") => Spring/Spring-Boot
							// => app.get("update.jsp") => NodeJS
	}
}
