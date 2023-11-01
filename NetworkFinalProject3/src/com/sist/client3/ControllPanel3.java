package com.sist.client3;

import java.awt.CardLayout;

import javax.swing.*;
import java.awt.*;

public class ControllPanel3 extends JPanel{
	
	public HomePanel3 hp;
	public SearchPanel3 sp=new SearchPanel3();
	public ChatPanel3 cp=new ChatPanel3();
	public BoardListPanel3 blp;
	public NewsPanel3 np=new NewsPanel3();
	public BoardInsertPanel3 bip;
	public BoardDetailPanel3 bdp;
	public BoardDeletePanel3 bdel;
	public BoardUpdatePanel3 bup;
	public BookDetailDataPanel fdp;
	
	public CardLayout card=new CardLayout();
	public BookFindPanel ffp;
	
	public ControllPanel3()
	{
		hp=new HomePanel3(this);
		blp=new BoardListPanel3(this); // 화면 이동
		bip=new BoardInsertPanel3(this);
		bdp=new BoardDetailPanel3(this);
		bdel=new BoardDeletePanel3(this);
		bup=new BoardUpdatePanel3(this);
		fdp=new BookDetailDataPanel(this);
		ffp=new BookFindPanel(this);
		
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
		add("fdetail", fdp);
		add("find", ffp);
	}
}
