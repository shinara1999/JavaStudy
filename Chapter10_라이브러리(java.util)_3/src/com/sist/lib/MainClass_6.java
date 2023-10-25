package com.sist.lib;
/*
 		ArrayList<클래스>
 				 -------
 				  ㅣ 기본형 ==> Integer , String
 				  	=> 사용자 정의 클래스
 				  ArrayList<Music>
 				  ArrayList<Movie>
 				  ArrayList<Food>
 				  ----------------- Object => 형변환
 */

import java.util.*;
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("키르아");
		names1.add("나츠키");
		names1.add("이누마키");
		names1.add("무이치로");
		names1.add("요시다");
		for(String name:names1)
		{
			System.out.println(name);
		}
		System.out.println("=======");
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("주찬양");
		names2.add("성준수");
		names2.add("전영중");
		names2.add("키르아");
		names2.add("조신우");
		for(String name:names2)
		{
			System.out.println(name);
		}
		System.out.println("=======");
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 다른 컬렉션에 데이터를 추가할 때 => temp에 names1을 복사해라.
		for(String name:temp)
		{
			System.out.println(name);
		}
		System.out.println("=======");
		temp.retainAll(names2); // 같은 데이터를 추가 (교집합)
		for(String name:temp)
		{
			System.out.println(name);
		}
	}

}
