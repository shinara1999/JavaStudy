// 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라. (switch~case 사용)

import java.util.Scanner;
public class 선택문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a,b;
		char op=' ';
		
		System.out.print("정수 입력:");
		a=scan.nextInt();
		System.out.print("+,-,*,/ 입력:");
		op=scan.next().charAt(0);
		System.out.print("정수 입력:");
		b=scan.nextInt();
		
		switch(op)
		{
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/':
			if(b==0)
				System.out.println("0으로 나눌 수 없습니다."); // 조건문을 활용한 에러 방지
			else
				System.out.println(a+"/"+b+"="+(a/b));
			break;
		}
		
		scan.close();

	}

}
