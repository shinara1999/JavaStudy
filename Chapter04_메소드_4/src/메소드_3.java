// 숫자 야구게임
/*
 *  1. 컴퓨터가 난수 발생 []
 *  2. 사용자가 입력
 *  3. 힌트
 *  4. 종료여부
 *  5. 조립
 */
import java.util.*;
public class 메소드_3 {
	
	// 1
	static int[] comRan()
	{
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--; // 다시발생
					break;
				}
			}
		}
		return com;
	}
	
	// 2
	static int[] userInput()
	{
		int[] user=new int[3];

		while(true)
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("숫자 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다.");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0을 사용할 수 없습니다.");
				continue;
			}
			break;
		}
		return user;
			
	}
	
	// 3
	static int hint(int[] com, int user[])
	{
		int s=0, b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
					{
						s++;
					}
					else
					{
						b++;
					}
				}
			}
		}
		System.out.printf("INput Number:%d%d%d, Result:%dS-%dB\n", user[0], user[1], user[2], s, b);
		return s;
	}
	
	// 4
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	
	// 5 조합
	static void process()
	{
		int[] com=comRan();
		int[] user=new int[3];
		while(true)
		{
			user=userInput();
			int s=hint(com, user);
			if(isEnd(s))
			{
				System.out.println("게임 오버!!");
				break;
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
//		int[] com=new int[3];
//		for(int i=0;i<com.length;i++)
//		{
//			com[i]=(int)(Math.random()*9)+1;
//			
//			for(int j=0;j<i;j++)
//			{
//				if(com[i]==com[j])
//				{
//					i--; // 다시발생
//					break;
//				}
//			}
//		}
//		// System.out.println(Arrays.toString(com));
//		
//		int[] user=new int[3];
//		while(true)
//		{
//			Scanner scan=new Scanner(System.in);
//			System.out.print("숫자 입력:");
//			int input=scan.nextInt();
//			if(input<100 || input>999)
//			{
//				System.out.println("잘못된 입력입니다.");
//				continue;
//			}
//			user[0]=input/100;
//			user[1]=(input%100)/10;
//			user[2]=input%10;
//			
//			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
//			{
//				System.out.println("같은 수는 사용할 수 없습니다.");
//				continue;
//			}
//			
//			if(user[0]==0 || user[1]==0 || user[2]==0)
//			{
//				System.out.println("0을 사용할 수 없습니다.");
//				continue;
//			}
//			
//			// 힌트
//			int s=0, b=0;
//			for(int i=0;i<3;i++)
//			{
//				for(int j=0;j<3;j++)
//				{
//					if(com[i]==user[j])
//					{
//						if(i==j)
//						{
//							s++;
//						}
//						else
//						{
//							b++;
//						}
//					}
//				}
//			}
//			System.out.printf("INput Number:%d, Result:%dS-%dB\n", input, s, b);
//			
//			// 종료 여부 확인
//			if(s==3)
//			{
//				System.out.println("Game over!!");
//				break;
//			}
//				
//		}

	}

}
