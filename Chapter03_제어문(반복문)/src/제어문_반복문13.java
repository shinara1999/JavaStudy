/*
 * 		주사위 2개를 던져서 합이 6이 나올 경우의수를 출력하시오.
 * 		2차 for문
 */
public class 제어문_반복문13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) // 첫번째 주사위
		{
			for(int j=1;j<=6;j++) // 두번째 주사위
			{
				if(i+j==6) // 두 주사위의 합이 6일 때
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}

	}

}
