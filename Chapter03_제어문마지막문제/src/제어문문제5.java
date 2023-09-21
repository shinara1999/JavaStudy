// 5.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
/*
 * 		예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
			평균은 5.4
			[Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
			int i  = (int)(Math.random()*10)+1;

 */
public class 제어문문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		double avg=0;
		
		// for문
		for(int j=1;j<=10;j++)
		{
			int i=(int)(Math.random()*10)+1; // 1-10까지 랜덤생성
			System.out.print(i+" ");
			sum+=i;
			avg=sum/10.0;
		}
		System.out.println();
		System.out.print(avg);
		
		// while문
//		int j=1;
//		while(j<=10)
//		{
//			int i=(int)(Math.random()*10)+1;
//			System.out.print(i+" ");
//			sum+=i;
//			avg=sum/10.0;
//			j++;
//		}
//		System.out.println();
//		System.out.print(avg);
		
		// do~while문
//		int j=1;
//		do {
//			int i=(int)(Math.random()*10)+1;
//			System.out.print(i+" ");
//			sum+=i;
//			avg=sum/10.0;
//			j++;
//		}while(j<=10);
//		System.out.println();
//		System.out.print(avg);
		
		

	}

}
