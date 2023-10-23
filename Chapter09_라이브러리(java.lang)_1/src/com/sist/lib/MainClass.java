package com.sist.lib;
/*
 *		java.lang / java.util / java.text / java.io
 *		java.net  / java.sql
 *		-------------------------------------------- 표준 자바 => javax (웹, 윈도우)
 *			JDK 1.0 										   JDK 1.2
 *		=> java.lang => 보통 package가 다르면 import를 사용해서 클래스를 가지고 온다. (java.lang은 생략 가능)
 *		   ----------
 *			Object : 모든 클래스의 상위 클래스 (모든 클래스는 Object 상속을 받는다.)
 *					 = 모든 데이터형을 받을 수 있는 클래스
 *					 = 모든 데이터형을 모아서 관리
 *					 = Object[] obj={"", '', 10, 10.5, new A()};
 *					   -----------------------------------------
 *							ㅣ 자바스크립트 (배열 => Object이기 때문에...)
 *					= 기능만 가지고 있다. (메소드)
 *					= 주요 기능
 *						1) toString() : 자주 사용이 된다, 객체를 문자열화
 *							=> 오버라이딩이 가장 많이 되는 메소드
 *							=> 기본 출력 : 객체 주소
 *							=> 객체 출력할 깨 toString()이 생략되고 있다.
 *							=> String toString() => 원형
 *						2) clone() : 객체를 복제해서 새로운 객체 생성
 *							=> 스프링에서 주로 사용
 *							   -----
 *								ㅣ 싱글턴 (한 개의 객체 생성해서 재사용하는 방식)
 *										 ---- 필요시에는 여러 생성이 가능 (clone())
 *								ㅣ 응용 => JSP에서 (웹) => 알고리즘이 필요 없다.
 *								ㅣ 스프링 => 디자인 패턴 / 알고리즘
 *							=> Object clone() throws CloneSupportedException
 *							   ------  1. 예외처리 , 2. 형변환을 한다.
 *							=> 1. 원형 (리턴형, 메소드명, 매개변수)
 *							   2. 사용처 
 *							   3. 70~80%는 이미 만들어져 있다. (라이브러리)
 *								  20~30%가 사용자 정의 => 라이브러리+사용자정의 (조립식)
 *								  => 라이브러리 중심으로 프로그램 구현 => CBD
 *								  => 프로그래머 VS 개발자
 *										ㅣ		  ㅣ 없는 것을 만드는 사람 (C/C++)
 *						       이미 존재하는 기능을 조립 (자바, C#)
 *								  => 외국 : Python / C/C++ / Java / C#
 *								  => 한국 : Java / C/C++ / Python / C#
 *								  => 특성 : 미국, 유럽 => 아키텍쳐
 *										   인도 		=> 구현
 *										   일본      => 무선 발전
 *										   한국 		=> 유선 발전 => 웹 사이트 (자바)
 *						3) finalize() : 소멸자 (객체 메모리 해제시에 자동 호출)
 *										=> 멀티미디어 (스트리밍 서비스)
 *										=> 멜론 / 지니뮤직 / OTT
 *										=> 아프리카 TV
 *									protected void finalize()
 *						4) equals() : 객체 비교시에 주로 사용
 *						   -------- String에서 오버라이딩이 된 메소드를 주로 사용
 *								boolean equals(Object obj)
 *										------
 *										== 주소값을 비교한다 , 실제 메모리에 저장된 값
 *										equals : 객체 가지고 있는 데이터가 같은지 여부
 *
 *								문자열은 문자열 자체가 주소
 *									   ---------
 *										ㅣ 문자열이 같은 경우에는 같은 주소
 *										ㅣ 문자열은 같지만 다른 주소에 저장시에는 new를 이용한다.
 *			String : 문자열을 저장하는 데이터형 / 클래스형
 *					 ---------- 기능을 사용할 수 있다.
 *					 비교
 *					 ---
 *					  = equals => 같은 문자열인지 확인
 *						=> 로그인, 아이디 중복 체크
 *						=> 아이디 찾기, 비밀번호 찾기
 *						=> 상세보기
 *						=> 원형
 *							boolean equals(String s)
 *						=> 같은 문자열은 같은 주소를 가지고 있다.
 *						   new 이용하면 다른 주소에 저장
 *					  = startsWith / endsWith
 *						=> 원형
 *						boolean startsWith(String s)
 *							=> s로 시작하는 문자열
 *							=> 자동 완성기 => 대소문자 구분
 *						boolean endsWith(String s)
 *							=> s로 끝나는 문자열
 *							=> 사용빈도가 거의 없다.
 *					  = contains : 문자열 포함
 *							=> 자바스크립트도 동일
 *							** boolean contains(String s)
 *								=> 문자열중에 s가 포함여부
 *								=> 가장 많이 사용되는 메소드
 *					 => 문자열 분리
 *					  = split() : 원하는 문자별로 분리
 *						String[] split(",") => 크롤링
 *								 ----------
 *								  ㅣ 정규식을 이용한다.
 *						정규식은 => 표현법
 *						기호 ==> \\기호
 *						------------- \\를 꼭 붙여야 한다.
 *						= \\^ => ^A : A로 시작하는 모든 문자열 (startsWith)
 *						= \\$ => A$ : A로 끝나는 모든 문자열 (endsWith)
 *									  <img src^="http|https">
 *									  <img src$="jpg|png|gif">
 *						= \\+ => A+ : A로 시작해서 1개 이상 문자열
 *						= \\* => A* : A로 시작해서 0이상 문자열
 *						= \\| => a|b : a 또는 b
 *						= \\[] => 문자의 범위
 *								  [A-Z] 대문자 ^[A-Z]
 *								  [a-z] 소문자
 *								  [0-9] 숫자
 *								  [가-힣] 한글 전체
 *						= \\{} => 문자의 갯수
 *								  {3} , {1, 3}
 *					   => 변환
 *						replace
 *							=> String replace
 *					   => 문자 위치 찾기
 *						=> indexOf => 앞에서부터 찾기
 *						=> lastIndexOf => 뒤에서부터 찾기
 *						int indexOf(char c)
 *						int indexOf(String s)
 *						int lastIndexOf(char c)
 *						int lastIndexOf(String s)
 *						String s="Hello Java";
 *								=> char[]을 쉽게 제어가 가능하게 만든 클래스
 *								Hello Java
 *								0123456789
 *
 *								s.indexOf('a'); ==> 7
 *								s.lastIndexOf('a') ==> 9
 *								=================> 경로명 / 웹사이트 주소
 *					   => 기타
 *						length() : 문자의 갯수
 *						int length()
 *						trim() : 좌우 공백 제거
 *						String trim() => 사용자 입력이 있는 경우
 *						valueOf() : 모든 데이터형을 문자열 변환
 *						==> static String valueOf(int a)
 *							=> 모든 데이터형이 오버로딩
 *							=> String.valueOf(10) => "10"
 *						char charAt(int index)
 *						=> 한글자 잘라서 => 문자변환
 *						String concat(String s) : 문자열 결합
 *							   ------ +
 *								
 *			StringBuffer : 보완 (String을 보완)
 *				=> 문자열 결합 (최적화) => append()
 *			Wrapper : 기본타입의 데이터를 객체로 저장
 *					  ------ 쉽게 사용이 가능하게 만들기 위해 기능을 첨부한 클래스화
 * 317 page					정수형
 *						  *byte	   ==> Byte
 *					      short    ==> Short
 *						  *int     ==> Integer
 *						  *long    ==> Long
 *						실수형
 *						  float    ==> Float
 *						  *double  ==> Double
 *						논리형
 *						  *boolean ==> Boolean
 *						문자형
 *						  char     ==> Character
 *						-------------------------
 *						웹
 *						주소 => 유일하게 서버와 연결
 *						=> 사용자가 값을 서버로 전송
 *						   URL주소?page=10
 *								  ------- String page="10"
 *												 ---------
 *													int로 변경 후에 사용
 *													int a=Integer.parseInt(page)
 *													NUMBER , VARCHAR2 , DATE ...
 *						=> 박싱(오토박싱) / 언박싱
 *						Integer i=10; // 박싱
 *						int j=i; // 언박싱
 *						---------------------- 호환
 *			System
 *				println() : 화면 출력 *** 웹 
 *				--------------------
 *				gc() : 메모리 회수 요청
 *				exit() : 프로그램 종료
 *				-------------------- Application
 *			Math
 *				random() : 임의로 발생 => double(0.0~0.99)
 *				ceil(double a) : 올림메소드 => double
 *				ceil(165/10) => 16.0
 *				===> Math는 모든 메소드가 static으로 되어있다.
 *				Math.ceil...
 *			Thread : 한개 프로그램 안에서 여러개의 프로그램을 동시에 실행
 *			------ 게임 (시분할)
 *			 ㅣ 서버는 여러명이 접속시에 따로 동작이 가능하게 만들어준다.
 */
import java.io.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="Hello";
//		String s2="Hello";
//		// 주소가 같은 지 확인 ==> ==
//		String s3=new String("Hello");
//		// 새로운 메모리 공간에 Hello 저장
//		if(s1==s3)
//		{
//			System.out.println("s1과 s2는 같은 주소를 가지고 있다.");
//		}
//		else
//		{
//			System.out.println("s1과 s2는 다른 주소를 가지고 있다.");
//		}
//		
//		// 실제 저장된 데이터(문자열) ==> equals
//		if(s1.equals(s3))
//		{
//			System.out.println("s1과 s3은 메모리 저장 주소는 다르고 같은 가지고 있다.");
//		}
//		else
//		{
//			System.out.println("s1과 s3은 메모리 저장 주소는 다르고 다른 가지고 있다.");
//		}
//		
//		// 대소문자 구분 없이 비교 ==> 검색 equalsIgnoreCase
//		// 대소문자 구분 비교 equals : 로그인 (대소문자 구분 해야 한다.)
//		
//		String data="전영중|성준수|최종수|주찬양|기상호|박병찬";
//		String[] names=data.split("\\|"); // | 마다 잘라라
//		for(String name:names)
//		{
//			System.out.println(name);
//		}
//		
//		// => 다중 검색 => 가, 비, 지, 타, 임
//		
//		String data2="가비지타임";
//		String[] ss=data2.split("");
//		for(String s:ss)
//		{
//			System.out.println(s);
//		}
//		
//		String[] data3= {"a.png", "b.jpg", "c.gif", "d.java", "e.java", "f.zip"};
//		// 확장자 찾기
//		for(String s:data3)
//		{
//			String ss1=s.substring(s.lastIndexOf(""));
//			System.out.println(ss1);
//			if(ss1.equals("java"))
//			{
//				System.out.println(s);
//			}
//		}
		
		// 컴파일러에 알려만 준다. => 통과 요청 => CheckException
		// 에러시 복구가 어렵다 , 예외회피 , 선언 => throws
		// => 소스코딩을 자유롭게 한다.
		// 에러발생 시 => 복구 ==> try~catch
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			// String data="";
			StringBuffer data=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1); // -1 EOF end of file
			{
				data.append((char)i);
			}
			fr.close();
			System.out.println(data.toString());
			
		} catch (Exception e) {}
		// Exception or Throwable 사용
		
		
	}

}
