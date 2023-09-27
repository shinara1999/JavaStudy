// 3. 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오

import java.util.Arrays;
public class 배열문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			count++;
		}
		// System.out.println(arr[i]+"의 빈도수:"+count);
	}

}
