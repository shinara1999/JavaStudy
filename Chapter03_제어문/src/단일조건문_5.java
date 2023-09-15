// 3개의 정수 받아서 총점, 평균, 학점구하기

// 100~97 A+ , 96~93 A0 , 92~90 A- ...

import java.util.Scanner;
public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("국어 점수:");		
		int kor=scan.nextInt();
		
		System.out.print("영어 점수:");
		int eng=scan.nextInt();
		
		System.out.print("수학 점수:");
		int mat=scan.nextInt();
		
		int total=kor+eng+mat;
		double avg=total/3.0;
		
		// 출력
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n", avg);
		
		/*
		 * 		특수문자
		 * 		\n : new line   => 새로운 줄에 출력
		 * 		\t : tab        => 일정 간격 띄기
		 * 		\" : "\"홍길동\"" => 따옴표까지 출력하고 싶을 때
		 */
		
		// 학점구하기 (간단한 방법)
//		int temp=(int)avg/10;
//		if(temp==10||temp==9)
//		{
//			System.out.println("학점:A");
//		}
//		if(temp==8)
//		{
//			System.out.println("학점:B");
//		}
//		if(temp==7)
//		{
//			System.out.println("학점:C");
//		}
//		if(temp==6)
//		{
//			System.out.println("학점:D");
//		}
//		if(temp<6)
//		{
//			System.out.println("학점:F");
//		}
		
		// 학점구하기 (두번째 방법)
		char score='A'; // 변수초기화
		char op=' '; // 변수초기화 (공백)
		if(avg>=90 && avg<=100)
		{
			score='A';
			if(avg>=97) // 중첩 if문
				op='+';
			if(avg>=93 && avg<=96)
				op='0';
			if(avg>=90 && avg<=93)
				op='-';
		}
		if(avg>=80 && avg<=90)
		{
			score='B';
			if(avg>=87)
				op='+';
			if(avg>=83 && avg<=86)
				op='0';
			if(avg>=80 && avg<=83)
				op='-';
		}
		if(avg>=70 && avg<=80)
		{
			score='C';
			if(avg>=77)
				op='+';
			if(avg>=73 && avg<=76)
				op='0';
			if(avg>=70 && avg<=73)
				op='-';
		}
		if(avg>=60 && avg<=70)
		{
			score='D';
			if(avg>=67)
				op='+';
			if(avg>=63 && avg<=66)
				op='0';
			if(avg>=60 && avg<=63)
				op='-';
		}
		if(avg<60)
		{
			score='F';
		}
		System.out.println("학점:"+score+op); // 문자열 결합
		
		
		scan.close();

	}

}
