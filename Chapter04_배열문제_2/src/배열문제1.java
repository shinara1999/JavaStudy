// 1. 5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성

import java.util.*;
public class 배열문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int[] kor=new int[5];
		
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 학생의 국어점수:");
			kor[i]=scan.nextInt();
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(kor));
		
		for(int i=0;i<kor.length-1;i++)
		{
			for(int j=0;j<kor.length-1-i;j++)
			{
				if(kor[j]>kor[j+1])
				{
					int temp=kor[j];
					kor[j]=kor[j+1];
					kor[j+1]=temp;
				}
			}
		}
		System.out.println("===== 정렬 후 =====");
		System.out.println(Arrays.toString(kor));
		
		for(int i=0;i<kor.length;i++)
		{
			System.out.println((i+1)+"번째 학생:"+kor+"등");
		}

	}

}
