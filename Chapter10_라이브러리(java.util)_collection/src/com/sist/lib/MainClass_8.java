package com.sist.lib;
/*
 		= 중복 데이터 ==> ArrayList
 		= 중복이 없는 데이터 => HashSet
 		= 두 개를 저장해서 찾는다. => HashMap : 클래스 찾기 , SQL문장 찾기
 								 ------- Annotation
 		---------------------------------
 		
 	349 page	Map => 인터페이스
 			   -----
 			   	 ㅣ
 		   -------------
 		   ㅣ		   ㅣ
 		Hashtable	HashMap => Hashtable 을 보완
 							   => 동기 / 비동기
 							   => Ajax
 							   
 		특징
 		 = 두개를 동시에 저장 (key, value)
 		 = key는 중복할 수 없다. , value 는 중복 가능
 		   예) ("id" , "hong")
 		      ("id", "shim") ==> get("id")
 		 = 사용처
 		   웹에서 제공하는 90% 클래스 => Map을 이용하고 있다.
 		   => 데이터 전송
 		   	  HttpServletRequest
 		   	  ------------------ 서버에서 브라우저 전송
 		   	  setAttribute("id" , "hong")
 		   	  setAttribute("pwd" , "1234")
 		   	  => session / cookie
 		   	  			   ------ 최신 방문
 		   => 라이브러리
 		   	  Spring ==> HashMap => Key , 클래스 객체
 		   	  	=> 클래스 관리 => 클래스 찾기 (DL)
 		   	  				    -------- getBean("key")
 		   	  	   객체의 생명주기 => 생성 ~ 소멸
 		   	  	   => WEB (라이브러리 일부)
 		   	  MyBatis ==> 데이터베이스와 관련 => ORM
 		   	   => SQL문장을 관리 => key
 		   	   ---------------> 등록 (XML, Annotation)
 		   => 주요메소드
 		   		1) 저장 => put("key", value)
 		   					  ----- 반드시 문자로 시작한다.
 		   		2) 읽기 => get(key)
 		   		--------------------------------------
 		   		프로그램 : 데이터가 많이 있다.
 		   		  => 구분
 		   		  ArrayList => 인덱스
 		   		  Set => 중복 없다.
 		   		  Map => key
 		   		  오라클 => Primary Key
 		   		  ----------------------- 졍형화 데이터
 		   		  비정형화 데이터 => 분석 => 시각화
 		   		  				 ------------- 정형화된 데이터로 변경
 		   		  				 	ㅣ
 		   		  				  빅데이터 => 예측 (AI)
 		   		  Application => exe
 		   		  웹/모바일 => java
 		   		  			  ㅣ
 		   		  			 kotlin
 		   		  분석 = python
 		   		  실시간 = 스칼라
 */

import java.util.*;
public class MainClass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new HashMap<String, String>(); // Map은 2개가 들어간다. => <key, 값>
		map.put("id", "chanyang");
		map.put("pwd", "0909");
		map.put("name", "주찬양");
		map.put("sex", "남자");
		map.put("addr", "서울");
		map.put("phone", "010-0909-0428");
		
//		System.out.println("ID: "+map.get("id"));
//		System.out.println("PWD: "+map.get("pwd"));
//		System.out.println("NAME: "+map.get("name"));
//		System.out.println("SEX: "+map.get("sex"));
//		System.out.println("ADDR: "+map.get("addr"));
//		System.out.println("PHONE: "+map.get("phone"));
		
		Set<String>	set=map.keySet();
		System.out.println(set);
		for(String key:set)
		{
			System.out.println(key.toUpperCase()+":"+map.get(key));
		}
		// 읽는 순서는 저장된 순이 아니다.
		for(String s:map.values())
		{
			System.out.println(s);
		}
		/*
		 		clear()   : 전체 삭제 ==> TRUNCATE
		 		get()     : 실제 데이터를 읽어온다.
		 		put()     : 데이터를 저장할 때 사용한다.
		 		isEmpty() : 데이터가 있는지 여부
		 		size()    : 
		 */
	}

}










