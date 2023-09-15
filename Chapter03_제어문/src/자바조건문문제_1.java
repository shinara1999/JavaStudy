// 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.

import java.util.Scanner;
public class 자바조건문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		
		if(num>=50) // 조건
		{
			System.out.println(num+"은(는) 50 이상의 수이다.");
		}
		
		if(num<50) // 조건
		{
			System.out.println(num+"은(는) 50 미만의 수이다.");
		}
		
		scan.close();

	}

}
