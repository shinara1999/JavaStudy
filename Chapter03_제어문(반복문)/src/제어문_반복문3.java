// 정수 1개를 받아서 해당 구구단

import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int dan; // 변수의 초기화 (명시적, 입력값, 임의의 난수, 파일, 오라클)
		System.out.print("단 입력:");
		dan=scan.nextInt();
		
		for(int i=1;i<=9;i++) // 1부터 9까지 9바퀴
		{
			System.out.printf("%2d * %2d = %2d\n", dan, i, dan*i); // %d : 정수가 들어간다. %2d : 한자리에 두칸씩 차지
		}
		
		scan.close();
	}

}
