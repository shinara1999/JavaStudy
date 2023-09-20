/*
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 * 		★★★★★
 *  
 * 		ABCDE
 * 		FGHIJ
 * 		KLMNO
 * 		PQRST
 * 
 * 		ABCDE
 * 		ABCDE
 * 		ABCDE
 * 		ABCDE
 * 
 * 		★☆☆☆
 * 		☆★☆☆
 * 		☆☆★☆
 * 		☆☆☆★
 */
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++) // 4줄
//		{
//			for(int j=1;j<=5;j++) // 별 5개
//			{
//				System.out.print("★"); // 한줄에 출력해야 하므로 print사용
//			}
//			System.out.println();
//		}
		
//		char c='A'; // 변수 설정 (A부터) : for문 밖
//		
//		for(int i=1;i<=4;i++) // 4줄
//		{
//			for(int j=1;j<=5;j++) // 5개씩
//			{
//				System.out.print(c++); // A부터 1개씩 증가
//			}
//			System.out.println(); // 줄바꿈
//		}
		
		
		for(int i=1;i<=4;i++) // 4줄
		{
			char c='A'; // 변수 설정 : for문 안
			for(int j=1;j<=5;j++) // 5개씩
			{
				System.out.print(c++); // A부터 1개씩 증가 : for문을 돌릴때마다 초기값이 A로 바뀐다.
			}
			System.out.println(); // 줄바꿈
		}
		
		char c1='★', c2='☆';
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j) // 첫번째줄의 첫번째 위치에 검정별
				{
					System.out.print(c1);
				}
				else // 나머지 흰별
				{
					System.out.print(c2);
				}
			}
			System.out.println();
		}
		
	}

}
