package com.sist.main;
/*
 * 		인터페이스
 * 			기본문법) 
 * 				변수는 사용할 수 없다. (상수만 사용 가능)
 * 				int i; => 오류
 * 				int i=10; ==> 값을 지정해줘야 한다. => 생략된 것이 있다.
 * 				--------- (public static final) int i=10;
 * 						  ---------------------
 * 						  => static final int i=10;
 * 							 // 상수
 * 							 final int i=10;
 * 							 // 상수형 변수
 * 							 int i=10;
 * 							 // 변수
 * 				메소드
 * 					구현이 안된 메소드 : 구현 내용이 여러개인 경우
 * 					(public abstract) void display();
 * 					public (abstract) void display();
 * 					구현이 된 메소드 : 공통으로 사용되는 부분 정의
 * 						=> 새로운 기능 추가
 * 					(public) default void aaa(){}
 * 					(public) static void bbb(){}
 * 					==> 메소드나 상수를 선언 => 무조건 public 
 * 				
 * 				상속 : => 인터페이스도 클래스이다.
 * 						 ------------------ 상속시 상위 클래스다.
 * 						 extends
 * 						 implements
 * 						 ---------- 상속
 * 				다중 상속 => , 로 구분
 * 
 * 				interface ======= interface
 * 						  extends
 * 				interface ========== class
 * 						  implements
 * 
 * 				class A
 * 				interface B
 * 				interface C
 * 				class D extends A implements B, C 		// 다중상속
 * 				{		-------   ----------
 * 						  확장       구현한다.
 * 				}
 */
//interface A
//{
//	// public static final int a = 0;
//	void aaa();
//	void bbb();
//	void ccc();
//	void ddd();
//	// void eee(); => 새로운 기능을 추가하면 오류 발생
//	default void fff() {} // 이렇게 추가하면 오류 안생긴다.
//}
//class B implements A
//{
//
//	@Override
//	public void aaa() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void bbb() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void ccc() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void ddd() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}

// 인터페이스와 인터페이스간의 상속
interface A
{
	void aaa();
}
interface B //extends A
{
	void bbb();
}

class C implements B,A // 다중상속도 가능하다.
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new C();
//		b.aaa();
//		b.bbb();
	}

}
