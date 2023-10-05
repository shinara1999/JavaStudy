// 5개 정수를 받아서 max , min 찾기

import java.util.*;
public class 메소드_5 {
	
	// 5개 정수 받기
	static int[] userInput()
	{
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	// max, min 찾기 (따로 처리) => 리턴형은 한개만 설정할 수 있다. 
	static int max(int[] arr) // max
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i>m)
			{
				m=i;
			}
		}
		return m;
	}	
	static int min(int[] arr) // min
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i<m)
			{
				m=i;
			}
		}
		return m;
	}
	
	// 출력
	static void print(int max, int min)
	{
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
	
	// 조합
	static void process()
	{
		int[] arr=userInput();
		System.out.println(Arrays.toString(arr));
		int max=max(arr);
		int min=min(arr);
		print(max, min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
//		// 5개 정수 받기
//		int[] arr=new int[5];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		// max, min 찾기
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int i:arr)
//		{
//			if(i>max)
//			{
//				max=i;
//			}
//			if(i<min)
//			{
//				min=i;
//			}
//		}
//		
//		// 출력
//		System.out.println("max:"+max);
//		System.out.println("min:"+min);
	}

}
