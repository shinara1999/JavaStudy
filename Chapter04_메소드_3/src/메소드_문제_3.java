// 국어, 영어, 수학점수 입력받기 => 총점, 평균 출력 + 학점

import java.util.*;
public class 메소드_문제_3 {
	
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"점수:");
		int num=scan.nextInt();
		return num;
	}
	
	static int total(int kor, int eng, int mat)
	{
		return kor+eng+mat;
	}
	
	static double avg(int total)
	{
		return total/3.0;
	}
	
	static char score(int avg)
	{
		char score=' ';
		switch(avg)
		{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		return score;
		
	}
	
	static void print(int kor, int eng, int mat, int total, double avg, char score)
	{
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n", kor, eng, mat, total, avg, score);
	}
	
	static void process()
	{
		int kor=userInput("국어");
		int eng=userInput("영어");
		int mat=userInput("수학");
		int total=total(kor, eng, mat);
		double avg=avg(total);
		char score=score((int)(avg/10));
		print(kor, eng, mat, total, avg, score);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("국어 점수:");
//		int kor=scan.nextInt();
//		System.out.print("영어 점수:");
//		int eng=scan.nextInt();
//		System.out.print("수학 점수:");
//		int mat=scan.nextInt();
//		
//		int total=kor+eng+mat;
//		double avg=total/3.0;
//		
//		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f", kor, eng, mat, total, avg);
		
//		int kor=userInput("국어");
//		int eng=userInput("영어");
//		int mat=userInput("수학");

	}

}
