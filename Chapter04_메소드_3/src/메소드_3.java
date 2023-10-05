/*
 * 		년도 입력받아서 윤년여부 확인
 * 		1. 입력 => 초기화 => 회원가입에 필요한 데이터 입력
 * 						  로그인 (ID, PWD)
 * 		2. 윤년 확인 => 오라클 연결해서 데이터 추가
 * 				   => 로그인 여부 확인
 * 		3. 결과값 출력 => 로그인 이동
 * 					=> 로그인 : 메인이동
 * 					=> 로그인(X) : 다시 입력 요청
 * 				브라우저 ===> 자바 ===> 오라클
 * 				------------------------- 라이브러리
 */
import java.util.*;
public class 메소드_3 {
	// 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		return year;
	}
	
	// 윤년확인
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			bCheck=true;
		}
		return bCheck;
	}
	
	// 처리
	static void print(boolean bCheck)
	{
		if(bCheck)
		{
			System.out.println("윤년이다.");
		}
		else
		{
			System.out.println("윤년이 아니다.");
		}
	}
	
	// 조립
	static void process()
	{
		int year=userInput();
		boolean bCheck=isYear(year);
		print(bCheck);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
//		// 입력
//		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int year=scan.nextInt();
//		
//		// 윤년 확인 (처리)
//		boolean bCheck=false;
//		if((year%4==0 && year%100!=0)||(year%400==0))
//		{
//			bCheck=true;
//		}
//		
//		// 처리 결과 출력
//		if(bCheck)
//		{
//			System.out.println("윤년이다.");
//		}
//		else
//		{
//			System.out.println("윤년이 아니다.");
//		}
		
	}

}
