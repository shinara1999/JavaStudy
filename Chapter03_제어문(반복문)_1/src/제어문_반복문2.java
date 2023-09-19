/*
 * 		1차 for
 * 		for(시작점;어디까지;몇씩증가)
 * 		    (초기값;조건식;증감식)
 * 		예) 1~100
 * 		   int i=1;i<=100;i++
 * 		예) 1~100 홀수 출력
 * 		   int i=1;i<=100;i+=2
 * 		예) 1~100 짝수 출력
 * 		   int i=2;i<=100;i+=2
 * 		----------------------------------------
 * 		문자는 정수 (문자는 모든 연산시에 정수로 들어간다.
 * 		for(int i=...
 * 			=> for문에서 선언된 변수는 for문 {} 안에서만 사용 가능
 * 			   (자동 소멸)
 * 		변수 사용 범위 {} 메모리 해제
 * 		
 * 		***지역변수 : 해당 범위 내에서만 작동하는 변수
 * 		{
 * 			int a=10;
 * 			{
 * 				int b=20;
 * 				{
 * 					int c=30;
 * 				}
 * 			}
 * 			
 * 		}
 * 
 * 		중첩 for => 2차 for문
 * 	
 * 		for(초기값;조건식;증감식)
 * 		{
 * 			for(초기값;조건식;증감식) => 핵심!!
 * 			{
 * 
 * 			}
 * 		}
 */
public class 제어문_반복문2 {
	// static int aaaa=100; // 변역변수 : 다른 클래스로 이동 가능 => 제어문_반복문2.aaaa=2000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++) // 줄수
		{
			for(int j=1;j<=i;j++) // 실제 출력물
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
}

