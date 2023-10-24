package com.sist.lib;
// Random
import java.util.*;
/*
 		Random => 임의의 수를 추출할 때 사용
 				  ------- 자바 JVM에서
 				  => Math.random() => double
 		=> int nextInt(int bound)
 					  -----------
 					  	100 ==> 0~99 + 1
 			   nextInt(100)+1
 */
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z 알파벳을 임의로 10개
		Random r=new Random();
//		for(int i=1;i<=10;i++)
//		{
//			char c=(char)(r.nextInt(26)+65);
//			// 0~25 사이의 난수가 발생된다.
//			System.out.print(c+" ");
//		}
		
//		for(int i=1;i<=6;i++)
//		{
//			int lotto=r.nextInt(45)+1;
//			System.out.print(lotto+" ");
//		}
		
		// 예약 가능 날짜 확인
		int day=r.nextInt(7)+7;
		Set set=new HashSet(); // 중복제거
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
			System.out.print(rr+" ");
			set.add(rr);
		}
		System.out.println("\n======= 최종 결과 =======");
		for(Object obj:set)
		{
			System.out.print(obj+" ");
		}
	}

}
