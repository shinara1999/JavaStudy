// 업다운 게임

import java.util.Scanner;
public class 메소드_문제_6 {
	
	static int comRan()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(1~100):");
		int user=scan.nextInt();
		
		return user;
	}
	
	static String check(int user, int com)
	{
		String res="";
			if(com>user)
			{
				res="업!";
			}
			else if(com<user)
			{
				res="다운!";
			}
			else
			{
				res="게임 오버!!";
			}
		return res;
	}
	
	static void process()
	{
		int com=comRan();
		while(true) // while문은 process 안에서 작동
		{
			Scanner scan=new Scanner(System.in);
			int user=userInput();
			String res=check(user, com);
			System.out.println(res);
			if(res.contains("Game"))
			{
				System.out.println("게임을 다시 할까요?(y|n):");
				char ch=scan.next().charAt(0);
				if(ch=='y'||ch=='Y')
				{
					System.out.println("새로운 게임을 시작합니다.");
					process();
				}
				else
				{
					System.out.println("Game over!!");
					System.exit(0);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
//		// 컴퓨터가 숫자를 임의로 추출
//		int com=(int)(Math.random()*100)+1;
//		
//		Scanner scan=new Scanner(System.in);
//		
//		while(true)
//		{
//			System.out.print("정수 입력(1~100):");
//			int user=scan.nextInt();
//			
//			if(com>user)
//			{
//				System.out.println("업!");
//			}
//			else if(com<user)
//			{
//				System.out.println("다운!");
//			}
//			else
//			{
//				System.out.println("게임 오버!!");
//				break;
//			}
//		}

	}

}
