// 메소드_4 => 메소드 제작
// 리턴형 , 매개변수 , 메소드명 => 가독성있게
// 입력 => 기능1
// 구구단 => 기능2

import java.util.Scanner;
public class 메소드_4_구현 {
	// 사용자로부터 정수값을 받는자
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력(2~9):");
		int dan=scan.nextInt();
		return dan;
	}
	
	// static void gugudan(int dan)
	// 받은 정수에 해당되는 구구단 출력
	static String gugudan(int dan)
	{
		String result=dan+"단\n";
		for(int i=1;i<=9;i++)
		{
			System.out.println(result+=dan+"*"+i+"="+i*dan+"\n");
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan=userInput();
		String gu=gugudan(dan);
		System.out.println(gu);

	}

}
