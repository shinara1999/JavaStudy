/*
 * 		2차 for
 * 		------
 * 		for(초기값;조건식;증가식) ===> 줄수(row)
 * 		{
 * 			for(초기값;조건식;증가식) ===> 실제 출력물 column 
 * 			{		 ----- 설정 (수열=방정식) => 수와 수의 관계
 * 								--------- 분석 (넘파이,판다스)
 * 									MatplotLib => 시각화
 * 									R => 자바에서 연동 (Rserve)
 * 				반복 수행 문장
 * 			}
 * 			System.out.println();
 * 		}
 * 		==> 등수구하기, 빈도구하기, 정렬(선택, 버블)...
 * 
 * 		   *
 * 		  **
 * 		 ***
 * 		****
 * 
 * 		 i   j   k
 * 		줄수	공백	별표
 * 		 1	 3   1
 * 		 2   2   2
 *       3   1   3
 *       4   0   4
 *       -----
 *       i+j=4   k=i
 *       j=4-i
 *       
 *       ****
 *        ***
 *         **
 *          *
 *       1  0  4
 *       2  1  3
 *       3  2  2
 *       4  3  1
 *       j=i-1 k=5-i
 */
public class 제어문_반복문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++) // 조건식 확인
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) // 조건식 확인
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 두번째 문제
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *        *
		 *       ***
		 *      *****
		 *       ***
		 *        *
		 *        
		 *        1 2
		 *        2 1
		 *        i  j
		 *        1  1
		 *        2  3
		 *        3  5  
		 *        
		 *        2*i-1 ==>
		 *        
		 *        1 1
		 *        2 2
		 *        i j      
		 *        1 3   j=4-i
		 *        2 1   j=i-1 => 두개 방정식 풀이 => j=4-i=i-1 => j=5-2*i
		 *        
		 *        *
		 *       ***
		 *      *****
		 *       ***
		 *        *
		 *    
		 */
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-2*i;k++) // 5-2*i
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
