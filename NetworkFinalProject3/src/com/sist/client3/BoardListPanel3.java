package com.sist.client3;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.table.*;
import com.sist.vo.*;
import com.sist.manager.*;
import java.util.*;
import java.text.*;

public class BoardListPanel3 extends JPanel implements ActionListener{
	
	JLabel la,pageLa;
	JButton b1,b2,b3,b4;
	JTable table;
	DefaultTableModel model;
	ControllPanel3 cp; // 화면 변경 ==> <jsp include>
	int curpage=1;
	int totalpage=0;
	BoardManager bm=new BoardManager();
	
	public BoardListPanel3(ControllPanel3 cp)
	{
		//setBackground(Color.cyan);
		
		this.cp=cp;
		String[] col= {"번호", "제목", "이름", "작성일", "조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row, col)
		{
			// 익명의 클래스 => 오버라이딩 (생성자 호출)
			// 편집 방지
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}	
			
			
		};
		table=new JTable(model);
		table.getTableHeader().setReorderingAllowed(false);  // 각 컬럼 이동 방지
		table.setShowVerticalLines(false);
		table.setRowHeight(62); // height 늘리기
		
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(50);
		
		JScrollPane js=new JScrollPane(table);
		
		b1=new JButton("새글");
		b2=new JButton("검색");
		b3=new JButton("이전");
		b4=new JButton("다음");
		la=new JLabel("자유게시판");
		pageLa=new JLabel("1 page / 1 pages");
		
		// 배치
		setLayout(null); // 사용자정의 배치
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		la.setBounds(100, 15, 700, 50);
		add(la);
		
		b1.setBounds(10, 75, 100, 30);
		add(b1);
		
		js.setBounds(10, 115, 990, 640);
		add(js);
		
		JPanel p=new JPanel();
		p.add(b3);
		p.add(pageLa);
		p.add(b4);
		
		p.setBounds(130, 770, 710, 35);
		add(p);
		
		// 이벤트
		b1.addActionListener(this);
		b3.addActionListener(this); // 이전
		b4.addActionListener(this); // 다음
		boardList();
				
	}

	public void boardList()
	{
		// 전체를 지운다.
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		
		ArrayList<BoardVO> list=bm.boardListData(curpage);
		totalpage=bm.boardTotalPage();
		pageLa.setText(curpage+" page / "+totalpage+" pages");
		for(int i=list.size()-1;i>=0;i--)
		{
			BoardVO vo=list.get(i);
			String[] data= {String.valueOf(vo.getNo()), vo.getSubject(), vo.getName(), new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),
							String.valueOf(vo.getHit())};
			model.addRow(data);
		}
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			cp.bip.tf1.setText("");
			cp.bip.tf2.setText("");
			cp.bip.tf3.setText("");
			cp.bip.ta.setText("");
			cp.card.show(cp, "insert");
		}
		else if(e.getSource()==b3)
		{
			if(curpage>1)
			{
				curpage--;
				boardList();
			}
		}
		else if(e.getSource()==b4)
		{
			if(curpage<totalpage)
			{
				curpage++;
				boardList();
			}
		}
		
	}

}
