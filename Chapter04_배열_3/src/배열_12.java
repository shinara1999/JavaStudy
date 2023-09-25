// 정수 10개를 받아서 3번째 , 5번째 , 마지막에 있는 데이터 출력
import java.util.*;
public class 배열_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("3번째: "+arr[2]+", 5번째: "+arr[4]+", 마지막: "+arr[arr.length-1]); // 마지막 : arr.length-1 사용
		
	}

}
