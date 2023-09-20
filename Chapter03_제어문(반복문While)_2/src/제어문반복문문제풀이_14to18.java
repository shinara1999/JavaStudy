
public class 제어문반복문문제풀이_14to18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 14
		for(int i=1;i<=5;i++) // 줄개수
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i); // 1을 5개, 2를 5개...5를 5개
			}
			System.out.println();
		}
		
		// 16
		for(int i=1;i<=5;i++) // 줄개수
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		// 17
		char ch='A';
		for(int i=1;i<=5;i++) // 줄개수
		{
			ch='A';
			for(int j=1;j<=5;j++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
		
		// 18
		ch='A';
		for(int i=1;i<=5;i++) // 줄개수
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print(ch);
			}
			ch++; // ----------------------->
			System.out.println();
		}
		
				
		

	}

}
