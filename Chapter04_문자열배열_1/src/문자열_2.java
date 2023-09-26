// 사용자로부터 입력값(문자열) => 좌우대칭 여부확인
// ABBA => 1) 문자개수가 짝수인가? (length)

import java.util.*;
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// String msg; // null값 => 출력시 오류 발생
		String msg="";
		while(true)
		{
			System.out.print("문자열 입력:");
			msg=scan.next();
			if(msg.length()%2==0)
			{
				break;
			}
		}
		
		// 좌우대칭 확인
		int j=msg.length()-1;
		boolean bCheck=true;
		for(int i=0;i<msg.length()/2;i++)
		{
			
			char c=msg.charAt(i);
			char c1=msg.charAt(j);
			System.out.println(c+","+c1);
			
			if(c!=c1)
			{
				bCheck=false;
				break;
			}
			j--;
		}
		
		if(bCheck==false)
		{
			System.out.println(msg + "대칭구조가 아니다.");
		}
		else
		{
			System.out.println(msg + "좌우대칭이다!");
		}
	}

}
