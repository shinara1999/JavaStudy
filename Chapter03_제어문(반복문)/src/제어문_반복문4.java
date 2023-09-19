// 1~100 => 루프변수 (1부터 100까지 돌려라)
// 총합, 짝수의 합, 홀수의 합 => 누적변수

public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0; // sum: 총합, even:짝수합, odd:홀수합
		for(int i=1;i<=100;i++)
		{
			sum+=i; // sum=sum+1 => 총합 (for문 안에서 i가 계속 돌아가서 1~100의 총합이 나온다.
			System.out.println("sum="+sum+",i="+i); // i가 n일 때의 sum값
			
			if(i%2==0) // 짝수일 때만 더한다.
			{
				even+=i;
			}
			else // 홀수일 때만 더한다.
			{
				odd+=i;
			}
		}
		System.out.println("총합:"+sum); // 이 문장들은 한번만 나와야 하니까 for문 밖에서 출력한다.
		System.out.println("짝수의 합:"+even);
		System.out.println("홀수의 합:"+odd);
	}

}
