/*
 * 		클래스 :
 * 			용도 1. 사용자 정의 데이터형 => 데이터형 클래스
 * 				   => 메모리 저장 / 메모리 읽기
 * 				   => 실무 / 프로젝트 => ~VO , ~DTO
 * 									  ---------- 캡슐화(데이터 보호)
 * 				   => 관련된 데이터를 묶어서 사용 => 관리가 용이 , 추가 쉽게
 * 				   => 초기화
 * 					   ㅣ
 * 					  초기화 블록
 * 					  ---------
 * 					  생성자
 * 					  ---------
 * 				2. 액션 클래스 => 메소드의 묶음
 * 			       => 게시판 (목록, 수정, 상세보기, 삭제, 추가, 검색)
 * 				3. 코드를 재사용
 * 				   코드 관리 용이
 * 				   신뢰성
 * 				   -------------- 객체 지향 프로그램
 * 			=> 기본 문법 => 활용
 * 			   => 자바 / 오라클 / HTML / CSS / JavaScript
 * 											-----------
 * 												 ㅣ
 * 											 Ajax/Jquery/VueJS/React
 * 											 => React-Query
 * 			   => JSP : 활용 => 사이트
 * 			   => 실무 : Spring / Spring-Boot
 * 				  => MSA (서버 분산) => DevOps (CI/CD) => Git
 * 					 --------------------------------------
 * 			=> 자바
 * 			   ---
 * 				1. 변수
 * 				2. 연산자
 * 				3. 제어문
 * 				-------- 기본 문법 (알파벳 => 단어)
 * 				4. 배열
 * 				5. 메소드
 * 				-------- 숙어
 * 				6. 클래스 --> 문장 (컴퓨터와 통신)
 * 				   ----
 * 				   => 1) 구성요소
 * 					  [접근지정어][옵션] class ClassName{
 * 						--------
 * 						변수 : 클래스 전체, 다른 클래스에서 사용이 가능
 * 							  (멤버변수)
 * 							  1) 기본형 : int , long , double , boolean
 * 							  2) 배열
 * 							  3) 클래스
 * 							=> 멤버변수 (인스턴스변수)
 * 								=> new 사용시마다 따로 저장하는 변수
 * 								class ClassName
 * 								{
 * 									int a;
 * 									int b;
 * 									String s;
 * 									int[] arr;
 * 									// 클래스 영역 전체에서 사용이 가능
 * 									// 다른 클래스에서 사용이 가능
 * 								}
 * 								=> 생성 시점
 * 								ClassName a=new ClassName()
 * 												-----------
 * 								ClassName b=new ClassName()
 * 												-----------
 * 								--a--
 * 
 * 								-----	----------
 * 											a => 0
 * 											b => 0
 * 											s => null
 * 											arr --> -------
 * 										---------- 
 * 													-------
 * 								--b--
 * 
 * 								-----	----------
 * 											a => 0
 * 											b => 0
 * 											s => => null
 * 											arr --> -------
 * 										---------- 
 * 													-------
 * 							=> 공유변수 (클래스변수)
 * 								=> 메모리 공간이 1개 (오라클의 저장된 변수는 전부 공유변수)
 * 								=> static
 * 						--------
 * 						생성자
 * 						초기화블록
 * 
 * 						=> 변수의 초기화
 * 						   1) 기본 디폴트 초기화
 * 							  class ClassName
 * 							  {
 * 									int a; => 0
 * 									long b; => 0L
 * 									double c; => 0.0
 * 									float f; => 0.0F
 * 									boolean bb; => false
 * 									int[] arr; => null
 * 									String s; => null
 * 							  }
 * 						   2) 명시적 초기화 => 우선시
 * 							  class ClassName
 * 							  {
 * 									int a=10;
 * 									String name="홍길동";
 * 							  }
 * 							  파일 읽기 / 크롤링 / 오라클 / 제어문
 * 							  ------------------------------
 * 							  => 클래그 블록에서는 사용이 불가능
 * 							  class ClassName{
 * 								int[] arr=new int[5];
 * 							    for(int i=0;i<arr.length;i++)
 * 								{
 * 									arr[i]=(int)(Math.random()*100);
 * 								}
 * 								------------------------------------ 불가능한 코드 (클래스는 선언먼 가능하다.)
 * 								int a; => 선언
 * 								a=100; => 구현 (불가능)
 * 								int a=100; => 선언과 동시에 구현은 가능하다.
 * 
 * 								= 초기화 블록
 * 								= 생성자
 * 								----------- 동시에 사용하는 빈도는 거의 없다.
 * 							  }
 * 
 * 							  class A
 * 							  {
 * 									int a=100;
 * 									{
 * 										a=1000; => 초기화블록
 * 									}
 * 									A(){
 * 										a=2000; => 생성자
 * 									}
 * 							  }
 * 							  a=100 => a=1000 => a=2000 	===> 이런 경우는 거의 없다.
 * 
 * 							클래스의 구성요소
 * 								데이터 저장 : 변수(멤버변수) *****
 * 								데이터 활용 : 메소드
 * 								데이터 값 주입 : 생성자
 * 						--------
 * 						메소드
 * 						--------

 * 					  }
 * 			class Sawon
 * 			{
 * 				// 사원 관리에 필요한 변수 설정
 * 			}
 * 			class SawonSystem
 * 			{	
 *				// 사원 관리 기능 처리
 *				sawon[] sawons=new Sawon[10];
 *
 *			}
 *
 *			A=> SawonSystem s=new SawonSystem();
 *				sawons[1]=A
 *			B=> SawonSystem s=new SawonSystem();
 *				sawons[1]=?
 *			C=> SawonSystem s=new SawonSystem();
 *				sawons[1]=?							===> A의 sawons[1]이 A라고 해서 B, C도 바뀌는 것은 아니다.
 *
 *			class SawonSystem
 * 			{	
 *				static sawon[] sawons=new Sawon[10];
 *			}
 *
 *			A=> SawonSystem s=new SawonSystem();
 *				sawons[1]=A							===> static을 사용하면 하나만 바껴도 전부 바뀐다.
 *
 *			*** 자바는 모든 코딩 (변수, 메소드...) => 클래스 영역을 벗어나지 않는다.
 *				=> static변수는 지역변수로는 사용이 불가능
 *				   클래스 블록에서만 사용이 가능
 *			    예) 
 *					class ClassName
 *					{
 *						static int a;
 *						void aaa()
 *						{
 *							static int b; ==> 오류 / static은 class안에서만 선언 가능
 *						}
 *					}
 *	
 *					class A
 *					{
 *						ClassName.a // 다른 클래스 접근
 *						ClassName aa=new ClassName();
 *						aa.b
 *					}
 *	
 *					한개의 파일 => class를 여러개 사용이 가능
 *					--------- class를 한개만 사용 (권장)
 *
 *					자바 코딩
 *					-------
 *					pakage => 소속 => 한번만 사용이 가능
 *					import => 외부에 있는 클래스를 불러올 때
 *							  라이브러리 / 사용자 정의 클래스
 *					class A
 *					{
 *						=> A.class
 *					}
 *					class B
 *					{
 *						반드시 => main()
 *						=> B.class
 *					}                     ==> A, B 따로 컴파일된다.
 *			= 생성자
 *				=> 클래스를 메모리에 저장할 때 호출되는 메소드
 *				   A a=new A()
 *						   --- 생성자
 *				   Scanner scan=new Scanner()
 *								 	---------
 *				=> 특징
 *					= 클래스명과 동일
 *						class A => A()
 *						class B => B()...
 *					= 리턴형이 없다.
 *						class A
 *							A() => 생성자 void A() int A() => 일반 메소드
 *										-----    ----
 *					= 여러개를 만들 수 있다
 *					  ----- 매개변수의 갯수나 데이터형이 다르다.
 *							---------------------------- 오버로딩
 *					= 상속에서 예외
 *					= 생성자는 필요시에 사용
 *					  ----- 서버 연결 / 데이터 연결 / 자동 로그인
 *					  ----- 생성자는 반드시 필요하다.
 *						    -------------------
 *								ㅣ
 *							생성자를 만들지 않는 경우에 자동으로 생성자를 만들어준다.
 *							--------------------------------------------
 *							=> 생성자 (디폴트 생성자)
 *							   ----------------- 매개변수가 없다.
 *				=> 용도
 *					=> 멤버변수의 초기화 (명시적인 초기화가 불가능할 때) 
 *					=> 윈도우 초기화 , 웹 초기화 , 서버 연결 , ...오라클 연결
 *					=> 생성자는 한 번만 호출이 가능
 *					=> 생성자 호출에는 반드시
 *						new 생성자()
 *				=> 오버로딩
 *					=> 생성자는 여러개 만들 수 있다.
 *					=> 생성자명이 동일
 *					=> 매개변수의 갯수 / 매개변수의 데이터형이 다르다.
 *				    class A
 *					A(int a)
 *					A(int a, int b)
 *					...
 *					---------------
 *					class A
 *					{	
 *						A() 자동생성
 *					}
 *					class A
 *					{
 *							A()A{} 자동생성(X)
 *					}
 *					class A
 *					{ A(int a){}
 *					}
 *					매개변수가 있는 경우도 생성자다.
 */
// pakage import 를 제외하고는 class 위에 올라갈 수 있는 것은 없다.
class Sawon{
	int sabun;
	String name;
	String dept, job, loc;
	// Sawon()][0] ==> Sawon s=new Sawon()
	Sawon(){
		sabun=1;
		name="홍길동";
		dept="개발부";
		job="대리";
		loc="서울";
	}
	// 매개변수 생성자
	Sawon(int s, String name, String dept, String job, String loc)
	{
		System.out.println("this="+this); // *** this : 클래스 자신의 객체명
		sabun=s;						  // 변수명이 중복될 경우에는 반드시 this를 사용한다.
		this.name=name;
		this.dept=dept;
		this.job=job;
		this.loc=loc;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		System.out.println("사번:"+sa.sabun);
		System.out.println("이름:"+sa.name);
		
		Sawon sa1=new Sawon(2, "박문수", "영업부", "과장", "경기");
		System.out.println("사번:"+sa1.sabun);
		System.out.println("이름:"+sa1.name);
		
		Sawon sa2=new Sawon(2, "박문수", "영업부", "과장", "경기");
		System.out.println("사번:"+sa2.sabun);
		System.out.println("이름:"+sa2.name);
		System.out.println("부서:"+sa2.dept);

		/*
		 *  Sawon s=new Sawon();
		 *  	 --- 메모리 주소 => 주소를 활용 (참조변수)
		 *  JVM
		 *  	this=s; => 자신 객체
		 *  	1) 멤버변수와 지역변수가 같은 경우 => 구분
		 *  	2) 모든 클래스는 this를 가지고 있다.
		 *  				  ---- static => JSP(page)
		 */
	}

}
