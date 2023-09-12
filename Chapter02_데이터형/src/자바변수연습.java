/*
 * 		국어, 영어, 수학 점수를 받아서 총점과 평균을 구하는 프로그램을 작성
 * 		=> 학점을 출력해라 char
 */
public class 자바변수연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=85;
		int mat=70;
		
		int total=kor+eng+mat;
		double ave=(kor+eng+mat)/3;
		char 학점=' '; // 붙이지 말고 space나 값 하나를 줘야한다
		
		// int kor=0, eng=0, mat=0, total=kor+eng+mat; => 같은 데이터형은 모아서 쓸 수 있다.
		
		System.out.println("total:"+total);
		System.out.println("ave:"+ave);
	}

}
