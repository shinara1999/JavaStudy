// 3명의 학생의 국영수 점수 받아서 총점평균 구하기 ===> ***배열이용***

import java.util.Scanner;
public class 배열_생성1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열_생성.print(7);
		Scanner scan=new Scanner(System.in);
		
		// 배열 이용 => 종류별로 모으기
		int[] kor=new int[3]; // = int kor1, kor2, kor3;
		int[] eng=new int[3]; // = int eng1, eng2, eng3;
		int[] mat=new int[3]; // = int mat1, mat2, mat3;
		int[] total=new int[3]; // = int total1, total2, total3;
		double[] avg=new double[3]; // = double avg1, avg2, avg3;
		
		for(int i=0;i<3;i++) // 3바퀴
		{
			System.out.print((i+1)+"번쩨 학생 국어점수 입력:"); // 0부터니까 +1
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번쩨 학생 영어점수 입력:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번쩨 학생 수학점수 입력:");
			mat[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+mat[i];
			avg[i]=total[i]/3.0;
		}
		
		for(int i=0;i<3;i++) // 3바퀴
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n", kor[i], eng[i], mat[i], total[i], avg[i]);
		}
		
		
	}

}
