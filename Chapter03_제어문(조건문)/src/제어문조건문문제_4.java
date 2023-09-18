// 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라.
// 윤년 조건 : if((year%4==0 && year%100!=0)||(year%400==0))

import java.util.Scanner;
public class 제어문조건문문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int year;
		
		System.out.print("년도를 입력하세요:");
		year=scan.nextInt();
		
//		if((year%4==0 && year%100!=0)||(year%400==0))
//		{
//			System.out.println(year+"년은 윤년이다.");
//		}
		
		// 풀어쓰기
		if(year%4==0)
		{
			if(year%100!=0)
			{
				System.out.println(year+"년은 윤년이다.");
			}
			else
			{
				System.out.println(year+"년은 윤년이 아니다.");
			}
		}
		else if(year%400==0)
		{
			System.out.println(year+"년은 윤년이다.");
		}
		
		else
		{
			System.out.println(year+"년은 윤년이 아니다.");
		}
		
		scan.close();
	}

}
