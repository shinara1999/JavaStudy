// 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
/*
 * 		리턴형 / 매개변수 (2)
 */

import java.util.Scanner;
public class 메소드문제_4 {
	
	static String div(int a, int b)
	{
		String result="";
			if(b==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.println(a+"/"+b+"="+a/b);
			}
			return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int a=scan.nextInt();
		System.out.print("두번째 정수:");
		int b=scan.nextInt();
		
		String res=div(a,b);
		System.out.println(res);

	}

}
