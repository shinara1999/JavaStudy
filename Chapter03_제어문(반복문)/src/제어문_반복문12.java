// 1~30 사이의 짝수만 3줄씩 출력

public class 제어문_반복문12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0) // 짝수 출력
			{
				System.out.printf("%2d\t",i); // 간격맞추기				
			}
			if(i%6==0) // 6의 배수 다음부터는 줄바꿈
			{
				System.out.println();
			}
		}
		

	}

}
