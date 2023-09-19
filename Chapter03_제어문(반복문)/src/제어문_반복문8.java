// 100번의 알파벳 난수 발생 ==> A, B, C의 갯수
public class 제어문_반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_a=0, num_b=0, num_c=0;
		
		// 갯수 ++ , 누적 += ==> 빈도수 계산
		
		for(int i=1;i<=100;i++)
		{
			char ch=(char)((Math.random()*26)+65); // A~Z 난수
			System.out.print(ch+" ");
			
			if(ch=='A')
			{
				num_a++;
			}
			else if(ch=='B')
			{
				num_b++;
			}
			else if(ch=='C')
			{
				num_c++;
			}
		}
		System.out.println("\n===== 결과값 =====");
		System.out.println("A의 갯수:"+num_a);
		System.out.println("B의 갯수:"+num_b);
		System.out.println("C의 갯수:"+num_c);

	}

}
