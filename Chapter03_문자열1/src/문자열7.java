// equals, equalsIgnoreCase

import java.util.Scanner;
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin", MPWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String id=scan.next();
		System.out.print("PW 입력:");
		String pwd=scan.next();
		
		// equals는 대소문자를 구분한다.
		if(id.equalsIgnoreCase(MID) && pwd.equals(MPWD))
		{
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else
		{
			System.out.println("ID나 PW가 틀립니다.");
		}
		
		// 검색기는 대소문자를 구분하면 안된다.
		/*
		 * 	equals() : 대소문자를 구분하여 찾아준다.
		 *  equalsIgnoreCase() : 대소문자 구분없이 찾아준다.
		 */
		
	}

}
