// 농구공 5개씩 한 박스에 들어간다. 40개면 8상자,26개면 6상자이다 삼항연산자를 이용해서 구현하시오.
// 유사문제: 총페이지 만들기

import java.util.Scanner;
public class 연산자응용문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("농구공 갯수:");
		
		int ball=scan.nextInt();
		System.out.print("필요한 상자의 수:");
		System.out.print(ball<=5?1:"");
		System.out.print(ball>5 && ball%5==0?ball/5:"");
		System.out.print(ball>5 && ball%5!=0?ball/5+1:"");
		
		// 선생님 풀이 : System.out.print("필요한 상자의 수:"+(ball%5==0?ball/5:ball/5+1)); => 훨씬 간결하다.
		// 또다른 풀이 : System.out.println("필요한 상자의 수:"+(int)(Math.ceil(ball/5)));
		
		scan.close();
		
	}

}
