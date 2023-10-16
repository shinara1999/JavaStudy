package com.sist.main2;
// 메모리 => 상위클래스 => 상속받은 클래스 메모리 할당
class Super
{
	int a=10;
	public Super()
	{
		this.a=a;
		System.out.println("Super 생성자 호출...");
	}
}
class Sub extends Super
{
	int a;
	public Sub()
	{
		super(); // 상위 클래스의 매개변수가 있는 생성자는 반드시 호출해야 한다.
		// 생략 가능 (자동 추가 된다.)
		// 생략 가능한 경우 => 상위 클래스가 디폴트 생성자
		a=1000;
		System.out.println("Sub 생성자 호출...");
		System.out.println("Sub:a="+this.a); // this는 자신을 나타내는 객체명
		System.out.println("Super:a="+super.a); // super는 상위클래스의 객체
		
		/*
		 * 		heap
		 * 		-----------------
		 * 		----super-----
		 * 			 a => super.a (Super의 a값)
		 * 		--------------
		 * 
		 * 		----this------
		 * 			 a => this.a (Sub의 a값)
		 * 		--------------
		 * 		-----------------
		 */
	}
}
/*	217 page
 * 
 * 		클래스 중 final 클래스
 * 				-----------
 * 				public final class ()
 * 								  --- 확장이 안되는 클래스
 * 								  --- 상속을 받을 수 없다
 * 								  --- String , Math , System ... (java.lang)
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();

	}

}
