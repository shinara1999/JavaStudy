/*
 * 		버블정렬
 * 
 * 		40 30 10 50 20
 * 		-- --
 * 		30 40
 * 		   -- --
 * 		   10 40
 * 			  -- --
 * 			  40 50
 * 				 -- --
 * 				 20 50 => 50 고정
 * 		-------------- 0일 때 4바퀴
 * 		30 10 40 20 50
 * 		-- --
 * 		10 30
 * 		   -- --
 * 		   30 40
 * 			  -- --
 * 			  20 40    => 40 고정
 * 		-------------- 1일 때 3바퀴
 * 		10 30 20 40 50
 * 		-- --
 * 		10 30
 * 		   -- --
 * 		   20 30       => 30 고정
 * 		-------------- 2일 때 2바퀴
 * 		10 20 30 40 50
 * 		-- --
 * 		10 20		   => 20 고정
 * 		-------------- 3일 때 1바퀴
 * 		10 20 30 40 50
 * 
 * 		i	j => i+j=4 ==> j=4-i (이떄 4는 length-1)
 * 		0   4
 * 		1   3
 * 		2   2
 * 		3   1
 */

import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬 후 =====");
		
		for(int i=0;i<arr.length-1;i++) // 0부터 3까지 총 4바퀴
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) // 0번, 1번비교 / 1번, 2번비교 / 2번, 3번비교...
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
