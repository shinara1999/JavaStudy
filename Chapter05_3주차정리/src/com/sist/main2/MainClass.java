package com.sist.main2;
/*
 * 		static 메소드 / 인스턴스 메소드
 * 		------------   => 인스턴스나 static 상관없이 사용 가능
 * 			ㅣ static 변수 , static 메소드를 호출
 * 			  인스턴스 변수 , 인스턴스 메소드는 반드시 객체 생성 후에 사용할 수 있다.
 * 
 * 		=> class 생성 => 객체 생성 => 자동으로 this (자신의 객체)
 * 										   ㅣ
 * 										멤버변수와 지역변수의 구분
 * 									** 변수가 동일한 이름이면 지역변수 우선 순위
 * 									** 지역변수 , 매개변수 찾고 => 없는 경우에는 멤버변수에서 찾는다.
 * 
 * 		예)
 * 			class A
 * 			{
 * 				int a=20; => 메모리 저장 위치가 다르다.
 * 							 Heap
 * 				void display()
 * 				{
 * 					int a=10; => Stack
 * 					sysout(this.a);
 * 						       --- 지역변수
 * 				}
 * 				void display(int a)
 * 				{			------- 지역변수의 일종 Stack
 * 					sysout(this.a);
 * 				}
 * 			}
 * 
 * 			===> this : 객체
 * 				 this() => 생성자 (자신의 생성자를 호출할때 사용)
 * 				 ------
 * 					=> 생성자에서 사용 가능
 * 				    => 생성자 첫줄에 온다.
 * 			class A
 * 			{
 * 				A()
 * 				{
 * 				}
 * 				A(int a)
 * 				{
 * 					sysout("aaa");
 * 					this(); => 오류 발생, this는 항상 첫줄에 와야한다.
 * 				}
 * 			}
 */
class Student
{
	int hakbun;
	String name;
	String sex;
	
	public Student() {
		System.out.println("디폴트 생성자 호출...");
		hakbun=1;
		// Student가 가지고 있는 멤버변수
		name="홍길동";
		sex="남자";
		// 지역변수와 충돌이 없는 경우에는 this. 생략이 가능하다.
	}
	
	public Student(int hakbun, String name)
	{
		// 구분자 (멤버변수와 지역변수를 구분할 때 쓰인다.)
		this.hakbun=hakbun;
		this.name=name;
	}
	
	public Student(String sex)
	{
		this();
		this.sex=sex;
	}
	
	public Student(int h, String n, String s)
	{
		this(s);
//		hakbun=h;
//		name=n;
//		sex=s;
	}
	
	public void print()
	{
		System.out.println("학번:"+hakbun);
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
	}
	// 오버로딩 => 같은 메소드명으로 새로운 기능을 만든다.
	/*
	 * 		void display(int a, int b, int c)
	 * 		void display(char c, double d, int a)
	 * 		void display(double d, double d1, double d2)
	 * 
	 * 		display(10.5, 'A', 100) => double , char , int
	 */
}
public class MainClass {
	void display(int a, int b, int c)
	{
		System.out.println("display(int a, int b, int c) Call...");
	}
	void display(char c, double d, int a)
	{
		System.out.println("void display(char c, double d, int a) Call...");
	}
	void display(double d, int d1, int d2)
	{
		System.out.println("void display(double d, int d1, int d2) Call");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass m=new MainClass();
		m.display(10.5, 'A', 100);
		
		// default 생성자 호출
		Student s1=new Student();
		s1.print();
		Student s2=new Student("여자");
		s2.print();
		// 학번 1, name 홍길동, 여자
		// this(); 추가
		
		Student s3=new Student(2, "심청이");
		s3.print();
		Student s4=new Student(2, "심청이", "여자");
		s4.print();
	}

}
