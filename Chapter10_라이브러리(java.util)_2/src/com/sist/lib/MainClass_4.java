package com.sist.lib;

import java.util.*;

// 332 page => Date / Calendar
/*
 		날짜 관련 (시간 포함)
 		-----------------
 		Date => 기능이 없다. (단지 날짜를 저장할 목적)
 							   --------- 오라클 호환
 		*** Calendar : Date에 없는 기능을 보완
 				     	=> 요일 , 마지막날 읽기
 				   		=> 달력 (예약)
 				   		=> 월 , 요일 저장에 차이가 있다.
 				   		   --------
 				   		   	월 : 0번부터
 				   		   	요일 : 1부터
 		=> Date : 일반 클래스
 				  Date date=new Date()
 		   Calendar : 추상클래스
 		   			  Calendar cal=Calendar.getInstance()
 		   			  => getInstance() , newInstance()
 		   			  	 -----------------------------
 		   			  	 => 싱글턴
 */

class A
{
	static A a;
	public static A newInstance()
	{
		if(a==null)
		{
			a=new A();
		}
		return a;
	}
}
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A aa=new A();
//		System.out.println("aa="+aa);
//		A bb=new A();
//		System.out.println("bb="+bb);
		
//		A aa=A.newInstance();
//		A bb=A.newInstance();
//		A cc=A.newInstance();
//		
//		System.out.println("aa="+aa);
//		System.out.println("bb="+bb);
//		System.out.println("cc="+cc);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		// 날짜 지정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		
		String[] strweek= {"", "일", "월", "화", "수", "목", "금", "토"};
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strweek[week]+"요일입니다.");
		System.out.println(month+"월의 마지막 날은 "+lastday+"일 입니다.");
	}

}
