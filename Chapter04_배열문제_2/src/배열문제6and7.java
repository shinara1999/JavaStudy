// 6. 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.

import java.util.Arrays;
public class 배열문제6and7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		double avg=0;
		
		for(int i:arr)
		{
			sum+=i;
			avg=sum/10.0;
		}
		System.out.println("총합:"+sum);
		System.out.println("평균:"+avg);
		
// 7. 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
		
		String arr2="";
		arr2=String.valueOf(arr[3]);
		
		arr2.replace(arr2, " ");
		// System.out.println(Arrays.toString(arr2));

	}

}
