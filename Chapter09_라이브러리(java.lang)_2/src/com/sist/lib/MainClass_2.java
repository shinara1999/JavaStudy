package com.sist.lib;
/*
  		Wrapper : 기본 데이터형을 클래스화
  			=> 기본 데이터형에 기능을 부여해서 쉽게 사용 가능
  			int ==> Integer
  			long ==> Long
  			double ==> Double
  			boolean ==> Boolean
  			-------------------- 웹에서 주로 사용
  			
  			=> 웹/원도우 => 모든 데이터값 문자열
  						  ----------------
  						  문자열을 정수, 실수, 논리형
  			=> Double.parseDouble("4.5")
  			   Integer.parseInt("10") => int page=10
  			   Boolean.parseBoolean("true") => true
  			   		   --------------------
  			   		   HTML => checkbox
  			=> 제네릭 사용시 => 데이터형을 통일 => 원하는 데이터형만 집어넣을 수 있다.
  			   ----- 메소드 => 리턴형 , 매개변수
  			   				 -------------- Object
  			   <Integer> => 클래스 <int>(X)
  			   ---------
  			   배열 => 저장 (클래스) => Object
  			   
  			   class Box<T> ==> T(Object)
  			   {
  			   		T t=new T();
  			   		void setT(T t){}
  			   		T getT()
  			   		{
  			   			return T;
  			   		}
  			   	}
  			   	
  			   	Box<String>
  			   	---------------------------
  			   	*** 오토박싱 / 언박싱
  			   	Integer i=10; => int와 똑같이 사용 가능하다.
  			   	int j=i;
 */
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer i=10; // 오토박싱
		int j=i; // 언박싱
		System.out.println(i);
		
//		List<Integer> list=new ArrayList<Integer>();
		
//		list.add("a");
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
//		list.add(10.5);
//		list.add(10);
//		list.add('A');
//		list.add(new MainClass());
		
		
	}

}
