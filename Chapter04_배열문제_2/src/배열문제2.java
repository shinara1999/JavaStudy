// 2. 10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성

import java.util.Arrays;
public class 배열문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int max=0;
		int min=100;
		
		for(int i:arr)
		{
			if(i>max)
			{
				max=i;
			}
		}
		for(int i:arr)
		{
			if(i<min)
			{
				min=i;
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);

	}

}
