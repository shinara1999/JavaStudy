// 양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라.

import java.util.Scanner;
public class 배열문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int[] numList=new int[10];
		
		for(int i=0;i<numList.length;i++)
		{
			System.out.print("양의 정수 입력:");
			int a=scan.nextInt();
			numList[i]=a;
		}
		
		for(int i=0;i<numList.length;i++)
		{
			if(numList[i]%3==0)
			{
				System.out.print(numList[i]+" ");
			}
		
		}
		
		
		
		
		

	}

}
