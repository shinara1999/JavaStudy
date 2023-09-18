/*
 *  정수 1개를 받는다
 *  1=> 메모장 , 2=> 그림판 3=> 브라우저 띄우기
 *  => 메뉴를 클릭하거나 버튼을 눌렀을 때의 처리 => GUI
 */

import java.util.Scanner;
public class 제어문_조건문3_3 {

	public static void main(String[] args) throws Exception{ // main 뒤에 붙이기 throws Exception
		// TODO Auto-generated method stub
		int no=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("번호 선택(1,2,3):");
		no=scan.nextInt();
		
		if(no==1)
		{
			System.out.println("메모장을 선택하셨습니다.");
		}
		else if(no==2)
		{
			System.out.println("그림판을 선택하셨습니다.");
		}
		else if(no==3)
		{
			System.out.println("브라우저를 선택하셨습니다.");
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // \\ : 겅로에서 역슬러시 2개줘야함.
		}
		else
		{
			System.out.println("메뉴가 존재하지 않습니다.");
		}
		
		scan.close();
	}

}
