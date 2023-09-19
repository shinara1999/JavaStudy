// 20개의 정수 난수 발생 => 짝수의 개수, 홀수의 개수

public class 제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int three=0, five=0, seven=0;
		
		for(int i=1;i<=20;i++)
		{
			int rand=(int)(Math.random()*10)+1; // 1~10
			System.out.print(rand+" "); // 한줄에 출력되게 함.
			if(rand%3==0)
			{
				three++; // count
			}
			if(rand%5==0)
			{
				five++;
			}
			if(rand%7==0)
			{
				seven++;
			}
			
		}
		System.out.println("\n===== 결과값 =====");
		System.out.println("3의배수의 갯수:"+three);
		System.out.println("5의배수의 갯수:"+five);
		System.out.println("7의배수의 갯수:"+seven);
		
		// 1-2+3-4+5-6+7-8+9-10 ====================================> ??
		System.out.println("==============================");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i; // 짝수일 때 -
			else
				sum+=i; // 홀수일 때 +
		}
		System.out.println(sum);
		
		// BDFHJLN
		for(char c='B';c<='N';c+=2)
		{
			System.out.print(c+" ");
		}

	}
	/*
	 * 		for문 수행시에 => 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다.)
	 */

}
