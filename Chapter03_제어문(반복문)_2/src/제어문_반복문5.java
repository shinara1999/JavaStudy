/*
 * 		★
 * 		★★
 * 		★★★
 * 		★★★★
 * 
 * 		★★★★ 역순 : 더한다
 * 		★★★
 * 		★★
 * 		★	
 * 
 * 		i	j
 * 		1   4
 * 		2   3
 * 		3	2
 * 		4   1	=> 합: 5
 * 				   j는 합-i만큼까지가 범위이다.
 * 
 * 		A
 *      BC
 *      DEF
 *      GHIJ
 * 
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) // j가 i일때까지 별
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++) // j<=합-i
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		char c='A';
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}

	}

}
