
import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor, eng, mat, total;
		double avg;
		
		Scanner scan=new Scanner(System.in);
		/*
		 * 		for(int i=1;i<=3;i++) =========> while 반복 없애기
		 * 		{
		 * 			System.out.print("국어 점수:");
					kor=scan.nextInt();
					if(kor>=0 && kor<=100)
					{
						break;
					}
				}
		 */
		
		while(true) // 무한루프 ==> 반드시 종료조건이 필요하다.
		{
			System.out.print("국어 점수:");
			kor=scan.nextInt();
			if(kor>=0 && kor<=100)
			{
				break; // 종료
			}
		}
		while(true) // 무한루프
		{
			System.out.print("영어 점수:");
			eng=scan.nextInt();
			if(eng>=0 && eng<=100)
			{
				break; // 종료
			}
		}
		while(true) // 무한루프
		{
			System.out.print("수학 점수:");
			mat=scan.nextInt();
			if(mat>=0 && mat<=100)
			{
				break; // 종료 (1~100 사이가 안나오면 무한루프)
			}
		}
		
		total=kor+eng+mat;
		avg=total/3.0;
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		
		scan.close();

	}

}
