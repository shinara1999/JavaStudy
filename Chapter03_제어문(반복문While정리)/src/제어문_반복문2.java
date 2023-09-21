// 1~10에서 짝수만 출력
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== for =====");
		for(int i=2;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n===== while =====");
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++; // 증가식은 if문이 아닌 while문에 오도록 한다.
		}
		
		System.out.println("\n===== do~while =====");
		i=1;
		do
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
			
		}while(i<=10);
		// 반복문 안에 조건문...

	}

}
