// % => 배수 ==> 화폐매수 구하기
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		// 앞의 부호에 따라 최종 부호가 결정된다.
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("==========================");
		int c=369;
		
		// 백단위 : 3 , 십단위 : 6 , 단단위 : 9 를 출력하라.
		System.out.println("백단위:"+c/100);      // 100으로 나눈 몫
		System.out.println("십단위:"+(c%100)/10); // 100으로 나눈 나머지를 10으로 나눈 몫
		System.out.println("단단위:"+c%10);       // 10으로 나눈 몫
		
		
	}

}
