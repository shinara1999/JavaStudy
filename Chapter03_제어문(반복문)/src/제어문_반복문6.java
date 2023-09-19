// 1~100까지 5의배수의 합과 갯수
public class 제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0, num=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				sum+=i;
				num++; // 갯수 출력하는 방법
			}
		}
		System.out.println("5의배수의 합:"+sum);
		System.out.println("5의배수의 갯수:"+num);

	}

}
