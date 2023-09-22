// 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

import java.util.Scanner;
public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 배열 초기화
		int[] num=new int[10];
		
		// 입력받기
		for(int i=1;i<=10;i++)
		{
			System.out.println("양의 정수 입력:");
			num[i]=scan.nextInt();
			
			if(num[i]%3==0) // ***
			{
				System.out.print(num[i]+" ");
			}
		}
		
		
//		for(int i=1;i<num.length;i++)
//		{
//			
//			if(i%3==0)
//			{
//				System.out.print(num[i]+" ");
//			}
//		}
		


	}

}
