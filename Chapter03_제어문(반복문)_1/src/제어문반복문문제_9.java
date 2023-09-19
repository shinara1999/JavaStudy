// 100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성

public class 제어문반복문문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0, count=0;
		
		for(int i=100;i<=999;i++) // i는 for문 안에서 사용되고 소멸
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("4의배수가 아닌 수의 갯수:"+count);
		System.out.println("4의배수가 아닌 수의 합:"+sum);

	}

}
