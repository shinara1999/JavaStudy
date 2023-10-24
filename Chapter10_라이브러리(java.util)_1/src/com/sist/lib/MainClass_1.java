package com.sist.lib;
/*
 		1. java.util
 			=> 프로그램에서 많이 사용되는 유용한 클래스의 집합
 			=> 반드시 import 사용
 			1) 날짜
 				Date/Calendar => Date에 없는 기능 확장 Calendar
 					 -------- 예약
 			2) 문자열 분해
 				StringTokenizer
 			3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 			   ------ 컬렉션 (*****)
 			   		  ----- 가변형 (크기를 결정하지 않는다.)
 			   표준화 (모든 개발자가 동일하게 사용한다.)
 			   => CRUD => 읽기 / 쓰기 / 수정 / 삭제
 			   	  Collection => interface
 			   	       l
 		---------------------------------
 		ㅣ			   ㅣ				ㅣ
 	    List		  Set   		   Map
 	    		= 순서를 자기고 있지 않다.	= 순서가 없다.
 	    		= 데이터 중복 허용 Z		= 키, 값으로 저장
 	    								= 데이터 중복 허용
 	    								= 키는 중복할 수 없다.
 	    								= 클래스 관리(스프링, 웹)
 	    = 데이터의 중복 허용
 	    = 순서를 가지고 있다 (인덱스 이용)
 	    = 데이터베이스 사용시 주로 사용(***)
 	    
 	    List
 	    ----
 	     ㅣ List를 구현한 클래스
 	     --------------------------------- Stack
 	     ㅣ				ㅣ				 ㅣ
 	    **ArrayList	  Vector	   LinkedList
 	     								 ㅣ
 	     							   Queue
 	      ArrayList : 오라클에 있는 데이터 저장해서 제어
 	      			  ---------------------------
 	      			  		ㅣ
 	      			  	  브라우저
 	      			  	=> 데이터베이스 관련 => 비동기 방식
 	      Vector : 동기 방식 => 네트워크 (사용자 정보 => IP, PORT)
 	      	*** Vector의 단점을 보완한 것 => ArrayList
 	      LinkedList : C호환 => 수정, 삭제, 추가
 	      
 	      *** 메소드가 동일
 	      
 	     Set							   
 	     ---
 	      ㅣ Set을 구현하는 클래스
 	     -----------
 	     ㅣ		   ㅣ
 	     **HashSet TreeSet
 	     
 	     Map
 	     ---
 	      ㅣ Map을 구현하는 클래스
 	     -----------
 	     ㅣ		   ㅣ
 	     **HashMap Hashtable
 	     
 	     Random : 난수 발생
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
