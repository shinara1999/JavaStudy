/*
 * 		변수 => 데이터형 , 식별자 (암기)
 * 			=> 한개의 데이터를 저장할 수 있는 메모리 공간
 * 			   (저장된 영역은 변경해서 다시 저장 가능)
 * 			=> 변수 기능 (읽기: 값 가지고오기 / 쓰기: 메모리에 저장, 수정)
 * 			=> 변수를 저장하기 위해서는 먼저 메모리의 크기를 결정해야 한다.
 * 			   ------------------------------------------------
 * 											ㅣ
 * 										   기본형(데이터형)
 * 										   참조형(사용자정의) : 배열 , 클래스
 * 			=> 기본형
 * 			   정수
 * 				byte   (1byte)
 * 				int    (4byte)
 * 				long   (8byte) => L(l) 표시
 * 				-----------------------------
 * 				=> 컴퓨터가 인식하는 모든 숫자는 int
 * 			   실수
 * 				double (8byte) => 15자리
 * 			   문자
 * 				char   (2byte) => 0~65535
 * 				-------------- ASC VS Unicode (*****면접문제*****)
 * 			   논리
 * 				boolean(1byte) => true/false만 저장 가능
 * 			   -------------------------------------------------
 * 			   변수 활용 (프로그램 => 데이터 관리)
 * 			   변수 활용 방법 => 연산자 , 제어문
 * 			   연산자
 * 				= 단항연산자 (++,--,!,(데이터형))
 * 				= 이항연산자
 * 					= + , - , * , / , %
 * 					= == , != , < , > , <= , >=
 * 					= && , ||
 * 					= = , += , -=
 * 				= 삼항연산자
 * 					= ? :
 * 				=> 자동형변환 , 강제형변환
 * 				=> +는 문자열 결합
 * 			   --------------------------------------------------
 * 			   프로그램 흐름 제어
 * 				=> 오류가 발생 시 건너뛴다 => if
 * 				=> 반복수행 => for , while
 * 				=> 원하는 프로그램 수행 => if , switch
 * 				=> 제어문
 * 					= ***조건문
 * 						= 단일 조건문
 * 							if(조건문) => 조건문은 반드시 비교연산자, 부정연산자, 논리연산자
 * 							{
 * 								true일 때 실행
 * 							}
 * 						= 선택 조건문
 * 							if(조건문)
 * 							{
 * 								조건이 true일 때
 * 							}
 * 							else
 * 							{
 * 								조건이 false일 때
 * 							}
 * 						= 다중 조건문
 * 							if(조건문)
 * 							{
 * 								조건이 true일 때
 * 								false일 때는 밑에 있는 조건을 찾아간다
 * 							}
 * 							else if(조건문)
 * 							{
 * 								조건이 true일 때
 * 								false일 때는 밑에 있는 조건을 찾아간다
 * 							}
 * 							else if(조건문)
 * 							{
 * 								조건이 true일 때
 * 								false일 때는 밑에 있는 조건을 찾아간다
 * 							}
 * 							...
 * 							else => 생략 가능
 * 							{
 * 								해당 조건이 없는 경우 수행
 * 							}
 * 					= 선택문
 * 							switch(정수, 문자, 문자열)
 * 							{	
 * 								case 값:
 * 									처리문장
 * 									break;
 * 								case 값:
 * 									처리문장
 * 									break;
 * 								case 값:
 * 									처리문장
 * 									break;
 * 								...
 * 								default: => 필요시에 사용
 * 									처리문장
 * 					= ***반복문
 * 						= for
 * 							for(초기값;조건식;증감식)
 * 							{
 * 								반복수행문장
 * 							} => false면 종료
 * 						= while
 * 							초기값
 * 							while(조건문)
 * 							{
 * 								반복수행문장				
 * 								증감식
 * 							} => false면 종료
 * 				
 */
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(100);

	}

}
