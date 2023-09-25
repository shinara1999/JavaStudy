// 간단한 프로그램 => 중복없는 난수

public class 배열_5응용간단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10]; // 10자리의 배열 생성
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1; // 랜덤한 수 1-10 중 10개 생성
			for(int j=0;j<i;j++) // 중복없애기 (중첩 for문 사용)
			{
				if(arr[i]==arr[j])
				{
					i--; // 감소 => 다시 난수를 발생하라는 뜻
					// 인덱스를 이용해서 다시 난수를 발생하게 만듬
					break;
				}
			}
		}
		
		// 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
