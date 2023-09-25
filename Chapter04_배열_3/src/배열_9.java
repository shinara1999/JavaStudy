// 정수 10개 저장, 3의배수만 출력
import java.util.Arrays;
public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 출력1
		System.out.println(Arrays.toString(arr));
		
		// 출력2
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n===== 결과값 출력 =====");
		for(int i:arr)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
