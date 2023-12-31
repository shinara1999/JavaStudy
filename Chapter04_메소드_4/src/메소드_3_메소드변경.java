/*
 * 	1. 컴퓨터가 난수 발생 => com[]
 * 	   리턴 => int[] 매개변수(X)
 *  2. 사용자가 입력 => user[]
 *     리턴 => int[] 매개변수(X)
 *  3. 힌트 => (com[], user[]) => s, b 추출
 *     리턴 int (s) 매개변수 com[], user[]
 *  4. 종료여부 => s
 *     리턴 boolean 매개변수 int (s)
 *  5. 조립
 */

import java.util.*;
public class 메소드_3_메소드변경 {
	
	// 컴퓨터가 난수 발생
	static int[] getRand()
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
		return com; // com 넘겨주기
	}
	
	// 사용자 입력
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
			break; // while문이 무한루프에 걸려있기 때문에 break 사용
		}
		return user;
	}
	
	// 힌트
	static int hint(int[] com, int[] user) // 매개변수로 위의 com[] user[] 을 받아왔다.
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
		System.out.printf("Input Number:%d%d%d, Result:%dS-%dB\n", user[0], user[1], user[2], s, b);
		print(s, b);
		return s; // 종료 메소드에서 s의 개수로 판별하기 때문에 s를 넘겨준다.
	
	}
	
	// 종료
	static boolean isEnd(int s) // 리턴받은 s값 가져오기
	{
		boolean bCheck=false;
		if(s==3)
		{
			bCheck=true;
		}
		return bCheck;
	}
	
	// S: ● , B: ○
	static void print(int s, int b)
	{
		System.out.println("========== 전광판 ==========");
		System.out.print("S:");
		
		for(int i=0;i<s;i++)
		{
			System.out.print("●");
		}
		System.out.print("\nB:");
		for(int i=0;i<b;i++)
		{
			System.out.print("○");
		}
		System.out.println("\n===========================");
	}
	
	// 조립
	static void process()
	{
		int[] com=getRand();
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			user=userInput();
			int s=hint(com, user);
			
			if(isEnd(s))
			{
				System.out.print("게임을 다시 할까요?(y|n):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y')
				{
					System.out.println("=== new GAME ===");
					process(); // 재귀호출
				}
				else
				{
					System.out.println("게임 오버!!");
					break;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();

	}

}
