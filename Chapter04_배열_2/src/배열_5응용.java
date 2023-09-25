/*
 * 	숫자야구게임
 * 		---------
 * 		1. 3자리 난수 발생 (각 자리가 중복이 되면 안된다.) 배열 이용
 * 		2. 사용자가 입력
 * 		3. 비교
 * 		   숫자가 있으면 B, 숫자도 있고 자릿수도 같으면 S
 * 		4. 3스트라이크시 게임 종료
 */
import java.util.Scanner;
public class 배열_5응용 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 컴퓨터의 배열 선언 (3자리수니까 3칸)
		int[] com=new int[3];
		
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 컴퓨터에게 받는 수 : 랜덤한 세 숫자 **각자리 중복 안되게
			for(int j=0;j<i;j++) // 중복 안되게 설정 j : 0부터 i전까지
			{
				if(com[i]==com[j]) // 중복이 되면?
				{
					i--; // i를 빼고 다시 돌린다
					break; // 3자리 완성되면 break
				}
			}
		}
		int[] user=new int[3]; // 사용자 입력값 => 3자리 입력
		// 출력
		// System.out.println("%d%d%d/n", com[0], com[1], com[2]);
		
		// 사용자 입력 while true (몇번만에 맞출지 모르니까)
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("3자리 정수 입력:");
			int input=scan.nextInt(); // input : 입력변수
			if(input<100 || input>999) // 3자리수 이므로 100보다 작거나 999보다 크면 오류발생
			{
				System.out.println("잘못된 입력입니다!!");
				continue; // while의 조건식으로 이동해서 숫자 다시 작성 (처음으로)
				// While문 처음으로 되돌아간다.
			}
			// 정상적으로 입력했을 때
			user[0]=input/100; // 0번인덱스 : 100으로 나눴을 때의 몫
			user[1]=(input%100)/10; // 1번인덱스 : 100으로 나눈것의 나머지를 다시 10으로 나누었을때의 몫
			user[2]=input%10; // 2번인덱스 : 10으로 나누었을 때의 나머지
			
			// 오류체크
			if(user[0]==user[1] || user[1]==user[2] || user[2]==user[0]) // 사용자가 중복된 수를 입력했을 때
			{
				System.out.println("같은 수는 사용할 수 없다.");
				// 처음부터 입력해야 함.
				continue; 
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) // 0 사용하면 오류 발생
			{
				System.out.println("0은 사용할 수 없다.");
				continue;
			}
			
			// 힌트
			int s=0, b=0; // s : strike , b : ball
			for(int i=0;i<com.length;i++) // 컴퓨터의 3자리, 사용자의 3자리를 각각 비교해야 하므로 중첩 for문 사용
			{
				for(int j=0;j<user.length;j++)
				{
					if(com[i]==user[j]) // 같은 수가 있다면
					{
						if(i==j) // 같은 자리에 있다면
						{
							s++; // 스트라이크가 한개 증가
						}
						else // 같은 수'만' 있다면 (같은자리는X)
						{
							b++; // 볼이 한개 증가
						}
					}
				}
			}
			System.out.println("Input Number:"+input+" ,Result:"+ s+"S-"+b+"B");
			
			// 종료여부
			if(s==3) // 스트라이크가 3개면 게임 종료
			{
				System.out.println("Game Over!!");
				break; // 종료 후 반복문 빠져나간다
			}
		}
	}

}
