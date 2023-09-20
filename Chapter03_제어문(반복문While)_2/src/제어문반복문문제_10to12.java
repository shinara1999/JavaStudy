// 10. 1~100까지의 정수 중 4의 배수의 합계를 구하라.

import java.util.Scanner;
public class 제어문반복문문제_10to12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int four=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%4==0)
			{
				four+=i;
			}
		}
		System.out.println("1~100까지의 정수 중 4의 배수의 합계:"+four);
		
// 11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
	
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"번째 정수 입력:");
			int a=scan.nextInt();
			
			if(a%2==0)
			{
				num++; // 갯수 세기 num=i++; (X)
			}
		}
		System.out.println("짝수의 개수:"+num);
		
// 12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
		
		int thr=0, fiv=0;
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"번째 정수 입력:");
			int a=scan.nextInt();
			
			if(a%3==0)
			{
				thr++;
			}
			if(a%5==0)
			{
				fiv++;
			}
			
		}
		System.out.println("3의배수의 개수:"+thr);
		System.out.println("5의배수의 개수:"+fiv);

		

	}

}
