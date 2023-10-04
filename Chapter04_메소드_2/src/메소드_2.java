/*
 * 		1. 문자열을 입력받아서 대문자를 소문자, 소문자를 대문자로 변경 / 입력 대소문자
 * 		2. 문자열을 입력받아서 해당 문자열을 거꾸로 출력 / 거꾸로
 * 		=> 메소드가 총 3개 필요하다.
 */

import java.util.Scanner;
public class 메소드_2 {
	// 문자열을 입력받는 기능 : 리턴형 => String , 매개변수X (키보드 입력값을 받는 것이므로)
	static String userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return scan.nextLine();
		// next() : 엔터시에 메모리 저장 => 문자열 인식 (공백 앞까지만 인식) aaaab cd e => aaaab만 인식
		// nextLine() : 엔터시에 메모리 저장 => 공백 포함 문자열 인식 abdce fg h => abcde fg h
	}
	
	// 대문자를 소문자, 소문자를 대문자로
	static void alphaChange(String msg)
	{
		String result="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			if(c>='A' && c<='Z') // 대문자라면?
			{
				result+=(char)(c+32); // 소문자 변환
			}
			else if(c>='a' && c<='z') // 소문자라면?
			{
				result+=(char)(c-32); // 대문자 변환
			}
			else
			{
				result+=c;
			}
		}
		System.out.println("결과값:"+result);
	}
	// 리턴형 / 매개변수 (String)
	// => 결과값을 받아서 출력 or 메소드 안에서 처리 (O)
	
	// 거꾸로 출력
	static String alphaReverse(String msg)
	{
		String result="";
		for(int i=msg.length()-1;i>=0;i--)
		{
			char c=msg.charAt(i);
			result +=c;
		}
		return result;
	}
	
	// => 결과값을 받아서 출력 (O) or 메소드 안에서 처리

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg=userInput();
		System.out.println("msg:"+msg);
		alphaChange(msg);
		String res=alphaReverse(msg);
		System.out.println("res:"+res);

	}

}
