/*
 * 	&& || => 범위가 있는 경우
 * 
 * 	&& : 포함
 * 	|| : 미포함
 * 
 * 	형식)
 * 		(조건) && (조건) ==> 조건을 사용하는 연산자 (부정연산자, 비교연산자)
 * 		-----	 -----
 * 		true	  true	 ==> true
 * 		true	  false  ==> false
 * 		false     true   ==> false
 * 		false	  false  ==> false
 * 
 * 		(조건) || (조건) ==> 조건을 사용하는 연산자 (부정연산자, 비교연산자)
 * 		-----	 -----
 * 		true	  true	 ==> true
 * 		true	  false  ==> true
 * 		false     true   ==> true
 * 		false	  false  ==> false
 */
// ||
/*
 * 	1~12 입력 =>
 * 	12,1,2  ==> 겨울  (||)
 * 	3,4,5   ==> 봄   (&&)
 * 	6,7,8   ==> 여름  (&&)
 * 	9,10,11 ==> 가을  (&&)
 */
import java.util.Scanner;
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("월 입력(1~12):");
		
		int month;
		month=scan.nextInt();
		
		System.out.print(month+"월은 "); // 붙여쓰기 위해서 println이 아닌 print 사용.
		System.out.print(month==12 || month==1 || month==2?"겨울입니다":""); // ||연산자 사용
		System.out.print(month>=3 && month<=5?"봄입니다":"");
		System.out.print(month>=6 && month<=8?"여름입니다":"");
		System.out.print(month>=9 && month<=11?"가을입니다":"");
		
		scan.close();

	}

}
