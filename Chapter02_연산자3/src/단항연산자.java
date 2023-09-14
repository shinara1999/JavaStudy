// 증감연산자, 부정연산자, 형변환연산자
// import java.util.Scanner;
// 1개의 정수를 입력받아서 한개를 증가한 값을 출력하시오.
/*
 *  a++
 *  ++a
 *  a+=1
 *  a=a+1
 */

public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력:");
//		a=scan.nextInt();
		
		// 1개 증가
		// a++;
		
		// 원하는 수만큼 증가
		// a+=10;
		
		// ++a 증가 후 대입
		// int b=++a;
		
		// a++ 대입 후 증가
		// int b=a++;
		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		
		// scan.close();
		
		System.out.println("===== 부정연산자 =====");
		boolean bCheck=true;
		System.out.println("변경 전 bCheck:"+bCheck);
		bCheck=!bCheck; // ! : boolean에서만 사용되는 부정연산자
		System.out.println("변경 후 bCheck:"+bCheck);
		
		// 무한루프
		/* boolean aa=true;
		while(true)
		{
			aa=!aa;
			if(aa==true)
			{
				System.out.println("사용자");
			}
			else
			{
				System.out.println("컴퓨터");
			}
		} */
		

	}

}
