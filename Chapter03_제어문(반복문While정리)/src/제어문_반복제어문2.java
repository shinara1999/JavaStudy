/*
 * 		break ==> while , for
 * 		==> System.exit(0) 은 사용하지 않는 것을 권장.
 */
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		i=1 => j=1, j=2, j=3
		 * 		i=2 => j=1, j=2, j=3
		 * 		i=3 => j=1, j=2, j=3 => 9바퀴 돈다.
		 */
		System.out.println("===== break =====");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					break; // 2에서부터 빠져나간다. (2, 3 전부 출력X)
				}
				System.out.println("i="+i+",j="+j);
			}
		}
		
		System.out.println("===== continue =====");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					continue; // 2만 제외한다. 
				}
				System.out.println("i="+i+",j="+j);
			}
		}
		
		System.out.println("===== 이름 있는 break =====");
		outer:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
				{
					break outer; // 1차, 2차 모두 제어
				}
				System.out.println("i="+i+",j="+j);
			}
		}

	}

}
