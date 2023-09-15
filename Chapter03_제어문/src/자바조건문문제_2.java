// 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.

import java.util.Scanner;
public class 자바조건문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		
		if(num%3==0)
		{
			System.out.println(num+"은(는) 3의 배수이다.");
		}
		
		if(num%3!=0)
		{
			System.out.println(num+"은(는) 3의 배수가 아니다.");
		}
		
		scan.close();
	}

}
