// 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라. (다중 if 사용)

import java.util.Scanner;
public class 제어문조건문문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int score;
		
		System.out.print("성적을 입력하세요:");
		score=scan.nextInt();
		
		if(score>=90)
		{
			System.out.println("A학점 입니다.");
		}
		else if(score>=80)
		{
			System.out.println("B학점 입니다.");
		}
		else if(score>=70)
		{
			System.out.println("C학점 입니다.");
		}
		else if(score>=60)
		{
			System.out.println("D학점 입니다.");
		}
		else
		{
			System.out.println("F학점 입니다.");
		}
		
		scan.close();
	}

}
