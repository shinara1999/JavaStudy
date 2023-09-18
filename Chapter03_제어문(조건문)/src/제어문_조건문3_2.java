/*
 * 		컴퓨터 vs 플레이어 => 가위바위보
 * 		--------------------------
 * 		=> 다중 조건문 이용 (경우의 수 9개)
 * 						 ----------- 조건문
 * 
 * 			컴퓨터			플레이어
 * 			 가위		  가위/바위/보
 * 			 바위		  가위/바위/보
 * 			  보			  가위/바위/보
 * 		    ------------------------ 0가위 1바위 2보
 * 			=> 중첩 if문 이용
 */
import java.util.Scanner;
public class 제어문_조건문3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com,user;
		com=(int)(Math.random()*3);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
		user=scan.nextInt();
		
		// 가공
		System.out.print("컴퓨터:");
		
		if(com==0)
		{
			System.out.println("가위");
		}
		else if(com==1)
		{
			System.out.println("바위");
		}
		else if(com==2)
		{
			System.out.println("보");
		}
		
		// 다음줄에 출력
		System.out.print("사용자:");
		
		if(user==0)
		{
			System.out.println("가위");
		}
		else if(user==1)
		{
			System.out.println("바위");
		}
		else if(user==2)
		{
			System.out.println("보");
		}
		
		// 승패여부 확인 (com-user)
//		if(com==0) // 컴퓨터 가위
//		{
//			if(user==0) // 가위 (0)
//			{
//				System.out.println("비겼습니다.");
//			}
//			else if(user==1) // 바위 (-1)
//			{
//				System.out.println("사용자 win");
//			}
//			else if(user==2) // 보 (-2)
//			{
//				System.out.println("컴퓨터 win");
//			}
//		}
//		else if(com==1) // 컴퓨터 바위
//		{
//			if(user==0) // 가위 (1)
//			{
//				System.out.println("컴퓨터 win");
//			}
//			else if(user==1) // 바위 (0)
//			{
//				System.out.println("비겼습니다.");
//			}
//			else if(user==2) // 보 (-1)
//			{
//				System.out.println("사용자 win");
//			}
//		}
//		else if(com==2) // 컴퓨터 보
//		{
//			if(user==0) // 가위 (2)
//			{
//				System.out.println("사용자 win");
//			}
//			else if(user==1) // 바위 (1)
//			{
//				System.out.println("컴퓨터 win");
//			}
//			else if(user==2) // 보 (0)
//			{
//				System.out.println("비겼습니다.");
//			}
//		}
		
		// 더욱 간단한 또다른 방법 (com-user 이용) => 권장 / 소스를 줄여야 한다.
		int res=com-user;
		if(res==-2 || res==1)
		{
			System.out.println("컴퓨터 win");
		}
		else if(res==2 || res==-1)
		{
			System.out.println("사용자 win");
		}
		else
		{
			System.out.println("비겼다");
		}
		
		scan.close();
	}

}
