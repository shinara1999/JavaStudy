/*
 * 		배열
 * 		--- 묶어서 관리
 * 			--------
 * 			1) 변수	=> 같은 유형의 변수가 3개이상일 때 => 묶어서 처리
 * 												   -----
 * 													변수명을 한개로 관리
 *					=> 같은 데이터형 => 배열
 *					=> 다른 데이터형 (*****) => 클래스
 *						 (Spring)	
 *						=> ~VO, ~DTO, ~Bean
 *					          (MyBatis)(JSP)
 * 			2) 명령문 : 관련된 명령끼리 묶어서 구조적 프로그램
 * 					  메소드 ==> 단락
 * 		------------------------------------------------------------ 기본문법
 * 		데이터 묶기 (변수)
 * 		명령문 묶기 (명령문) => 소스코딩; => ; 한개당의 명령문
 * 					ㅣ
 * 				   입력
 * 				   처리
 * 				   출력
 * 		배열 : 같은 데이터형을 여러개 묶어서 관리
 * 		1) 장점
 * 			여러개의 변수명 => 한개로 합쳐서 사용
 * 						    ----------
 * 		   => 데이터마다 구분 => 인덱스 (순차적) => 반복문에 사용하면 편리하다.
 * 		2) 단점
 * 			고정적이다. => 메모리를 할당할 때 10개면 10개만 쓸 수 있다.
 * 						(가변적 => 컬렉션)
 * 			--------
 * 			크기 변경이 불가능 => 큰 배열을 생성
 * 			같은 데이터형만 모아서 저장
 * 		------------------------------------------------------------
 * 		1. 배열선언
 * 			데이터형[] 배열명; : 자바 => 권장!! int[] arr;
 * 			데이터형 배열명[]; : c언어 
 * 			----------------------
 * 		2. 초기화
 * 			int[] arr={1,2,3,4,5}; => 5(20byte)
 * 				  --- 배열명 : 변수 식별자와 동일
 * 			int[] arr=new int[5];  => int를 5개 모아서 관리
 * 					  ------- => 자동초기화 (0 5개가 들어있다는 뜻)
 * 			int[] arr;
 * 					 스택    힙
 * 					arr	 ㅣ
 * 				   ----- ㅣ
 * 						 ㅣ
 * 				   ----- ㅣ
 * 
 * 									   104     108     112     116
 * 		  arr=new int[5] ㅣ           arr+1*4 arr+2*4 arr+3*4 arr+4*4
 * 				    arr  ㅣ  -----------------------------------------
 * 				   ----- ㅣ	   0   ㅣ   0   ㅣ   0   ㅣ   0   ㅣ   0
 * 				    100  ㅣㅣ------------------------------------------
 *  			   ----- ㅣarr(100)     ㅣ       ㅣ        ㅣ       ㅣ
 *  						  ㅣ     arr[1]   arr[2]   arr[3]   arr[4]
 *  						arr[0]
 * 		3. 값 변경
 * 			=> 1번째 값 변경
 * 			   arr[0]=100 => 첫번째 값을 100으로 바꿔라.
 * 			   arr[4]=200 => 다섯번째 값을 200으로 바꿔라.
 * 		4. 출력
 * 			int[] arr      -------
 * 								 ㅣ-> 데이터형이 일치되어야 한다.
 * 			for(int a:arr) -------
 * 			=> 향상된 for문
 */

// 3명의 학생의 국영수 점수 받아서 총점평균 구하기
import java.util.Scanner;
public class 배열_생성 {
//	public static void print(int dan) // 구구단을 출력하는 메소드 (메인에서는 작성 불가, 따로 작성해줘야 한다.)
//	{
//		for(int i=1;i<=9;i++)
//		{
//			System.out.println(dan+"*"+i+"="+(dan*i)); // 명령문
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 변수 설정
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int mat1, mat2, mat3;
		int total1, total2, total3;
		double avg1, avg2, avg3;
		
		// 값 입력받기
		System.out.print("1번학생의 국어점수:");
		kor1=scan.nextInt();
		System.out.print("1번학생의 영어점수:");
		eng1=scan.nextInt();
		System.out.print("1번학생의 수학점수:");
		mat1=scan.nextInt();
		System.out.print("2번학생의 국어점수:");
		kor2=scan.nextInt();
		System.out.print("2번학생의 영어점수:");
		eng2=scan.nextInt();
		System.out.print("2번학생의 수학점수:");
		mat2=scan.nextInt();
		System.out.print("3번학생의 국어점수:");
		kor3=scan.nextInt();
		System.out.print("3번학생의 영어점수:");
		eng3=scan.nextInt();
		System.out.print("3번학생의 수학점수:");
		mat3=scan.nextInt();
		
		// 총점
		total1=kor1+eng1+mat1;
		total2=kor2+eng2+mat2;
		total3=kor3+eng3+mat3;
		
		// 출력
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n", kor1, eng1, mat1, total1, total1/3.0); // %-5d : 왼쪽으로 5칸정렬 (뒤에 띄기)
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n", kor2, eng2, mat2, total2, total2/3.0); // %3d  : 오른쪽으로 3칸정렬 (앞에 띄기)
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n", kor3, eng3, mat3, total3, total3/3.0);
		
		

	}

}
