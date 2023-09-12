/*
 * 	변수의 초기화
 * 		1) 변수 추출
 * 		2) 변수 선언(데이터형)
 * 		3) 변수 초기화
 * 			= 명시적인 초기화
 * 				int a=10; 직접 값을 넣어주는 것
 * 			= 입력값을 받는 경우
 * 				Scanner : 키보드 입력값을 받을 때 사용
 * 				BufferedReader : 예외처리해야한다는 단점이 있다.
 * 			= 임의값을 받아서 초기화
 * 				------ 랜덤
 * 			= 크롤링 => 브라우저에 있는 값을 읽어와서 초기값을 줌
 * 
 */
// import java.util.Scanner; // 자바에서 필요한 클래스를 읽을 때 import를 사용한다.
public class 자바변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int a=100;
		int b=(int)(Math.random()*100); // Math.random()은 double형을 갖고들어오므로 int로 형변환 시켜줘야 한다.
								        // Math.random()은 0.0 이상 1.0 미만의 값 => int 형변환 시 무조건 0이 나오게 된다.
		
		// Math.random()*100 => 0~99
		// (Math.random()*100)+1 => 1~100
		
		Scanner scan=new Scanner(System.in); // System.in => 키보드 입력값
		
		System.out.println("정수입력:");
		int c=scan.nextInt();
		System.out.println(c); */
		
		// 임시변수
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
	}

}
