package com.sist.main;
class A
{
	int a=10, b=20;
	void aaa()
	{
		System.out.println("A:aaa() Call...");
	}
}	
class B extends A
{
	int a=100, b=200;
	int c, d;
	// 오버라이딩 => 상속받은 메소드를 변경
	void bbb()
	{
		System.out.println("B:bbb() Call...");
	}
}

// B클래스는 A클래스에 있는 모든것을 사용할 수 있다.
// A클래스는 B클래스에 있는 모든것을 사용할 수 없다.
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		System.out.println("a=>"+a.a);
		System.out.println("a=>"+a.b);
//		System.out.println("a=>"+a.c); => 오류 발생 : B클래스에 있는 변수, 메소드는 사용 불가
//		System.out.println("a=>"+a.d);
		
		B b=new B();
		System.out.println("b=>"+b.a); // B가 상위클래스 : 상속받은 클래스는 전부 사용 가능
		System.out.println("b=>"+b.b);
		System.out.println("b=>"+b.c);
		System.out.println("b=>"+b.d);
		b.aaa();
		b.bbb();
		
		// A > B => 클래스의 크기는 상속 내린 클래스가 항상 크다.
		/*
		 * 		A a=new A();
		 * 		B b=new A(); // 오류 발생
		 */
		
		A aa=new B();
		
		System.out.println("aa.a=>"+aa.a); // 10 // 오버라이딩 된 값을 호출한다.
		System.out.println("aa.a=>"+aa.b); // 20
		aa.aaa();
		
		B bb=(B)aa; // 상위클래스 => 하위클래스로 받는 경우 => 형변환
		System.out.println("bb.b=>"+bb.a);
		System.out.println("bb.b=>"+bb.b);
		System.out.println("bb.b=>"+bb.c);
		System.out.println("bb.b=>"+bb.d);
		bb.aaa();
		bb.bbb();
		
		/*
		 * 		상속 : 하위클래스로 접근하는 것이 기본.
		 * 			  -------------------------
		 * 				class A
		 * 				class B extends A
		 * 				B b=new B();
		 * 				= static , private , 생성자 , 초기화블록
		 * 				= 상위클래스는 공통적으로 사용하는 메소드 , 변수
		 * 				A => 여러개를 한개의 클래스로 제어
		 */
		
		/*
		 * 		*** 단일 상속만 가능
		 * 		상위 클래스는 하위 클래스가 가지고있는 변수, 메소드 사용이 불가능
		 * 		상위 클래스는 하위 클래스가 가지고있는 변수, 메소드 사용이 가능
		 * 					=> 변수 (static) 상속은 아니고 사용 가능
		 * 					=> 공통으로 사용 가능
		 * 
		 * 		객체 생성
		 * 		하위 클래스로 객체 생성
		 * 		class A
		 * 		class B extends A;
		 * 
		 * 		=> B b=new B();
		 * 		=> A a=new B(); 		=> 여러개의 클래스를 한개로 묶어서 사용
		 * 		=> a bb=new B();
		 * 
		 * 		   B cc=(A)bb;
		 * 
		 * 		class 동물
		 * 		class 사람 extends 동물
		 * 		class 개 extends 동물
		 * 		class 고양이 extends 동물
		 * 
		 * 		동물 ani=new 사람();
		 * 
		 * 		ani=new 개();
		 * 		ani=new 고양이();
		 * 
		 * 
		 * 
		 */

	}

}
