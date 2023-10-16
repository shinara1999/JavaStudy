package com.sist.main;
/*
 * 		1. 상속
 * 			=> 멤버변수 , ***메소드(기능 => 상속)
 * 			   ------
 * 				ㅣ 접근지정어 (private , default(패키지가 다른 경우))
 * 				=> 메소드를 재사용하거나 변경해서 사용 (기능)
 * 				=> 객체 지향 관련 => 메소드
 * 				=> 라이브러리는 변수가 없다. => 메소드
 * 							 --- 상수
 * 			=> 형식
 * 				단일 상속만 가능
 * 				class SubClass extends SuperClass
 * 				{			   -------	
 * 								  기존의 클래스를 확장(수정, 추가)
 * 
 * 					SuperClass가 가지고있는 모든 메소드 사용 가능
 * 					=> 변경해서 사용 가능 (오버라이딩)
 * 				}
 * 			=> 호출
 * 			 	class A
 * 				class B extends A
 * 					 -- Sub    -- Super 	=> *** 상속을 내린 클래스의 크기가 더 크다.
 * 			*** 모즌 클래스의 상위 클래스는 Object
 * 				=> 자바에서 지원하는 라이브러리의 메소드 => Object를 리턴한다.
 * 
 * 			=> 확장 (클래스 사용시에는 확장된 클래스를 사용한다.)
 * 			// A a=new A() => 활용
 * 			B b=new B(); // 기본
 * 			A a=new B(); // 특별한 경우에 사용
 * 							=> A로부터 상속을 받은 클래스를 묶어서
 * 							=> 스프링
 * 			------------
 * 				ㅣ 카페 => 게시판
 * 				*** 상위 클래스는 하위 클래스에 있는 변수/메소드에 접근이 불가능하다.
 * 			B b=new B();
 * 			A a=new B();
 * 
 * 			class A
 * 			{
 * 				int a, b;
 * 				void aaa(){}
 * 				void bbb(){}
 * 				void ccc(){}
 * 			}
 * 			class B extends A
 * 			{
 * 				int c, d;
 * 			}
 * 			A a=new A();
 * 			B b=new B();
 * 			A c=new B(); => A가 가지고 있는 변수 B에서 오버라이딩된 메소드 호출
 * 				=> c는 접근 불가능 : 변수 (c, d) 메소드 (ccc())
 * 				
 */
class A
{
	int a, b;
	void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
	void bbb()
	{
		System.out.println("A:bbb() Call...");
	}
}
class B extends A
{
	int a=100, b=200, c=300, d=400;
	void aaa()
	{
		System.out.println("B:aaa() Call...");
	}
	void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
	void ccc()
	{
		System.out.println("B:ccc() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);
		aa.aaa();
		aa.bbb();
		// 가장 많이 사용 (70%)
		B bb=new B();
		System.out.println("bb.b="+bb.a);
		System.out.println("bb.b="+bb.b);
		System.out.println("bb.b="+bb.c);
		System.out.println("bb.b="+bb.d);
		bb.aaa();
		bb.bbb();
		bb.ccc();
		// 인터페이스 (클래스 여러개 묶어서 사용) (30%)
		A cc=new B();
		System.out.println("cc.a="+cc.a);
		System.out.println("cc.b="+cc.b);
		cc.aaa();
		cc.bbb();
		
		// 멤버변수 : 클래스 , 메소드 : 생성자 타입
	}

}
