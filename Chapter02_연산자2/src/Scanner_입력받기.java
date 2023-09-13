import java.util.Scanner; // import + Scanner + ctrl + space => 자동으로 나온다.

public class Scanner_입력받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("세 개 정수 입력(1 2 3):");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		System.out.println(a*b+c);
	}

}
