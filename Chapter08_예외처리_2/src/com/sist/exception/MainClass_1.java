package com.sist.exception;
/*
 * 		=> 캡슐화 : private 변수 / 읽기 / 쓰기 메소드 추가
 * 		=> 재사용
 * 		   상속(is-a) / 포함(has-a)
 * 		=> 수정 / 추가 => 다형성
 * 		   오버라이딩 / 오버로딩
 * 		--------------------------------------------
 * 		클래스의 종류
 * 		----------
 * 			-------------------- 미완성 클래스 (미완성 => 메소드 구현이 안된 상태)
 * 								 => 단점 : 메모리 할당이 불가능하다. (new 사용 불가)
 * 								 => 상속을 내려서 구현 후에 사용 ==> 오버라이딩
 * 								 => 관련된 클래스를 한개의 객체명으로 관리
 * 			= 추상 클래스 : 단일 상속 , 멤버변수 , 생성자 , 구현된 메소드 , 구현이 안된 메소드
 * 			= 인터페이스 : 다중상속 , 상수만 사용 가능 , 구현이 안된 메소드 중심
 * 						=> 구현된 메소드 : default / static
 * 			------------------------------
 * 			=> 상속
 * 			   class 	 =====>	  class
 * 			   		   	   ㅣ
 * 						 extends
 * 			   
 * 			   interface =====> interface
 * 						   ㅣ
 * 						 extends
 * 
 * 			   interface =====> class	
 * 						   ㅣ
 * 					   implements
 * 			-------------------------------
 * 			class A
 * 			class C
 * 			class B extends A, C ==> 오류
 * 
 * 			class A
 * 			class C extends A
 * 			class B extends C    ==> 정상 코드
 * 			
 * 			interface A
 * 			interface B extends A
 * 			interface C extends B
 * 			interface D extends A, B ==> 가장 많이 사용 (다중 상속)
 * 
 * 			class A
 * 			interface B
 * 			interface C
 * 			class D extends A implements B, C
 * 
 * 			interface A
 * 			interface B
 * 			class C implements A, B
 * 
 * 			interface ==> Container역할 , Controller역할
 * 							    ㅣ			   ㅣ
 * 							묶어주는 역할		찾기, 제어
 * 						  ----------------------------
 * 							ㅣ 스프링 ==>  AOP
 * 						  => 소프트웨어 용어
 */
public class MainClass_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
