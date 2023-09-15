// 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성

import java.util.Scanner;
public class 자바조건문문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("정수를 입력하시오:");
		int a=scan.nextInt();
		
		if(a>0)
		{
			System.out.println(a+"은(는) 양수입니다.");
		}
		
		if(a<0)
		{
			System.out.println(a+"은(는) 음수입니다.");
		}
		
		if(a==0)
		{
			System.out.println(a+"은(는) 0입니다.");
		}
		
		scan.close();
	}

}
