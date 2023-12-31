/*
 * 		1. 실행되는 순서를 잘 기억해야 한다.
 * 			=> 자바 파일명, 클래스명은 동일해야 한다. (대소문자 구분)
 * 
 * 		 			   javac(컴파일) => 0, 1					 java(인터프리터)
 * 			A.java ============================> A.class =====================> 실행
 * 			------								바이너리코드
 * 			  ㅣ								 모든 운영체제에 호환
 * 			원시소스
 * 		   (프로그래머)
 * 			==> 이클립스 : javac+java => Ctrl+F11
 * 
 * 		2. 소스 코딩의 주의점
 * 			1) 대소문자 구분
 * 			2) 명령문 => ;	
 * 			3) 주석 처리 (알아볼 수 있게)
 * 			4) 들여쓰기 => { + Enter => 자동으로 닫힌다.
 * 
 * 		3. 자바개발자간의 약속
 * 			1) 변수 / 클래스 / 메소드 / 상수 / 인터페이스
 * 				변수 : 소문자 시작 => 2단어 이상일 때는 두번째 단어 대문자 시작  fileName
 * 				상수 : 모든 알파벳 대문자  MAX_VALUE
 * 				클래스, 인터페이스 : 첫 자를 대문자 시작  MainClass
 * 				메소드는 변수와 동일
 * 			
 * 			***프로그램 (데이터 관리)
 * 				데이터 저장
 * 					= 메모리에 저장
 * 					  한 개의 데이터 관리 => 변수
 * 										기본형으로 메모리 크기 결정
 * 										정수 byte(1byte) / int(4byte) / long(8byte)
 * 										문자 char(2byte)
 * 										실수 float(4byte) / double(8byte)
 * 										논리 boolean(1byte)
 * 					  여러개의 데이터 관리 => 배열/클래스
 * 										사용자 정의 => 참조형
 * 										int + double + char (byte를 묶어서 저장 가능)
 * 					------------------- 종료와 동시에 없어짐.
 * 					= 파일에 저장
 * 					= RDBMS에 저장 (오라클)
 * 					------------------- 영구적인 저장 장치
 * 
 * 		4. 변수 / 연산자 / 제어문 / 데이터 모아서 관리하는 방법 / 재사용 / 예외처리
 * 			=> 라이브러리를 이용한 조립식
 * 		5. 응용 : 네트워크, 파일
 * 		---------------------------------------------------------------------------
 * 		오라클 (21c) : CURD (추가, 수정, 삭제, 검색)
 * 		---------------------------------------------------------------------------
 * 		브라우저 연동 : HTML5 / CSS3 / JavaScript
 * 								   ---------- Jquery (Ajax)
 * 								   ---------- VueJs (Vuex)
 * 								   ---------- ReactJs (Redux)
 * 								   ---------- +옵션 : TypeScript / NodeJS
 * 																 ------- : 실시간 상담
 * 
 * 		JSP => Back-end + Front-end
 * 		--- MVC 구조 (SpringMVC => 직접 Spring을 제작)
 * 		DataBase 연동 => MyBatis / JPA
 * 		Spring
 * 		Spring - Boot : ThymeLeaf
 * 		AWS (Amazon Web Service) => PaaS ==> EC2
 * 		---------------------------------------------------------------------------
 * 		Python : 데이터 분석, 시각화
 * 				 Pandas / Numpy / Matplotlab
 * 				 +옵션 : 머신러닝 / 딥러닝
 * 
 * 		변수 : 메모리에 한개의 데이터를 저장하는 공간의 별칭
 * 			 ----- 주소
 * 	
 * 			 변수명 설정
 * 			 --------
 * 			 1. 알파벳 시작 (대소문자 구분), 한글
 * 			 2. 숫자 사용 가능 (맨 앞에 사용 금지)
 * 			 3. 키워드 사용 금지
 * 			 4. 공백없이 사용
 * 			 5. 특수문자 (_,$)
 * 			 6. 기타사항 => 압축(3~7자)
 * 			 -------------------------------------
 * 			 변수 선언 방식
 * 				데이터형 변수명;
 * 			 변수의 초기화
 * 				변수명=값;
 * 			 변수의 활용
 * 				변수명=값 (수정) ==> 자동으로 {}을 벗어나면 삭제된다.
 * 			 변수의 종류 ===> 지역변수 : 블록{} 안에서만 사용
 * 
 * 			 데이터를 저장 ===> 데이터를 가공 ===> 가공된 데이터 출력
 * 								ㅣ			 화면에 출력
 * 							   연산자
 * 							   제어문
 * 							   ---- 메소드
 * 		1. 산술연산자
 * 			+ , - , * , / , %
 * 			1) 연산은 같은 데이터형끼리만 연산된다.
 * 				10.5 + 10 => 10.5 + 10.0 => 20.5 (10의 int형이 10.0 double형으로 자동 형변환)
 * 				'A' + 1 => 65 + 1 => 66 (A의 char형이 65 int형으로 자동 형변환)
 * 				10.5 + (double)10 => 20.5 (강제 형변환)
 * 				
 * 				크기
 * 				byte < char < int < long < float < double
 * 
 * 				***int 이하 데이터형(byte, char)은 연산 시 결과값은 항상 int형이다.
 * 				   char + char = int
 * 				   char + byte = int
 * 				   byte + byte = int
 * 
 * 			2) + : 산술처리 , 문자열 결합
 * 					= '' 문자
 * 					= "" 문자열
 * 					ex) 7 + "7" + 7 = "777"
 * 						7 + 7 + "7" = "147"
 * 						7 + "7" - 7 ==> 오류 발생
 * 						7 + "7" + 7 * 7 = 7749 ==> 곱셈,나눗셈이 우선순위가 더 높다.
 * 					산술 => 왼쪽에서 오른쪽으로 연산
 * 						   *,/,%은 +,-보다 우선순위다.
 * 						   우선순위를 변경할 때는 ()괄호 이용한다.
 * 
 * 			   / : 정수/정수=정수
 * 					= 소수점 아래는 다 지워진다. (실수가 필요할 때는 실수로 나눠준다.)
 * 				    = 0으로 나누면 오류 발생한다.
 * 
 * 			   % : 부호가 왼쪽편 부호를 따라간다.
 * 					- % + ==> -
 * 					+ % - ==> +
 * 					- % - ==> -
 * 
 * 			형변환 (대입연산자=로 연산처리됨.)
 * 				int a='A'; ==> 65
 * 				double d=10; ==> 10.0
 * 
 * 				왼쪽 <= 오른쪽
 * 				-------------------------------------------------------------
 */

// 3개 정수 (1-100) 받아서 총합, 평균을 구하여라.
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; // Math.random()       : 0.0~0.99
		int b=(int)(Math.random()*100)+1; // Math.random()*100   : 0~99
		int c=(int)(Math.random()*100)+1; // Math.random()*100+1 : 1~100
		
		int total=a+b+c;
		double ave=total/3.0;
		
		System.out.println("a:"+a+",b:"+b+",c:"+c);
		System.out.printf("total:"+total+",average:%.2f\n",ave); // 소수점 자르기 => printf "%.2f",
														// \n : 줄바꿈 표시
		/*
		 * 실수 : %f %.2f %.3f
		 * 정수 : %d
		 * 문자 : %c
		 * 문자열 : %s
		 */
		
		System.out.println("=====================");
		System.out.print("aaa"); // aaabbb print는 붙어서 출력
		System.out.print("bbb");
		
	}

}
