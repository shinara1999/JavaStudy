// 1~30 짝수합,홀수합을 출력하는 프로그램을 작성

public class 제어문반복문문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int even=0, odd=0;
		
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
			{
				even+=i;
			}
			else
			{
				odd+=i;
			}
		}
		System.out.println("짝수의 합:"+even);
		System.out.println("홀수의 합:"+odd);

	}

}
