// 7. 5~16까지의 합을 구하시오.

public class 제어문반복문문제_7to9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=5;i<=16;i++)
		{
			sum+=i;
		}
		System.out.println("5~16까지의 합: "+sum);
		
// 8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.

		int even=0;
		
		for(int i=4;i<=4462;i+=2)
		{
			even+=i;
		}
		System.out.println("3이상 4462 이하에서 짝수인 정수의 합: "+even);

// 9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

		int two=0, three=0;
		
		for(int i=0;i<=12;i++)
		{
			if(i%2==0)
			{
				two+=i;
			}
			if(i%3==0)
			{
				three+=i;
			}
		}
		System.out.println("2의 배수의 합:"+two);
		System.out.println("3의 배수의 합:"+three);

	}

}
