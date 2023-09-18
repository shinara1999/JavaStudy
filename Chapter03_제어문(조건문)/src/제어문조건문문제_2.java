// 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라.

import java.util.Scanner;
public class 제어문조건문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a;
		
		System.out.println("한개의 정수 입력:");
		a=scan.nextInt();
		
		if(a%3==0)
		{
			System.out.println(a+"은(는) 3의 배수이다.");
		}
		else
		{
			System.out.println(a+"은(는) 3의 배수가 아니다.");
		}
		
		scan.close();
	}

}
