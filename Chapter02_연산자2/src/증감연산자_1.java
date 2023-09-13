/*
 * 		증감연산자
 * 			1개 증가, 1개 감소 ==> 반복문에서 주로 사용
 * 			  ++      --
 * 			= 전치연산자
 *				++a , --a
 * 			= 후치연산자
 * 				a++ , a--
 * 
 * 			int a=10;
 * 			int b=++a; ==> a를 먼저 증가하고 b에 대입
 * 			==> a=11 , b=11
 * 
 * 			int a=10;
 * 			int b=a++; ==> b에 a값을 대입 후 나중에 a값을 증가
 * 			==> a=11 , b=10
 * 
 * 			int a=10;
 * 			int b=++a + ++a + a++ ==> a값은 증가된 수만큼 증가 => 13
 * 				  ---   ---   --- ==> b값은? => 35
 * 				  11    12    12
 * 
 * 			int a=10;
 * 			int b=a++ + a++ + ++a;
 * 				  ---   ---   ---
 * 				  10    11    13  ==> 34
 * 
 * 			int a=10;
 * 			int b=a-- + a++ + --a + a++
 * 				  ---   ---   ---   ---
 * 				  10     9     9     9 ==> 37
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a;
		
		System.out.println("a:"+a+",b:"+b);
		
		a=10; // 위의 식에서 a가 증가되었으므로 다시 10으로 고정시킨다.
		b=a++;
		System.out.println("a:"+a+",b:"+b);
		
		
	}

}
