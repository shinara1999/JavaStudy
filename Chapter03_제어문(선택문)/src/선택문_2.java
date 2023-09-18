// 사칙연산
// 정수를 2개 받기 => 연산자 선택(문자열)
// 정수 3개 받기 => 1개 결과값

import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a,b;
		int result=0; // 반드시 초기값이 있어야 한다.
		
		System.out.println("첫번째 정수:");
		a=scan.nextInt();
		System.out.println("두번째 정수:");
		b=scan.nextInt();
		System.out.println("연산자 선택(+,-,*,/)");
		
		switch(scan.next())
		{
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case "/":
			result=a/b;
			break;
		default:
			System.out.println("잘못된 연산자 입니다.");
	
		}
		System.out.println("계산 결과:"+result);
		
		scan.close();
	}

}
