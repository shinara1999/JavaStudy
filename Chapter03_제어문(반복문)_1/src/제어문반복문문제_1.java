// 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)

public class 제어문반복문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0; // 누적변수
		
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("합: "+sum);
	}

}
