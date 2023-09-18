// 다중 조건문

/*
 * 		다중 조건문 => 결과값 1개만 도출
 * 			형식)
 * 				if(조건문)
 * 				{
 * 					조건문이 true일 때 수행 후 종료 (밀에 문장 수행 X)
 * 				}
 * 				else if(조건문)
 * 				{
 * 					false일 때
 * 				}
 * 				else if(조건문)
 * 				{
 * 					false일 때
 * 				}
 * 				...
 * 				...
 * 				else => 생략 가능 (해당 조건이 없는 경우에 처리)
 * 				{
 * 			
 * 				}
 * 
 * 				==> 한 개의 문장만 수행
 * 				==> 게임, 네트워크 서버 개발 등
 */

// 국어, 영어, 수학 점수 입력받고 총점, 평균, 학점, 합격 불합격 출력

import java.util.Scanner;
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int kor, mat, eng, total;
		double avg;
		char score=' '; // 학점
		
		System.out.print("국어 점수 입력: ");
		kor=scan.nextInt();
		System.out.print("영어 점수 입력: ");
		eng=scan.nextInt();
		System.out.print("수학 점수 입력: ");
		mat=scan.nextInt();
		
		total=kor+eng+mat;
		avg=total/3.0;
		
		System.out.println("===== 결과값 도출 =====");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n", avg);
		
		if(avg>=60)
		{
			if(avg>=90)
			{
				score='A';
			}
			else if(avg>=80)
			{
				score='B';
			}
			else if(avg>=70)
			{
				score='C';
			}
			else if(avg>=60)
			{
				score='D';
			}
			System.out.println("학점:"+score);
			System.out.println("합격입니다.");
		}
		else
			System.out.println("불합격입니다.");
		
		scan.close();

	}

}
