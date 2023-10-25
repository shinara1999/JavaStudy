package com.sist.lib;
/*
 	335 page
 		자바의 컬렉션
 		---------- 자료구조 (데이터 관리)
 		=> 데이터를 모아서 관리하는 클래스의 집합
 		   ---------------- CRUD : 추가 , 수정 , 삭제 , 읽기
 		   => 메모리에서 영구적 저장이 되지 않는다.
 		   => 영구적인 저장장치 : 파일 / 오라클
 		Collection => 인터페이스
 			 ㅣ
 	  ------------------------
 	  ㅣ			  ㅣ			 ㅣ
 	 List		 Set		Map => 인터페이스 (표준화)
 	 
 	 	List : 순서를 가지고 있다. (인덱스) => 배열을 보완 (고정적, 같은 데이터형만 모을 수 있다.)
 	 									 가변형(크기 지정하지 않는다.)
 	 		   데이터의 중복을 허용한다.
 	 		   => ArrayList
 	 		   => Vector
 	 		   => LinkedList
 	 		   
 	 	Set : 순서가 없다.
 	 		  데이터의 중복을 허용하지 않는다.
 	 		  => *** HashSet
 	 		  => TreeSet
 	 		
 	 	Map : 순서가 없다.
 	 		  데이터 중복이 가능
 	 		  key , value => 쌍으로 만들어진다.
 	 		  --- key는 중복될 수 없다.
 	 		  => *** HashMap
 	 		  => Hashtable
 	 		  
 	 	Collection => 데이터를 일정 공간에 모아서 관리할 목적
 	 	---------- => 웹에서 목록 출력 (모아서 => 브라우저)
 	 		1) 배열이 단점을 보완 (저장 크기를 결정) => 고정적
 	 		   => 크기 결정을 하지 않는다. (가변형)
 	 		2) 인터페이스를 이용한다.
 	 		   -------- 표준화 (모든 개발자가 동일한 메소드를 이용)
 	 		   => 프레임워크 : Spring / MyBatis / JQuery / ReactJS
 	 		   		ㅣ 일정 기본 틀 => 쉽게 다른 개발자의 코딩을 분석
 	 		   		  ---------- 유지 보수
 	 337 page
 	 	 									Collection
 	 	 										ㅣ
 	  		     ----------------------------------------------------------------
 	   			 ㅣ								    ㅣ							ㅣ
 	   			List							   Set						    Map
 	   			 ㅣ									ㅣ							ㅣ
 	   --------------------------			-----------------			   -------------
 	   ㅣ			  ㅣ		 	ㅣ			ㅣ  				ㅣ			  ㅣ			   ㅣ
 	  ArrayList 	Vector 	LinkedList	 HashSet		 TreeSet		HashMap 	Hashtable
 	  
 	  	List : 가장 많이 사용되는 컬렉션
 	  		   ArrayList : Vector를 보완 => 비동기 => 데이터베이스 연동
 	  		   Vector : 동기 => 네트워크 접속자 정보 저장
 	  		   LinkedList : C언어 개발자 => 호환
 	  	--------------------------------------------------------------------------------------
 	  	    컬렉션			읽기(접근시간)			 추가/삭제			         비고
 	  	--------------------------------------------------------------------------------------
 	  	 ArrayList			속도가 빠르다.			속도가 느리다.		순차적으로 추가/삭제 시 속도가 빠르다.
 	  	 														비효율적인 메모리 사용
 	  	 					=> 웹 => 자체에서 추가/삭제를 하지 않는다.
 	  	 							오라클
 	  	--------------------------------------------------------------------------------------
 	  	 LinkedList			속도가 느리다.			속도가 빠르다.		데이터가 많을수록 접근성이 떨어진다.
 	  	 					=> 윈도우
 	  	--------------------------------------------------------------------------------------
 	  		   
 	    Set : 중복 데이터를 만들 때
 	    	  ----------------- HashSet
 	    	  검색 최적화 : TreeSet
 	    	  
 	   	Map : Hashtable => 단점을 보완 => HashMap
 	   		  HashMap => 웹에서 가장 많이 사용
 	   		  			 1) 관련된 클래스 관리 => 스프링, 마이바티스
 	   		  			 2) 웹소켓 (웹 네트워크) => sessionID
 	   		  			 
 	   	List
 	   	----
 	   	  1. ArrayList
 	   	  		= 장점
 	   	  			배열형식으로 만들어져 있다, => 인덱스를 이용해서 처리
 	   	  									 접근 속도가 빠르다.
 	   	  									 
 	   	 		= 단점
 	   	 			중간에 추가 / 삭제 시 속도가 저하된다.
 	   	 		= 항상 인덱스 번호는 순차적으로 유지
 	   	 		  0 1 2 3 4 5
 	   	 		  => 3 삭제
 	   	 		  0 1 2 3 4 => 자동으로 처리
 	   	 		  0 1 2 3 4 5
 	   	 		  	   ㅣ
 	   	 		  	  추가
 	   	 		= 사용처
 	   	 			데이터의 양이 일관적이고 추가, 삭제 없는 경우에 주로 사용한다.
 	   	 			=> 데이터베이스
 	   	 			데이터의 접속 속도를 중요시 할때 (웹)
 	   	 			
 	   	 			--------------
 	   	 			  10 20 30 40
 	   	 			--------------
 	   	 			  0  1  2  3
 	   	 			  
 	   	 			---		---		---		---	
 	   	 			10 ---- 20 ---- 30 ---- 40		=> 하나하나가 연결되어 있는 것
 	   	 			---		---		---		---
 	   	 		= 주요 메소드 ==> 웹(공유)
 	   	 		  ---------
 	   	 		  	*** 1) 추가
 	   	 		  		add(데이터)
 	   	 		  		add(int index, 데이터) => 속도가 느려진다.
 	   	 		  	2) 수정
 	   	 		  		set(int index, 데이터)
 	   	 		  	3) 삭제
 	   	 		  		remove(int index)
 	   	 		  	*** 4) 읽기
 	   	 		  		get(int index)
 	   	 		  	*** 5) 저장 갯수
 	   	 		  		size()
 	   	 		  	6) 전체 지우기
 	   	 		  		clear()
 	   	 		  	------------------------------------------
 */

import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // Object 들어갈 수 있다. (가급적이면 같은 데이터형을 첨부하는 것이 유리하다.)
		
		// 추가
		list.add("성준수"); // 0
		list.add("전영중"); // 1
		list.add("최종수"); // 2
		list.add("박병찬"); // 3
		list.add("기상호"); // 4
		
		// 출력
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i);	// 들어간 데이터가 Object이므로 Object 받아온다.
			System.out.println(i+"."+name);
		}
		
		// 추가
		System.out.println("======= 추가 =======");
		list.add(2, "주찬양");
		
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i);
			System.out.println(i+"."+name);
		}
		
		// 삭제 remove(int index)
		System.out.println("======= 삭제 =======");
		list.remove(3);
		
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i);
			System.out.println(i+"."+name);
		}
		
		// 수정 set(int index, 데이터)
		System.out.println("======= 수정 =======");
		list.set(2, "주찬냥");
		
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i);
			System.out.println(i+"."+name);
		}
		
		System.out.println("====== 저장갯수 ======");
		System.out.println("현재인원:"+list.size());
		
		System.out.println("====== 전체 지우기 ======");
		list.clear();
		System.out.println("현재인원:"+list.size());
		/*
		 		add()    => 데이터 추가
		 		size()   => 저장된 갯수
		 		get()    => 읽기
		 		remove() => 삭제
		 		set()    => 수정
		 		clear()  => 전체 데이터 비우기
		 */
	}

}











