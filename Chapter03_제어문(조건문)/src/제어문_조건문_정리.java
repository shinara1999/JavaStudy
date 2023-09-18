/*
 * 	page3 자바 실행환경
 * 		A.java =====> A.class =====> 한줄씩 읽어서 출력
 * 		   javac	ㅣ	   java
 * 		  (컴파일)	ㅣ	 (인터프리터)
 * 					ㅣ
 * 				  바이트코드(배포) ==> 모든 운영체제에 호환
 * 
 * 	page22 들여쓰기
 * 	page23 주석 (한줄,여러줄)
 * 	----------------------------------------------------------------
 * 	약속
 * 		=> 1. 클래스명은 대소문자로 시작한다.
 * 		   2. 변수는 소문자 시작
 * 		   3. 상수는 전체를 대문자
 * 	----------------------------------------------------------------
 * 	Chapter02 프로그램의 기초
 * 	page25 변수
 * 			=> 메모리에 한개의 데이터를 저장하는 공간의 이름
 * 			   메모리는 주소에 대한 별칭을 주는 것이다.
 * 	page30 형식
 * 			=> 데이터형(메모리크기) 변수명;
 * 			   저장할 수 있는 공간 : 정수/실수/논리/문자 => 기본형
 * 			   정수 저장 공간    byte : -128~127 (네트워크 송수신, 파일읽기, 파일쓰기, 사이트검색)
 * 								     https://www.google.com/search?q=%EC%9E%90%EB%B0%94 (%~4까지 : 자바의 byte코드)
 * 			   			       int : -21억4천~21억4천 = default (컴퓨터가 인식하는 숫자는 int)
 * 						      long : L(l) 표기를 해줘야 한다. (int와 구분하기 위해) => 10000000000L
 * 			   실수 저장 공간  double : (8byte) 소수점 15자리까지 = default
 * 			   문자 저장 공간    char : (2byte) 0~65535 => 문자 번호
 * 			   논리 저장 공간 boolean : (1byte) true / false 만 저장 가능
 * 	-----------------------------------------------------------------
 * 	page26 변수의 명명법(메소드, 클래스, 인터페이스 등) : 식별자
 * 			1) 알파벳이나 한글로 시작한다. (알파벳은 대소문자 구분)
 * 			2) 숫자 사용이 가능하다. (앞에는 사용 불가)
 * 			3) 특수문자 사용이 가능하다. (_,$ 만 사용 가능)
 * 			4) 키워드 사용 불가 (이미 사용중인 단어임)
 * 			5) 공백을 줄 수 없다. (_로 채우기)
 * 	-----------------------------------------------------------------
 * 	page38 연산자
 * 			1) 단항연산자
 * 				증감연산자 (++,--)
 * 				부정연산자 (!)
 * 				형변환연산자 (데이터형)
 * 			2) 이항연산자
 * 				산술연산자 (+,-,/,*,%) +는 문자열결합 포함
 * 				비교연산자 (==,!=,<,>,<=,>=)
 * 				논리연산자 (&&,||)
 * 				대입연산자 (=,+=,-=)
 * 			3) 삼항연산자
 * 				(조건)?값1:값2 ==> if~else문 사용 가능
 * 	------------------------------------------------------------------
 * 	Chapter03 제어문
 * 	page54 자바에서 제공하는 제어문
 * 			조건문
 * 				= 단일조건문 : 독립적으로 사용 => 해당되는 조건이 많을 경우
 * 					형식)
 * 						if(조건문)
 * 						{
 * 							조건이 true일 경우에만 처리
 * 						}
 * 						==> false면 건너뛰기
 * 	page56		= 선택조건문 : true / false 나눠서 처리
 * 					형식)
 * 						if(조건문) 조건 => (비교연산자, 부정연산자, 논리연산자만 사용 가능)
 * 						{
 * 							조건이 true일 경우에만 처리
 * 						}
 * 						else
 * 						{
 * 							조건이 false일 때 처리
 * 						}
 * 	page58		= 다중조건문 : 조건문 여러개 나열 => 해당 조건 중 1개만 수행
 * 					형식)
 * 						if(조건문)
 * 						{
 * 							조건이 true일 경우 => 문장 수행 종료
 * 							조건이 false일 경우 => 밑에 있는 조건을 찾는다.
 * 						}
 * 						else if(조건문)
 * 						{
 * 							조건이 true일 경우 => 문장 수행 종료
 * 							조건이 false일 경우 => 밑에 있는 조건을 찾는다.
 * 						}
 * 						else if(조건문)
 * 						{
 * 							조건이 true일 경우 => 문장 수행 종료
 * 							조건이 false일 경우 => 밑에 있는 조건을 찾는다.
 * 						}
 * 						...
 * 						else
 * 						{
 * 							조건이 false일 때 처리
 * 						}
 * 				= 선택문
 * 			반복문
 * 				= for : 횟수 지정
 * 				= while : 횟수X => 파일종료, 오라클의 저장 데이터 읽기
 * 				= do~while : 반드시 한 번 이상을 수행한다.
 * 			반복제어문
 * 				= break : 반복 종료 (예외 => switch~case)
 * 				= continue : 특정 부분을 제외
 * 	-------------------------------------------------------------------		
 */
public class 제어문_조건문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
