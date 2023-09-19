// 1~100까지 => 3의배수의 합, 5의배수의 합, 7의배수의 합 출력

public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum3=0, sum5=0, sum7=0; // 변수 3개 선언
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				sum3+=i;
			}
			if(i%5==0) // 중복되는 것이 있기 때문에 else if 사용 불가, if문 3개를 사용해야 한다.
			{
				sum5+=i;
			}
			if(i%7==0)
			{
				sum7+=i;
			}
		}
		System.out.println("3의배수의 합:"+sum3);
		System.out.println("5의배수의 합:"+sum5);
		System.out.println("7의배수의 합:"+sum7);
	}

}
