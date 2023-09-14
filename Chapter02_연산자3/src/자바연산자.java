/*
 * 		변수 : 저장 공간
 * 		===
 * 		 자바 저장 공간을 설정 (자료형, 데이터형)
 * 		 ----------------
 * 			정수
 * 				byte (8bit) => 0, 1을 8개를 채워서 숫자 한 개를 저장
 * 							   -128~127
 * 				int (4byte=32bit) => -21억4천~21억4천 ===> default (컴퓨터에서 모든 숫자는 int를 인식)
 * 				long (8byte=64bit) => 가장 큰 형태 (금융권, 빅데이터)
 * 			실수
 * 				double (8byte=64bit) => 소수점 15자리 이상
 * 			문자
 * 				char (2byte=16bit) => 0~65535 (각 문자의 번호들)
 * 									  'A' 가 65로 저장된다.
 * 			논리
 * 				boolean (1byte=8bit) => true, false
 * 			-----------------------------------------------------------------------------------
 * 				정수 3개 저장
 * 				int a, b, c;
 * 				실수 2개 저장
 * 				double d1, d2;
 * 				문자 1개 저장
 * 				char ch1;
 * 				논리형 1개 저장
 * 				boolean bb;
 * 
 * 			-----------> 데이터 저장 ------------> 사용자 요청에 맞게 가공 ------------> 사용자 화면에 출력
 * 			-----------> 프로그램 (반복)					ㅣ
 * 													   연산자
 * 			자바에서 제공하는 연산자
 * 			------------------
 * 			단항연산자
 * 				= 증감연산자 (++,--) : 한개 증가, 한개 감소
 * 				  ++a : a값을 1증가 시킨 후에 다른 연산을 수행
 * 				  int a=10;
 * 				  int b=++a;
 * 						--
 * 						증가(1) a=11
 * 					  --
 * 					  대입 b=11
 * 				  a++ : 먼저 다른 연산 후에 나중에 1 증가
 * 				  int a=10;
 * 				  int b=a++;
 * 					  --
 * 					  대입 b=10
 * 						 --
 * 						 증가(1) a=11
 * 				  --a : a값을 1감소 시킨 후에 다른 연산을 수행
 * 				  int a=10;
 * 				  int b=--a;
 * 						--
 * 						감소(1) a=9
 * 					  --
 * 					  대입 b=9
 * 				  a-- : 먼저 다른 연산 후에 나중에 1 감소
 * 				  int a=10;
 * 				  int b=a--;
 * 					  --
 * 					  대입 b=10
 * 						 --
 * 						 감소(1) a=9
 * 				  ++,-- => 여러개를 감소하는 것이 아닌 1증가, 1감소를 뜻한다.
 * 
 * 				= 부정연산자 (!) => boolean에서만 사용 가능
 * 				  => true  => false
 * 					 false => true
 * 				  ex) boolean bCheck=false;
 * 					  bCheck=!bCheck ==> bCheck=true
 * 					  예약 가능한날 => !(예약 가능한날)
 * 
 * 				= 형변환연산자 (type) => 강제형변환
 * 				  --------- 객체지향 형변환 (클래스)
 * 				  숫자관련만 (정수, 실수, 문자)
 * 				  ------------------------
 * 					Upcasting : 데이터형을 크게 만든다
 * 					  int  => double
 * 					  char => int
 * 					  -------------- 자동 형변환
 * 					  int a='A'
 * 							--- int 변경 ('A' => 65)
 * 					  double d=100
 * 							 ----- double 변경 (100 => 100.0)
 * 				    DownCasting : 데이터형을 작게 만든다
 * 					  char c=(char)65; => c='A'
 * 					  int i=(int)100.0; => i=100
 * 					  -------------------------- 강제 형변환
 * 				  데이터형의 크기
 * 				  -----------
 * 					byte < char < int < long < float < double
 * 				  자동 형변환
 * 				  --------
 * 				  	연산 처리시 많이 변경이 된다. (자바 자체에서 이루어짐)
 * 					-------
 * 						데이터형이 같은 것끼리 연산이 된다.
 * 					    double + int  (x)
 * 					    char   + int  (x)
 * 						int    + long (x) => 연산이 되게 자동 형변환됨. (우리 눈에는 안보인다.)
 * 					***주의점
 * 						char+byte=int
 * 						char+char=int
 * 						byte+byte=int => int이하 데이터형은 연산시에 int로 변경된다.
 * 
 * 			이항연산자
 * 				= 산술연산자 (+,-,*,/,%)
 * 					+ : 두개의 값을 더한다. (1+2=3)
 * 					    문자를 합쳐준다. ("7"+7="77")
 * 					/ : 정수/정수=정수 , 정수/실수=실수
 * 						정수/(double)정수
 * 						int hit=135
 * 						int count=10;
 * 						hit/count ==> 13
 * 						hit/(double)count ==> 13.5
 * 						***0으로 나눌 경우 오류 발생
 * 					% : 왼쪽 부호
 * 						=> 윤년 구하기, 숫자 자르기 ..., 배수 구하기
 * 
 * 				= 비교연산자 (==,!=,<,>,<=,>=) ***결과값은 무조건 true/false
 * 					== 같다
 * 					!= 같지않다
 * 					<  작다
 * 					>  크다
 * 					<= 작거나 같다
 * 					>= 크거나 같다
 * 					***날짜, 문자열("")은 비교할 수 없다. (자체 메소드가 따로 있음)
 * 					***문자(''), 정수, 실수만 비교 가능하다.
 * 
 * 				= 논리연산자 (&&,||)
 * 					&& : 직렬연산자 (조건 2개가 true일 경우에만 true)
 * 						 사용처 => 기간, 범위가 포함된 상태
 * 					|| : 병렬연산자 (조건 2개중에 한개이상 true일 경우 true)
 * 						 사용처 => 잘못된 입력
 * 
 * 				= 대입연산자 (=,+=,-=)
 * 					=  일반 대입
 *					+= => a+=1 => a=a+1 (여러개 증가에 이용)
 *					-= => a-=1 => a=a-1 (여러개 감소에 이용)
 *
 * 			삼항연산자
 * 				= 조건연산자 (?:)
 * 					(조건)?값1:값2
 * 					----
 * 					 true  => 값1
 * 					 false => 값2 (페이징에 이용)
 */

/*
 * 		산술연산자
 * 		정수 3개를 입력받아서 총점, 평균 구하기
 */
import java.util.Scanner; // Scanner 클래스 가지고오기
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선언 (메모리 저장하는 공간을 만들어줌)
		int kor, eng, mat;
		int total;
		double avg;
		
		// 변수의 초기화 (메모리 공간에 값을 첨부)
		Scanner scan=new Scanner(System.in);
		// new => 메모리에 저장 (클래스)
		// System.in => 키보드 입력
		
		System.out.println("국어, 영어, 수학 점수 입력(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		mat=scan.nextInt();
		
		// 연산처리
		total=kor+eng+mat;
		avg=total/3.0;
		
		// 결과 출력
		System.out.println("국어 점수:"+kor);
		System.out.println("영어 점수:"+eng);
		System.out.println("수학 점수:"+mat);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg); // 소수점 자르기
		
		// 학점구하기 (print 사용)
		System.out.print(avg>=90 && avg<=100?"A학점":"");
		System.out.print(avg>=80 && avg<=90?"B학점":"");
		System.out.print(avg>=70 && avg<=80?"C학점":"");
		System.out.print(avg>=60 && avg<=70?"D학점":"");
		System.out.print(avg<60?"F학점":"");
		
		scan.close(); // Scanner 닫기
	}

}
