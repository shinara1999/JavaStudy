// 3명의 학생 => 국어 , 영어 , 수학 입력 후 총점, 평균, 학점, 등수 출력

import java.util.Arrays;
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 배열 선언
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] mat=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3]; // 같은 int여도 다 따로 묶어줘야 한다.
		double[] avg=new double[3];
		char[] score=new char[3];
		
		// 입력초기화 : 국, 영, 수
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 학생의 국어점수:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생의 영어점수:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번째 학생의 수학점수:");
			mat[i]=scan.nextInt();
			
			// 총점, 평균
			total[i]=kor[i]+eng[i]+mat[i];
			avg[i]=total[i]/3.0;
			
		}
		// 학점 출력
		for(int i=0;i<kor.length;i++)
		{
			switch((int)(avg[i])/10)
			{
				case 10:
				case 9:
					score[i]='A';
					break;
				case 8:
					score[i]='B';
					break;
				case 7:
					score[i]='C';
					break;
				case 6:
					score[i]='D';
					break;
				default:
					score[i]='F';		
			}
		}
		
		// 등수구하기 (total사용)
		for(int i=0;i<total.length;i++) // 1차 for문
		{
			rank[i]=1;
			for(int j=0;j<total.length;j++) // 2차 for문
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		
		// 출력
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n", kor[i], eng[i], mat[i], total[i], avg[i], score[i], rank[i]);
		}
		
		

	}

}
