// if ~ else
/*
 * 		예상되는 결과값이 두개로 나눠서 나오는 경우 => if~else
 * 		단일 => 결과값이 여러개가 동시에 나올 때
 * 		다중 => 여러개중에 한개만 수행
 */

// 국어, 영어, 수학 => 평균, 총점 => 평균 60이상 60미만

import java.util.Scanner;
public class 제어문_조건문2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		//변수선언
		//초기화 => 명시적 초기화 , 입력값 받아서 저장 , 임의로 발생
		System.out.print("국어 점수 입력:");
		int kor=scan.nextInt();
		System.out.print("영어 점수 입력:");
		int eng=scan.nextInt();
		System.out.print("수학 점수 입력:");
		int mat=scan.nextInt();
		
		// 결과값
		System.out.println("===== 결과값 =====");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		
		int total=kor+eng+mat;
		double avg=total/3.0;
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n", avg);
		
		// if문
		if(avg>=60)
		{
			System.out.println("합격입니다.");
		}
		else
		{
			System.out.println("불합격입니다.");
		}
		
		scan.close();

	}

}
