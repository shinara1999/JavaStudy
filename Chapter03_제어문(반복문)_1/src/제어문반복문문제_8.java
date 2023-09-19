// 100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성

public class 제어문반복문문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0, count=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("7의배수갯수:"+count);
		System.out.println("7의배수합:"+sum);
	}

}
