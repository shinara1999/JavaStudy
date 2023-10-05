// 정수 1개 입력받아서 3의배수 여부 확인

import java.util.Scanner;
public class 메소드_문제_2 {
	
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		return num;
	}
	
	static String check(int num)
	{
		String str="";
		if(num%3==0)
		{
			str="3의 배수이다.";
		}
		else
		{
			str="3의 배수가 아니다.";
		}
		
		return str;
	}
	
	static void print(String str)
	{
		System.out.println(str);
	}
	
	static void process()
	{
		int num=userInput();
		String str=check(num);
		print(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num=scan.nextInt();
//		
//		String str="";
//		if(num%3==0)
//		{
//			str="3의 배수이다.";
//		}
//		else
//		{
//			str="3의 배수가 아니다.";
//		}
//		
//		System.out.println(str);

	}

}
