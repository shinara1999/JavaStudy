// 가위바위보 => 10번수행 => 최종결과값: 3승 2무 5패

import java.util.Scanner;

public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int win=0, lose=0, same=0; // 변수 선언 및 초기화
		
		// while문 사용 (게임 10번, 10바퀴)
		int i=1; // 1부터
		while(i<=10) // 10까지
		{
			System.out.println("====="+i+"번째 게임====="); // n번째 게임
			int com=(int)(Math.random()*3); // com이 무얼 낼지 랜덤으로 받는다. 0, 1, 2
			
			int user=0;	// ?? ------------------------------------------>
			// 중첩 while문 : 유효성검사 => 원하는 값이 입력되게 유도.
			while(true) // 무한루프
			{
				System.out.print("가위(0), 바위(1), 보(2): "); // user값은 입력으로 받는다.
				user=scan.nextInt(); // 입력에 scan변수
				
				if(user<0 || user>2) // user값이 0, 1, 2가 아닐 때 다시 입력하라는 명령문 작성
				{
					System.out.println("가위바위보를 입력하세요");
					continue; // 처음부터 수행이 가능
				}
				break; // 종료 => 소속 반복문만 제어.
			}
			
			System.out.print("컴퓨터: ");
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
			
			System.out.print("사용자: ");
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
			
			// 승패 결정
			int res=com-user; // res : com에서 user를 뺀 값
			if(res==-1 || res==2)
			{
				System.out.println("사용자 win");
				win++;
			}
			else if(res==1 || res==-2)
			{
				System.out.println("컴퓨터 win");
				lose++;
			}
			else
			{
				System.out.println("비겼다");
				same++;
			}
			i++; // 무한루프를 막기 위해 설정
		}
		System.out.println("===== 결과값 =====");
		System.out.printf("%d승 %d무 %d패\n", win, same, lose);
		
		scan.close();
	}

}
