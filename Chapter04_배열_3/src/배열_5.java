/*	
 * 	page108
 * 
 * 		선택 정렬 / 버블 정렬
 * 
 * 		30 10 50 40 20		ASC (오름차순 10 20 30 40 50) / DESC (내림차순 50 40 30 20 10)
 * 		-- --
 * 		10 30
 * 		--    --
 * 		10    50
 * 		--       --
 * 		10       40
 * 		--          --
 * 		10          20
 * 		-------------- 1 round (for문 한바퀴)
 * 		10 30 50 40 20		
 * 		   -- --
 * 		   30 50
 * 		   --    --
 * 		   30    40
 * 		   --       --
 * 		   20       30
 * 		-------------- 2 round (for문 한바퀴)
 * 		10 20 50 40 30
 * 			  -- --
 * 		      40 50
 * 		      --    --
 * 		      30    50
 * 		-------------- 3 round (for문 한바퀴)
 * 		10 20 30 50 
 * 			...
 * 					=> arr.length-1
 * 
 * 		i	j
 * 		0	4  => i+j=4, j=4-i
 * 		1	3
 * 		2	2
 * 		3	1
 */

import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("======== 정렬전 ========");
		System.out.print(Arrays.toString(arr));
		
		// 정렬 1
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i]; // 임시변수
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("\n======== 정렬후(ASC) ========");
		System.out.println(Arrays.toString(arr));
		
		// 정렬 2
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i]; // 임시변수 (값 교환할 때 사용)
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("======== 정렬후(DESC) ========");
		System.out.println(Arrays.toString(arr));
		
		// 정렬 3
		System.out.println("======== API ========");
		System.out.println(Arrays.toString(arr));
		
		

	}

}
