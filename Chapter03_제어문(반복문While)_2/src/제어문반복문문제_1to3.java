// 1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)

import java.util.Scanner;
public class 제어문반복문문제_1to3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner scan=new Scanner(System.in);
		System.out.print("x의 값:");
		x=scan.nextInt();
		
		if(x>10 && x<20)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
// 2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
		char ch;
		System.out.print("ch의 값:");
		ch=scan.next().charAt(0);
		
		if(ch==' ' && ch!='\t')
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
// 3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
		char ch2;
		System.out.print("ch2의 값:");
		ch2=scan.next().charAt(0);
		
		if(ch2=='x' || ch2=='X')
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
