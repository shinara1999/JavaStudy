package com.sist.exception;
/*
 * 	8장
 * 		예외처리
 * 		------ 에러 => 사전에 에러를 방지하는 목적
 * 				   => 비정상 종료를 방지하고 정상상태를 유지한다.
 * 				   => 예외처리 => 에러 발생시 에러를 건너뛴다.
 * 		에러발생
 * 		------
 * 			= 사용자 (잘못된 입력) => 유효성 검색 => 웹에서는 javascript
 * 							   => if
 * 			= 개발자 (실수) => 배열 인덱스, 정수변환, 형변환...
 * 			------------------
 * 			1) 사전에 차단 (if) => 예외처리
 * 			2) 예외처리
 * 			   ------
 * 				= 에러 (Error) : 소스상에서 수정이 불가능한 에러
 * 								메모리 저장 공간이 부족하다..(Out Of Error)
 * 				= 예외 (Exception) : 소스상에서 수정이 가능한 에러
 * 				  예) 파일경로명, IP, 0으로 나눈다.
 * 					 배열 인덱스가 틀리다.
 * 					 int[] arr=new int[2];
 * 					 arr[2]=10; // 0, 1
 * 				
 * 				=> 예외처리 방법
 * 				   ----------
 * 					= 예외복구 => try~catch
 * 					= 예외회피 => throws
 * 				    = 임의발생 => throw
 * 					= 지원하지 않는 예외 : 사용자 정의 예외처리
 * 				=> 예외의 종류 (상속도)
 * 					Object : 모든 클래스의 상위 클래스
 * 					   ㅣ
 * 					Throwable : 예외의 최상위 클래스
 * 					   ㅣ
 * 					-----------------------------
 * 					ㅣ							ㅣ
 * 				  Error						Exception
 * 				  -----						---------
 * 				처리가 불가능				처리가 가능 (소스변경)
 * 				메모리 부족				=> 0으로 나누는 경우
 * 				윈도우 충돌				=> 배열의 인덱스범위를 벗어나는 경우
 * 				톰캣이 작동 안됨			=> 형변환, 파일명이 틀릴 경우
 * 				오라클에 연결이 안됨
 * 				---------------
 * 
 * 					Exception : 예외처리의 최상위 클래스
 * 					---------
 * 						ㅣ
 * 					-----------------------------------------------------
 * 					ㅣ													ㅣ
 * 				CheckException									UnCheckException
 * 				--------------									----------------
 * 				=> 컴파일시 예외처리를 했는지 확인	   					=> 확인이 없기 때문에 필요시에만 한다. 
 * 				=> 라이브러리 중에 반드시 예외처리를 한다.				=> RuntimeException => 예외를 확인할 수 없다.
 * 				=> java.io										   ----------------
 * 					=> 파일명이 틀린 경우								ㅣ 실행 시 에러
 * 					=> FileNotFoundException						  예) 1~100 사이 정수 입력..
 * 					=> IOException									NumberFormatException : 문자열로 받아서 정수로 변경시
 * 				=> java.net												=> 웹에서 가장 많이 발생
 * 					=> URL주소 , IP가 틀린 경우								=> http://localhost/main/main.jsp?page=10
 * 					=> MalformedURLException							=> 웹에서는 데이터 전송 => URL을 이용해서 전송
 * 				=> java.sql												   자바는 메소드의 매개변수를 이용해서 전송
 * 					=> 오라클 URL : SQLException						ArrayIndexOfOutBoundsException : 배열의 인덱스범위를 벗어나는 경우
 * 					   jdbc:oracle:thin:@localhost:1521:XE			NullPointerException : 주소값이 없는 경우 (null 클래스를 사용한 경우)
 * 												   ----				ArithmeticException : 0으로 나누는 경우
 * 													ㅣ				ClassCastException : 형변환
 * 												   연결포트			
 * 				=> ClassNotFoundException								
 * 				
 * 			==> 에러 예상 : 문자열로 정수를 받아서 배열에 저장한 후 나누기를 한다.
 * 						  ----------		--------	 -----
 *					 NumberFormatException  			ArithmeticException	
 * 									rrayIndexOfOutBoundsException			==> 3가지의 에러를 예상할 수 있다.
 * 			==> 사전에 에러 방지 => 예측
 * 
 * 			
 */
import javax.swing.*;
class A
{
	public void aaa() {System.out.println("A:aaa()");}
}
class B extends A
{
	public void aaa() {System.out.println("B:aaa()");}
}
public class MainClass_1 extends JFrame{
	JButton b1, b2; // null
	public MainClass_1()
	{
		b1=new JButton("로그인");
		b1=new JButton("취소");
		add("North", b2);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a=new B();
//		B b=(B)a;
//		System.out.println(Integer.parseInt(" 10")); => NumberFormatException 에러 발생
		
//		int[] arr=new int[2];
//		arr[2]=100;
//		System.out.println(arr[2]);		=> ArrayIndexOfOutBoundsException 에러 발생
		
//		new MainClass_1();		=> NullPointerException 에러 발생
		
		
		
	}

}
