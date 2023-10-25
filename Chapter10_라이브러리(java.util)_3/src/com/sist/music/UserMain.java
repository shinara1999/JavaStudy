package com.sist.music;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.*;

public class UserMain extends JFrame implements ActionListener{
	
	JTextField tf;
	JButton b, b2;
	JTable table;
	DefaultTableModel model;
	MusicManager mm=new MusicManager(); // 포함클래스
	
	public UserMain()
	{
		tf=new JTextField(10);
		b=new JButton("검색");
		b2=new JButton("목록");
		JPanel p=new JPanel();
		p.add(tf); p.add(b); p.add(b2);
		
		String[] col= {"순위", "곡명", "가수명"};
		String[][] row=new String[0][3];
		
		model=new DefaultTableModel(row, col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		// 윈도우에 올리기
		add("North", p);
		add("Center", js);
		
		musicPrint();
		
		setSize(800, 600);
		setVisible(true);
		
		b.addActionListener(this); // 버튼누르기
		b2.addActionListener(this);
		tf.addActionListener(this); // enter
		
	}
	public void musicPrint()
	{
		ArrayList<Music> list=mm.musicAllData();
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		for(Music m:list)
		{
			String[] data= {String.valueOf(m.getRank()), m.getTitle(), m.getSinger()}; // rank는 정수형이므로 valueOf를 이용해 String으로 변경
			model.addRow(data); // 데이터 3개를 한줄씩 추가하기
		}
	}
	public void musicFind(String title)
	{
		ArrayList<Music> list=mm.musicFindData(title);
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		for(Music m:list)
		{
			String[] data= {String.valueOf(m.getRank()), m.getTitle(), m.getSinger()};
			model.addRow(data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		
		new UserMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b||e.getSource()==tf) // 검색 버튼, enter
		{
			String title=tf.getText();
			if(title.length()<1) // 사용자의 실수 방지
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요.");
				tf.requestFocus();
				return;
			}
			musicFind(title);
		}
		else if(e.getSource()==b2)
		{
			musicPrint(); // 목록 출력
		}
	}

}










