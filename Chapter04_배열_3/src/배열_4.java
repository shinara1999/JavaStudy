/*
 * 		문자 => 10개 저장
 * 		char[] arr=new char[10];
 * 		String[] s=new String[10];***
 */

// 빈도수 구하기 = 100개의 난수 발생(0-9사이) 후 각각 몇개인지 출력하라.
// 순서 (최적화)

import java.util.Arrays;
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 난수 100개 저장
		int[] data=new int[100];
		
		// 0-9 사이의 100개의 난수 발생
		for(int i=0;i<data.length;i++)
		{
			data[i]=(int)(Math.random()*10);
		}
		System.out.print(Arrays.toString(data));
		System.out.println();
		
		// 빈도수 구하기
		int[] count=new int[10];
		for(int i=0;i<data.length;i++)
		{
			count[data[i]]++; // ***갯수세는 방법
		}
		
		// 출력
		for(int i=0;i<count.length;i++)
		{
			System.out.println(i+"의 갯수:"+count[i]);
		}
		
		// 총합
		int sum=0;
		for(int i:count)
		{
			sum+=i;
		}
		System.out.println("sum:"+sum);

	}

}
