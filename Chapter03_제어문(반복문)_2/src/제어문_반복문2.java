// 구구단 출력

public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) // 1~9 (줄수)
		{
			for(int j=2;j<=9;j++) // 2~9 (실제 출력문)
			{
				System.out.printf("%2d * %2d = %2d\t", j, i, j*i);
			}
			System.out.println();
		}

	}

}
