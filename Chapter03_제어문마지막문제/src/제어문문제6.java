// 6.	1부터 100 까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for 문을사용해 작성해 보세요

public class 제어문문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("1부터 100 까지의 정수 중에서 짝수의 합:"+sum);

	}

}
