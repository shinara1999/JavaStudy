/*
 * 		updown 게임
 * 			
 * 			컴퓨터 난수 발생 : 1~100
 * 			=> 힌트
 * 				=> 정답이 나올때까지 반복 수행 (횟수X, 무한루프)
 * 				   for(;;) => while(true)
 */

import java.util.Scanner;
// import java.lang.* => 시스템에서 자동으로 추가되는 import
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int count=0;
		
		// 난수 발생
		int com=(int)(Math.random()*100)+1;
		
		for(;;) // 무한루프
		{
			System.out.print("1~100사이의 값을 입력하시오:");
			int user=scan.nextInt();
			
			if(user<1 || user>100) // 비정상 입력
			{
				System.out.println("잘못된 입력입니다.");
				continue; // false일 때 다시 처음으로 돌아가게 만든다.
			}
			
			count++;
			// 힌트 (정상 입력)
			if(com>user)
			{
				System.out.println("높은 정수 입력(UP)");
			}
			else if(com<user)
			{
				System.out.println("낮은 정수 입력(DOWN)");
			}
			else // 정답 (같을때)
			{
				System.out.println("Game over!!");
				System.out.println("입력횟수:"+count);
				System.exit(0); // 종료 => break , System.exit(0) 0번 정상종료, 1번 비정상종료
			}
		}
		
	}
	// return; => main 뒤에 자동으로 첨부됨.

}
