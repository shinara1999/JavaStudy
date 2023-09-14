// 형변환 연산자
/*
 * 	(int)값
 * 
 * 	==> 크기
 * 	byte < char < int < long < float < double
 */
public class 단항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		double b=(double)a; // upcasting   : 생략 가능
		char c=(char)a;     // downcasting : 특수한 경우 생략 가능 (실제 값 대입)
						    //				 연산처리가 되면 생략할 수 없다
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		c='0'; // 0 => 48 'A' => 65 'a' => 97
		System.out.println("c="+(int)c); // '0'과 0은 다르다.
	}

}
