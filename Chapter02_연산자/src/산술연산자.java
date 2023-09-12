/*
 * 	38page
 * 		산술연산자 : 가장 기본이 되는 연산자
 * 		
 * 			+ , - , * , / , %(나누고나머지)
 * 			---------- 이항연산자 (피연산자(연산 대상) 2개)
 * 		
 */
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + (산술)
		// 국어, 영어, 수학점수의 총점을 구한다
		int kor=100;
		int eng=90;
		int mat=87;
		
		int total=kor+eng+mat;
		
		//출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+mat);
		System.out.println("총점수:"+total);
		
		//평균 출력
		double ave=total/3.0; // 실수로 나눠야 소수점까지 나온다.
		
		System.out.println("평균점수:"+ave);
		
		// 소수점 두자리로 자르기 printf
		System.out.printf("평균점수:%.2f",ave); // %.2f : 소수점 둘째자리에서 반올림
		
		System.out.print("\n"); // 줄바꿈 하는 방법
		System.out.println("========= % =========");
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2)); // 문자열 결합
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));
		System.out.println("========= 형변환 =========");
		
		/*
		 * 	자동 형변환
		 * 		작은 데이터형 => 큰 데이터형
		 * 	강제 형변환
		 * 		큰 데이터형 => 작은 데이터형
		 * 		(데이터형)값
		 * 		----------> 자동 형변환
		 * 	byte < char < int < long < float < double
		 * 						강제 형변환 <---------
		 * 
		 * 	자동 형변환
		 * 		int a='A';    => a=65
		 * 		double d=100; => d=100.0
		 */
		int aa='A';
		System.out.println(aa); // 65
		double dd=100;
		System.out.println(dd); // 100.0
		
		System.out.println(100+10.5+10.5F+'A'); // 186.0 가장 큰 데이터형인 double형으로 나온다.
		
		// 자동형변환이 있는 경우 => 연산은 같은 데이터형끼리만 연산
		
		System.out.println('A'+'B'); // 65+66
		// int 이하(byte, char, short) 연산 => 결과값 int
	}

}
