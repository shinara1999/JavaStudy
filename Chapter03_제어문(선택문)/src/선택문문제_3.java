// 중첩 switch case
// switch 안에 switch, if, for 등등 조건문은 다 들어갈 수 있다.

import java.util.Scanner;
public class 선택문문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int com=(int)(Math.random()*3);
		System.out.print("가위(0), 바위(1), 보(2):");
		int user=scan.nextInt();
		
		switch(com)
		{
		case 0: // 컴퓨터 가위
			switch(user)
			{
			case 0:
				System.out.println("비겼다");
				break;
			case 1:
				System.out.println("사용자 이겼다");
				break;
			case 2:
				System.out.println("컴퓨터 이겼다");
				break;
			}
			break;
		case 1: // 컴퓨터 바위
			switch(user)
			{
			case 0:
				System.out.println("컴퓨터 이겼다");
				break;
			case 1:
				System.out.println("비겼다");
				break;
			case 2:
				System.out.println("사용자 이겼다");
				break;
			}
			break;
		case 2: // 컴퓨터 보
			switch(user)
			{
			case 0:
				System.out.println("사용자 이겼다");
				break;
			case 1:
				System.out.println("컴퓨터 이겼다");
				break;
			case 2:
				System.out.println("비겼다");
				break;
			}
			break;
		}
		
		scan.close();
	}

}
