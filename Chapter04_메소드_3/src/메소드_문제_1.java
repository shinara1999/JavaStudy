// 정수 한개를 입력받아서 => 짝수/홀수 여부 확인 => 출력한다

import java.util.Scanner;
public class 메소드_문제_1 {
	
	// 입력받기
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		return num;
	}
	
	// 짝수 홀수
	static String check(int num)
	{
		String str="";
		if(num%2==0)
		{
			str="짝수";
		}
		else
		{
			str="홀수";
		}
		return str;
	}
	
	// 출력
	static void print(int num, String str)
	{
		System.out.println(num+"은(는)"+str+"입니다.");
	}
	
	// 조합
	static void process() // 3개의 메소드를 묶기
	{
		int num=userInput();
		String str=check(num);
		print(num,str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
//		// 입력받기
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num=scan.nextInt();
//		
//		// 짝수 홀수
//		String str="";
//		if(num%2==0)
//		{
//			str="짝수";
//		}
//		else
//		{
//			str="홀수";
//		}
//		
//		// 출력
//		System.out.println(num+"은(는)"+str+"입니다.");

	}

}
