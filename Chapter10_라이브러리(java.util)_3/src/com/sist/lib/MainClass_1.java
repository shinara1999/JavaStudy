package com.sist.lib;
/*
 		자바에서 가장 많이 사용되는 패키지
 		=> java.lang / java.util / java.io / java.sql
 		=> 웹 사이트 => HTML / CSS 오픈소스
 		   => Spring / React
 		  java.lang : Object / String / Math / Wrapper
 		  java.util : Date / StringTokenizer / List (ArrayList) / Map (Hashmap)
 		=> Calendar => 기본 달력 (예약)
 */

import java.util.*;
public class MainClass_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// System.in , System.out => 자바 표준 입출력
		// 키보드 입력값 받기 , 화면 출력
		System.out.print("년 월 일 입력(2023 10 25):");
		
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		// 요일 , 입력달의 마지막 날 구하기 => Calendar에 설정
		// set() => get()
		/*
		 		1. 년도 설정 set(Calendar.YEAR, year)
		 		2. 월 설정 set(Calendar.Month, month-1)
		 		3. 일 설정 set(Calendat.DATE, 1)
		 		
		 		=> Calendar => 추상 클래스
		 					   --------- 미완성 (메소드 구현이 안된다.)
		 					   new 이용해서 메모리 할당이 불가능하다.
		 		=> new를 사용하지 않고 메모리 할당 (추상클래스, 인터페이스)
		 */
		
		// Calendar 객체 생성
		Calendar cal=Calendar.getInstance();
		
		// 요청한 달의 날짜 생성
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		// 요일 구하기
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		
		// 1~7까지 ==> 0~6 => 일~토
		// 해당달의 마지막날을 가지고 온다.
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		// 출력
		String[] strweek= {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(year+"년도 "+ month+"월 ");
		
		for(String w:strweek)
		{
			System.out.print(w+"\t");
		}
		System.out.println("\n"); // 다음줄 이동
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)	
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}

}
