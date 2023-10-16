package com.sist.main;
/*
 * 		상속
 * 			자바 상속 => 1) 멤버변수 , 2) 메소드
 * 						  ------
 * 						   ㅣ static , private
 * 						 접근지정어                              ㅣ 상속을 받을 수는 있으나 접근은 불가능하다.
 * 						 --------                           -------
 * 						   ㅣ public / protected / default / private
 * 							 -------------------  -------- 패키지가 같아야 받을 수 있다.
 * 								ㅣ 패키지와 관계없이 받을 수 있다.
 * 						 => 생성자 , 초기화 블록은 받을 수 없다.
 * 		***** 클래스 여러개를 한개의 객체로 접근시에는 상위 클래스를 이용한다.
 * 			   Student
 * 			   ㅣ	ㅣ
 * 		  HStudent  UStudemt
 * 		
 * 		  HStudent h=new HStudent()
 * 		  UStudent u=new UStudent()
 * 		  -------------------------
 * 		  Student h=new HStudent()
 * 		  h=new UStudent()
 * 		
 * 		***** 모든 클래스를 한 개의 객체로 연결이 가능하다.
 * 			  ------------------------------------
 * 							   ㅣ
 * 				Object o=new MainClass()
 * 				o=new MainClass1()...
 * 				Object는 모든 데이터형을 묶어서 사용 가능하다.
 * 			  Object o=10;
 * 			  o=10.5;
 * 			  o=true; ...
 * 			  ------------ 자바의 매개변수가 객체인 경우
 * 						   Object => 형변환 => 제네릭스
 * 			=> 형식
 * 			class 하위클래스 extends 상위클래스
 * 			=> 단일 상속만 가능
 * 	
 * 			다중 상속은 불가능하다.
 * 			------------------
 * 			class Man
 * 			{
 * 				String name;
 * 				int age;
 * 			}
 * 			class Woman
 * 			{
 * 				String name;
 * 				int age;
 * 			}
 * 			class Human extends Man, Woman => 다중 상속
 * 			{
 * 				String name;
 * 				int age;
 * 				String name;
 * 				int age;
 * 			} => 자바에서는 존재하지 않는 코드이다. (다중상속 X)
 * 			
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
