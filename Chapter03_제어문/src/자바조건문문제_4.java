// 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.

import java.util.Scanner;
public class 자바조건문문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫 번째 정수:");
		int a=scan.nextInt();
		System.out.print("두 번째 정수:");
		int b=scan.nextInt();
		System.out.print("세 번째 정수:");
		int c=scan.nextInt();
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",avg);
		
		int max=a;
		if(max<b)
			max=b;
		if(max<c);
			max=c;
			{
				System.out.println("MAX:"+max);
			}
			
		int min=a;
		if(min>b)
			min=b;
		if(min>c);
			min=c;
			{
				System.out.println("MIN:"+min);
			}
			
				
			scan.close();	

	}

}
