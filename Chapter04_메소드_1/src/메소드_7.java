// 로그인 처리
// 사용자로부터 받아야 하는 값 : id , pwd => 매개변수
// 로그인여부 확인 => void(해당 메소드 처리) , 결과값을 받을건지..?
// 결과값을 받아서 처리 : boolean , int(0,1) , String

import java.util.Scanner;
public class 메소드_7 {
	static String userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"입력:"); // 아이디와 비밀번호 한번에 받기
		String input=scan.next();
		return input;
	}
	// boolean 사용
	static boolean isLogin(String id, String pwd)
	{
		final String ID="admin"; // 상수
		final String PWD="1234";
		boolean bCheck=false;
		
		if(id.equals(ID) && pwd.equals(PWD))
		{
			bCheck=true;
		}
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id=userInput("아이디 ");
		String pwd=userInput("비밀번호 ");
		
		// boolean 사용
		// boolean => bXxxx / isXxx => 리턴형 boolean
		boolean bCheck=isLogin(id, pwd); // 위의 bCheck와는 다른 변수이다.
		
		if(bCheck==true)
		{
			System.out.println("메인 화면으로 이동...(response.sendRedirect('main.jsp'))");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀립니다..(history.back())");
		}
		
	}

}
