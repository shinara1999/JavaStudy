/*
 * 	정수1개 입력받는다
 * 	>>11 같은숫자
 * 	>>23 다른숫자
 */

import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int num;
		System.out.print("1~99사이의 수를 입력하세요:");
		
		num=scan.nextInt();
		
		if(num>=1 && num<=99)
		{	
//			int a=num/10;
//			int b=num%10;
//			if(a==b)        => 이 방식도 사용 가능하다.
			
			if(num%11==0) // 11로 나눈 나머지값을 이용
			{
				System.out.println(num+"은(는) 같은 숫자이다.");
			}
		
			if(num%11!=0)
			{
				System.out.println(num+"은(는) 다른 숫자이다.");
			}
			
		}
		
		if(num<1 || num>99)
		{
			System.out.println("잘못된 입력값입니다!");
		}
		
		scan.close();
	}

}
