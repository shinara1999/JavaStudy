// 13. 다음 결과를 출력하는 프로그램
/*
 * **********
 * **********
 * **********
 * **********
 * ********** (5행 10열)
 */

public class 제어문반복문문제_13to15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
// 14. 다음 결과를 출력하는 프로그램
/*
 * 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */	
		
		for(int i=1;i<=5;i++) // 1~5까지 5줄 출력
		{
			for(int j=1;j<=5;j++) // 1줄에 5개씩 출력
			{
				System.out.print(i); // 첫번째 줄에 1, 두번째 줄에 2... (i를 출력)
			}
			System.out.println(); // 줄바꿈
		}
		
// 15. 다음 결과를 출력하는 프로그램 (위랑 같은문제임)
		
	}

}
