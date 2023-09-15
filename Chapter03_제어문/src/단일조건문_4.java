/*
 * 	정수 2개를 난수로 받아서 최대값, 최소값을 구하여라.
 */

// 라이브러리 이용하는 간단한 방법
public class 단일조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		
		System.out.println("Max:"+Math.max(a, b));
		System.out.println("Max:"+Math.min(a, b));

	}

}
