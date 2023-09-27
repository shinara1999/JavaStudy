/*
 * 		학생 3명에 대한 성적 계산
 * 		1. 이름
 * 		2. 국어점수
 * 		3. 영어점수
 * 		4. 수학점수
 * 		5. 총점
 * 		6. 평균
 */

import java.util.Scanner;
public class 문자열_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	
		String[] names=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] mat=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
	
		for(int i=0;i<kor.length;i++)
		{
			System.out.print("이름 입력:");
			names[i]=scan.next();
			System.out.print("국어 입력:");
			kor[i]=scan.nextInt();
			System.out.print("영어 입력:");
			eng[i]=scan.nextInt();
			System.out.print("수학 입력:");
			mat[i]=scan.nextInt();
		
			total[i]=kor[i]+eng[i]+mat[i];		
			avg[i]=total[i]/3.0;
		}
		// 출력 -> 다시하기
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-8s%-5d%-5d%-5d%-7d%.2f-7d", names[i], kor[i], eng[i], mat[i], total[i], avg[i]);
		}

	}
}
