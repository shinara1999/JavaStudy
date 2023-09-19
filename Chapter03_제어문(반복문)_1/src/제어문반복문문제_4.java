// 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라.

import java.util.Scanner;
public class 제어문반복문문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int num, sum=0;
		System.out.print("정수 입력:");
		num=scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("합:"+sum);

	}

}
