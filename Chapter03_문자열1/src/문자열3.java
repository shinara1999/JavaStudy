// 문자열을 입력받아 A가 몇개인지 확인

import java.util.Scanner;
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("문자열 입력:");
		String data=scan.next();
		
		int count=0; // A의 개수 저장 (A||a)
		// charAt(); 사용 => 문자를 한개씩 잘라올 때 사용
		for(int i=0;i<data.length();i++) // .length()를 이용해 전체길이를 가져와서 최대범위 설정 // 0번부터 시작하니까 <=(X), <(O)
		{
			char c=data.charAt(i);
			if(c=='A' || c=='a')
			{
				count++;
			}
		}
		System.out.println("A|a의 갯수는 "+count+"개 입니다.");
		
		

	}

}
