// Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라.

import java.util.Scanner;
public class 제어문조건문문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a;
		
		System.out.print("한 개의 정수 입력:");
		a=scan.nextInt();
		
		if(a>=0)
		{
			System.out.println(a+"의 절대값은 "+a+"이다.");
		}
		else
		{
			System.out.println(a+"의 절대값은 "+(-a)+"이다."); // 또다른 방법: a2=a*-1
														   // Math.abs(a) => a의 절대값을 출력
		}

		scan.close();
	}

}
