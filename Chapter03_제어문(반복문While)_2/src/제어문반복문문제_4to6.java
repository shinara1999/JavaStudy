// 4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성

import java.util.Scanner;
public class 제어문반복문문제_4to6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("ch 입력:");
		char ch=scan.next().charAt(0);
		
		if(ch>='0' && ch<='9')
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

// 5.  두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(i+j==6)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
		
// 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
		
		System.out.print("첫번째 정수 입력: ");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력: ");
		int b=scan.nextInt();
		
		int x=1;
		
		for(int i=a;i<=b;i++)
		{
			x*=i;
		}
		System.out.println(x);

	}

}
