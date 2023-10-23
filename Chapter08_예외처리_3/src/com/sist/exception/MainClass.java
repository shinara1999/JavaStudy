package com.sist.exception;
/*
 * 		1. 자바 문법
 * 			=> 변수 / 연산자 / 제어문
 * 			=> 사용자 정의 클래스
 * 				=> 멤버변수 / 메소드 / 생성자
 * 				=> 클래스의 종류 => 인터페이스
 * 			=> 에러 방지 : 예외처리
 * 			예외처리 : 사전에 에러를 방지하는 프로그램
 * 						=> 비정상 종료를 방지하고 정상수행
 * 			=> 자바에서 지원 예외처리
 * 				1) 고려 => if => 예외처리
 * 				2) 예외처리 대상
 * 					CheckException : 컴파일 시 예외처리가 되어있는지 확인
 * 					=> 반드시 예외처리를 한다.
 * 					   io(입출력) , net(네트워크) , sql(오라클 연결)
 * 					   => 웹
 * 					UnCheckException : 사용자의 입력에 따라...
 * 				3) 예외처리 방법
 * 					= 예외 복구 => 에러를 받아서 처리 => catch
 * 					1. 형식
 * 					try
 * 					{
 * 						=> 정상수행 할 수 있는 소스코드
 * 						=> 모든 소스 , 부분 소스
 * 					}catch(예외처리 종류)
 * 					{
 * 						=> try에서 에러가 발생시 처리하는 문장
 * 						=> 복구는 거의 없다.
 * 						=> 에러 수정 목적
 * 					}
 * 					----- catch는 여러개 사용이 가능 => 전체 => Exception
 * 					finally
 *					{
 *						=> 생략이 사능
 *						=> 사용처 : 서버 종료, 			
 *					}
 *
 *					동작 순서
 *					try
 *					{
 *						문장 1
 *						문장 2
 *						문장 3
 *					}catch(Excption ed
 * 						
 * 					= 예외 회피 => JVM에 미리 알려준다.
 * 							  => 이런 에러가 발생할 수 있다.
 * 		2. 라이브러리 => 암기
 * 			java.lang
 * 				= Object , String , StringBuffer , Wrapper
 * 			java.util
 * 				= Date , Calendar , StringTokenizer
 * 				= Collection
 * 					= ArrayList / HashSet / HashMap
 * 			java.io
 * 				= 업로드 / 다운로드 => 파일 관련
 * 			java.net => 흐름 (크롤링 => 프로젝트) URL
 * 			------------------------------------------
 * 			*** java.sql = 자바에서 오라클 연동
 * 					Connection / Statement / ResultSet
 * 			------------------------------------------ 
 * 			*** 예외처리 목적 => 프로그램 종료
 * 				예) 로그인 > 입력이 안되누
 * 
 * 			예) void insert() throws Exception
 * 				=> insert를 호출하기 위해서는 예외처리를 하고 사용한다.
 * 				void method
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
