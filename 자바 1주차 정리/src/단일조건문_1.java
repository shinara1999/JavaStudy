
// 알파벳을 받아서 대문자, 소문자, 숫자, 기타문자 뭔지??

import java.util.Scanner;
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 알파벳 받기
		char ch1;
		
		System.out.println("알파벳을 입력하세요.:");
		ch1=scan.next().charAt(0); // 문자 받아오기
		/*
		 * 		Hello Java
		 * 		0123456789
		 * 
		 * 		charAt(0) 은 0번째 자리를 가져온다는 뜻이다.
		 */
		
		// 대문자
		if(ch1>='A' && ch1<='Z')
		{
			System.out.println(ch1+"(은)는 대문자 입니다.");
		}
		
		// 소문자
		if(ch1>='a' && ch1<='z')
		{
			System.out.println(ch1+"(은)는 소문자 입니다.");
		}
		
		// 숫자
		if(ch1>='0' && ch1<='9')
		{
			System.out.println(ch1+"(은)는 숫자 입니다.");
		}
		
		// 기타문자
		if(!(ch1>='A' && ch1<='Z')&&!(ch1>='a' && ch1<='z')&&!(ch1>='0' && ch1<='9'))
			// if(!((ch1>='A' && ch1<='Z')||(ch1>='a' && ch1<='z')||(ch1>='0' && ch1<='9'))) => 이렇게도 가능
		{
			System.out.println(ch1+"(은)는 알파벳이나 숫자가 아닙니다.");
		}
		
		scan.close();

	}

}
