// 정수 2개를 입력받아 연산자 (+-*/) 로 연산처리하기 (사칙연산)

import java.util.Scanner;
public class 제어문_조건문3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 사용자로부터 입력받은 값을 저장하기 위한 메모리공간 설정
		int a,b;
		char op=' ';
		
		// 사용자 입력값 받기
		System.out.print("첫번째 정수 입력:");
		a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		b=scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0); // char 입력받기
		
		
		// 사용자 요청에 따라 결과값 출력 (가공) = 연산자 , 제어문
		if(op=='+')
		{
			System.out.println(a+"+"+b+"="+(a+b));
		}
		else if(op=='-')
		{
			System.out.println(a+"-"+b+"="+(a-b));
		}
		else if(op=='*')
		{
			System.out.println(a+"*"+b+"="+(a*b));
		}
		else if(op=='/')
		{
			
			// 0으로 나눌 경우 오류 발생 (중첩조건문)
			if(b==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.println(a+"/"+b+"="+(a/b));
			}
		}
		else
		{
			System.out.println("잘못된 연산자 입니다.");
		}
				
		scan.close();

	}

}
