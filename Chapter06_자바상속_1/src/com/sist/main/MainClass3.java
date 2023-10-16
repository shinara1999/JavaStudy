package com.sist.main;
/*
 * 		=> 객체 지향
 * 		   -------
 * 				1. 데이터 손실 방지 : 캡슐화 (변수 : private (은닉화) , 기능 => 처리)
 * 									  --- 저장 / 읽기 => setter / getter
 * 									  --- HTML(Jsoup)
 * 				2. 재사용 : 상속 / 포함 (***)
 * 				3. 수정 / 추가 : 유지보수
 * 				   --------- 다형성 (오버라이딩 , 오버로딩)
 * 		
 * 			상속 : 재사용
 * 		    --- 상위 클래스 : 상속을 내리는 클래스 => 공통적으로 사용하는 내용 (변수 , 메소드)
 * 				하위 클래스 : 상속을 받은 클래스 => 재사용 => 확장 (extends)
 * 				-------- 하위 클래스 (확장)
 * 				   ㅣ 여러개의 하위 클래스를 묶어서 사용 => 상위 클래스를 이용한다.
 * 				   ㅣ 단일 상속을 기본으로 한다. 키워드 (extends)	
 * 				===> 있는 그대로 사용 (변경 없이) => 포함	
 * 				class Window
 * 				{
 * 					JFrame fr=new JFrame() => ***
 * 				}
 * 				===> 변경 해서 사용 => 상속
 * 				class Window extends JFrame
 * 				=> new를 이용하지 않아도 메모리 할당이 가능 (리플렉션)
 * 
 * 			사용법
 * 				class A
 * 				class C
 * 				class B extends A, C => 오류 (C언어, React)
 * 				-----------------------------------------
 * 				class A
 * 				class C extends A => A, C
 * 				class B extends C => A, C, B
 * 				=> 상속을 받은 클래스가 메모리는 크다.
 * 				=> 클래스의 크기는 위로 올라갈수록 크다. (범위) => 공통 기반, 
 * 
 * 							생물
 * 							 ㅣ
 * 						---------
 * 					   ㅣ       	ㅣ
 * 					  동물 	   식물
 * 					   ㅣ
 * 				---------------
 * 			   ㅣ   ㅣ     ㅣ   ㅣ
 * 			포유류  양서류  조류  ...
 * 			 ㅣ
 * 		------------	
 * 		...
 * 		=> 상속 (위로 올라갈수록 커진다.)
 * 			class A
 * 			class B extends A    A>B => is-a (상속)
 * 
 * 			class A
 * 			class B
 * 			{
 * 				A a=new A()    B>A => has-a (포함)
 * 			}
 * 
 * 		=> 상속 : static : 상속은 없다. => 공통 사용이 가능
 * 				 private : 상속은 가능 => 접근이 불가능
 * 				 -------
 * 				 생성자
 * 				 초기화 블록 ==> 예외
 * 				 -------
 * 		==> 메모리 할당
 * 			여러개를 묶어서 사용 => 상위 클래스로 메모리 할당
 * 			확장된 클래스로 메모리 할당
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
