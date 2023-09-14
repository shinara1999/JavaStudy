/*
 *  ===> 윤년여부
 *      = 4년마다 1번
 *  	= 100년마다 1번은 제외
 *  	= 400년마다 1번은 윤년
 */
import java.util.Scanner;
public class 연산자응용문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		
		int year=scan.nextInt();
		System.out.println(
			(year%4==0 && year%100!=0)||(year%400==0) // 윤년조건
			?year+"년도는 윤년입니다.":year+"년도는 윤년이 아닙니다."
		);
		
		scan.close();
	}

}
