// => 알파벳을 입력받아서 대문자인지 소문자인지 숫자인지 기타인지 판별하여 출력

import java.util.Scanner;
public class 메소드_문제_4 {
	
	static char userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
		char c=scan.next().charAt(0);
		
		return c;
	}
	
	static String check(char c)
	{
		String str="";
		if(c>='A' && c<='Z')
		{
			str=c+" 은(는) 대문자 입니다.";
		}
		else if(c>='a' && c<='z')
		{
			str=c+" 은(는) 소문자 입니다.";
		}
		else if(c>='0' && c<='9')
		{
			str=c+" 은(는) 숫자 입니다.";
		}
		else
		{
			str=c+" 은(는) 기타문자 입니다.";
		}
		
		return str;
	}
	
	static void print(String str)
	{
		System.out.println(str);
	}
	
	static void process()
	{
		char c=userInput();
		String str=check(c);
		print(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("문자 입력:");
//		char c=scan.next().charAt(0);
//		
//		String str="";
//		if(c>='A' && c<='Z')
//		{
//			str=c+" 은(는) 대문자 입니다.";
//		}
//		else if(c>='a' && c<='z')
//		{
//			str=c+" 은(는) 소문자 입니다.";
//		}
//		else if(c>='0' && c<='9')
//		{
//			str=c+" 은(는) 숫자 입니다.";
//		}
//		else
//		{
//			str=c+" 은(는) 기타문자 입니다.";
//		}
//		
//		System.out.println(str);

	}

}
