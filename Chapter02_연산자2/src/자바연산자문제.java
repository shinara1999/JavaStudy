import java.util.Scanner; // 입력받기
public class 자바연산자문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 12) 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
		/* int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+(a*b)); */
		
		
		// 13) 사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해 보 자. 예를 들어 사용자로부터 순서대로 입력받은 세 개의 정수가 1, 2, 3 이라면 1 * 2 + 3의 계산 결과를 출혁해야 한다. 단 출력 양식은 다음과 같아야 한다.
		/* int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		System.out.println("a*b+c:"+(a*b+c)); */
		
		
		// 14) 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
		/* int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		
		System.out.println("a%b:"+(a%b)); */
		
		
	
		// 15) 다음 빈칸을 채워라.
		/* int a=5;
		int b=5;
		
		System.out.println("a와 b가 같은가요?" + (    ));
		System.out.println("a가 b보다 큰가요?" + (     ));
		System.out.println("a가 b보다 작은 가요 ?" + (    ));
		System.out.println("a가 b와 같은면서 3보다 큰가요?" +   (         ));
		System.out.println("a가 50이 아닌가요? " + (         ));
		
		System.out.println("a==b" + (a==b));
		System.out.println("a>b" + (a>b));
		System.out.println("a<b" + (a<b));
		System.out.println("a==b && a>3" +   (a==b && a>3));
		System.out.println("a!=50" + (a!=50)); */
		
		// 키보드 입력값을 읽어온다
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력:"); // 각각 하나씩 받을 때
		int a=scan.nextInt();
		System.out.println("두 번째 정수 입력:");
		int b=scan.nextInt();
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println("정수 두개 입력(10 20):"); // 두 개를 동시에 받을 때
		int c=scan.nextInt();
		int d=scan.nextInt();
		System.out.println(c-d);
		System.out.println(c*d);
		
		
		


	}
}
