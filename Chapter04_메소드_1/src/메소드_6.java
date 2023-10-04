// 알파벳을 입력받아서 => 대문자인지 소문자인지 확인
// 메소드 1개? 2개?

import java.util.Scanner;
public class 메소드_6 {
	static char alphaInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 입력:");
		return scan.next().charAt(0);
		// 자바 단점: char 입력받아서 처리하는 기능이 없다.
		// String으로 받아서 char을 분리해야한다.
	}
	static void result(char c) // void : 결과값을 넘겨주지 않고 자체 처리
	{
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"은(는) 대문자 입니다.");
		}
		else if(c>='a' && c<='z')
		{
			System.out.println(c+"은(는) 소문자 입니다.");
		}
		else
		{
			System.out.println(c+"은(는) 알파벳이 아닙니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳 받기
		char c=alphaInput();
		result(c);

	}

}
