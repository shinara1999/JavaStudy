// 사용자로부터 정수 1개 받아서 구구단 출력

import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("단수를 입력하세요:");
		int dan=scan.nextInt();
		
		int i=1;
		while(i<=9)
		{
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			i++;
		}
		scan.close();

	}

}
