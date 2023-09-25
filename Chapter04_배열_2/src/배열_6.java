// 1~100 => 10개 저장 => 배열 이용
// 총합
// 평균
// 최대값
// 최소값
// 최대값의 위치 (인덱스 이용)
// 최소값의 위치 (인덱스 이용)

import java.util.Arrays;
public class 배열_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numList=new int[10];
		
		// 초기화	
		for(int i=0;i<numList.length;i++)
		{
			int num=(int)(Math.random()*100)+1; // numList[i]=(int)(Math.random()*100)+1; 한줄로 줄이기
			numList[i]=num;
			
		}
		// for문 없이 리스트값 가져오기 => import java.util.Arrays;
		System.out.println("===== 저장된 값 =====");
		System.out.println(Arrays.toString(numList));
		
//		for(int num:numList)
//		{
//			System.out.print(num+" ");
//		}
		
		// 총합, 평균
		int sum=0;
		
		for(int i:numList)
		{
			sum+=i;
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f\n", sum/10.0);
		
		// 최대값, 최소값
		int max=0, min=100;
		for(int i:numList)
		{
			if(i>max)
			{
				max=i;
			}
			if(i<min)
			{
				min=i;
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		// 최대값, 최소값의 위치 => 인덱스 사용
		int index=0;
		for(int i=0;i<numList.length;i++)
		{
			if(max==numList[i])
			{
				index=i;
				break;
			}
	
		}
		System.out.println("MAX값의 위치:"+(index+1)+"번째");
		
		for(int i=0;i<numList.length;i++) // min , max for문 따로 사용
		{
			if(min==numList[i])
			{
				index=i;
				break;
			}
	
		}
		System.out.println("MIN값의 위치:"+(index+1)+"번째");
	}

}
