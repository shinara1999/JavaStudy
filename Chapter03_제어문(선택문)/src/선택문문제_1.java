// 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라. (switch~case 사용)

import java.util.Scanner;
public class 선택문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int score,score2;
		
		System.out.print("점수 입력(정수):");
		score=scan.nextInt();
		score2=(int)(score/10);
		char hak=' ';
		
		switch(score2) // switch(정수, 문자, 문자열)
		{
		default:
			hak='F';
			break;
		case 10:
		case 9:
			hak='A';
			break;
		case 8:
			hak='B';
			break;
		case 7:
			hak='C';
			break;
		case 6:
			hak='D';
			break;
			
		}
		System.out.println(hak+"학점 입니다.");
		scan.close();
	}

}
