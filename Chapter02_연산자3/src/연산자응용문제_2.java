// 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. 알맞은 코드를 넣으세요.
// import java.util.Scanner;
public class 연산자응용문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = '홍';
	    boolean b = (ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'?true:false);
	    		  // ---- 대문자일 때 ---- or ---- 소문자일 때 ---- or ---- 숫자일 때 ----?참이면 true, 거짓이면 false 반환
	    System.out.println(b);

	    // Scanner로 char형 받아오는 방법
//	    Scanner scan=new Scanner(System.in);
//	    System.out.println("문자 입력:");
//	    char ch=scan.next().charAt(0);   // charAt(0) : 첫 번째 문자(0번)를 읽어온다는 뜻
//	    System.out.println("ch="+ch);
	    
	}

}
