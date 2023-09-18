// Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라.

import java.util.Scanner;
public class 제어문조건문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a;
		
		System.out.print("한 개의 정수 입력:");
		a=scan.nextInt();
		
		if(a>=0)
		{
			System.out.println(a+"은(는) 양수이다.");
		}
		else
		{
			System.out.println(a+"은(는) 음수이다.");
		}
		
		scan.close();
	}

}
