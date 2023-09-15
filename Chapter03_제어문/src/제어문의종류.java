/*
 * 	54page
 * 
 * 		변수  => 저장(데이터)
 * 		연산자 => 결과값 , 사용처 , 형식
 * 		제어문 => 흐름(동작) , 사용처 , 형식
 * 		
 * 		1. 제어문의 종류
 * 		   ***제어문은 무조건 1개의 문장만 수행할 수 있다.
 * 			  if(조건문)
 * 				문장 1 ===> 제어
 * 				문장 2 ===> 일반문장(제어X)
 * 
 * 			  if(조건문)
 * 			  {
 * 				문장 1
 * 				문장 2
 * 			  }		 ===> {}을 이용하면 여러개의 문장을 수행할 수 있다.
 * 			= 조건문
 * 				= 단일 조건문
 * 				  형식)
 * 					if(조건문) => 조건문에 들어갈 수 있는 것 : 비교연산자, 논리연산자, 부정연산자
 * 					{
 * 						조건문이 true일 경우에 수행할 문장
 * 					}
 * 					=> 명령문을 제어한다. (수행 할수도 있고 안할수도 있음)
 * 				  단점)
 * 					여러개 사용 시 속도가 느려진다.
 * 					1개가 독립문장이기 때문에..
 * 				  => 중복이 있는 경우에는 사용이 가능하다. (if문 여러개 작성)
 * 					 1~100까지 중에 3,5,7
 * 				= 선택 조건문 : true와 false를 나눠서 작업
 * 				  ==> 삼항연산자
 * 					if(조건문)
 * 					{
 * 						조건문이 true일 때
 * 					}
 * 					else
 * 					{
 * 						조건문이 false일 때
 * 					}
 * 				= 다중 조건문 : 한번만 수행할 때 주로 사용
 * 					=> 계산기 : + , - , * , /
 * 					if(조건문)
 * 					{
 * 						조건문이 true일 때 ==> 이 문장을 수행하면 종료
 * 						false ↘
 * 							  밑에 있는 조건문으로 이동
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건문이 true일 때 ==> 이 문장을 수행하면 종료
 * 						false ↘
 * 							  밑에 있는 조건문으로 이동
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건문이 true일 때 ==> 이 문장을 수행하면 종료
 * 						false ↘
 * 							  밑에 있는 조건문으로 이동
 * 					}
 * 					...
 * 					else
 * 					{
 * 						// 생략 가능
 * 						해당 조건이 없는 경우 처리하는 문장
 * 					}
 * 
 * 					예 1) 다중조건문의 사용
 * 					int score=80;
 * 					if(score>=90)
 * 						A
 * 					else if(score>=80)
 * 						B
 * 					else if(score>=70)
 * 						C
 * 					else if(score>=60)
 * 						D
 * 					else if(score<60)
 * 						F
 * 
 * 					예 2) 단일조건문의 사용 (15는 3, 5의 배수이므로 둘 다 출력해야 한다. -> 다중조건문 사용 불가)
 * 					int a=15
 * 					if(a%3==0)
 *  				if(a%5==0)
 *   				if(a%7==0)
 * 			= 선택문
 * 			= 반복문
 * 			= 반복제어문
 */

// 단일 조건문 : 조건식 (비교연산자, 논리연산자, 부정연산자)
// 1. 정수 1개를 입력받아서 짝수/홀수인지 나타내라.
import java.util.Scanner;
public class 제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  기능(메소드)
		 *  정수: nextInt()
		 *  문자열: next()
		 *  실수: nextDouble()
		 *  논리: nextBoolean()
		 *  문자는 X ==> System.in => 대신 정수로 들어오기때문에 다시 char로 형변환 시켜줘야 함.
		 */
		
		// Scanner클래스 저장 => 클래스를 저장 (new)
		// 동적바인딩
		Scanner scan=new Scanner(System.in);
		// System.in / System.out => 자바 표준입출력
		System.out.println("정수를 입력하시오.:");
		
		int num=scan.nextInt();
		
		// 가공
		if(num%2==0)
		{
			System.out.println(num+"(은)는 짝수이다.");
		}
		if(num%2!=0) // num%2==1  !(num%2==0) => 경우의 수가 많다.
		{
			System.out.println(num+"(은)는 홀수이다.");
		}
		
		scan.close();
		
	}

}
