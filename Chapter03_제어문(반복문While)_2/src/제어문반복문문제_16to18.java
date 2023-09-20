// 16. 다음 결과를 출력하는 프로그램
/*
 * 1####
 * #2###
 * ##3##
 * ###4#
 * ####5
 */
public class 제어문반복문문제_16to18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j) // 첫번째줄 첫번째자리, 두번째줄 두번째자리...
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("#"); // 그 외의 자리
				}
			}
			System.out.println();
		}
		
		
		
// 17. 다음 결과를 출력하는 프로그램
/*
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 * ABCDE
 */		// char c='A'; => *** A부터 루프하는데 구간이 없으므로 ABCDEFGHIJK... 나오게 된다. ***so, 변수의 위치가 중요!!
		for(int i=1;i<=5;i++)
		{
			char c='A'; // A부터 루프 AAAAAAA...
			for(int j=1;j<=5;j++)
			{
				System.out.print(c++); // c++ : c가 한개씩 증가해야 한다. (안그러면 A만 나옴)
									   //		ABCDEABCDEABCDE...
			}
			System.out.println();
		}
		
		
		
// 18. 다음 결과를 출력하는 프로그램
/*
 * AAAAA
 * BBBBB
 * CCCCC
 * DDDDD
 * EEEEE
 */
		char ch='A'; // for문 밖에서 선언 : AAAAAAAAAAAA...
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(ch);
			}
			ch++; // 중첩 밖에서 더해주기  -> 한줄씩 동일한거 출력할 때
			System.out.println();
		}
	}

}
