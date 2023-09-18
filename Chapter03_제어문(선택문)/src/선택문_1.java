// switch case

/*
 * 		선택문은 범위가 지정되는 것이 아니다.
 * 		=> 값 1개를 선택해서 사용
 * 		   ----- 정수, 문자, 문자열 ***실수가 들어가지 않는다.
 * 		=> 형식)
 * 		   switch(정수, 문자, 문자열)
 * 		   {
 * 				case 1:
 * 					실행문장
 * 					break; ==> 실행문장 수행 후에 종료
 * 				case 2:
 * 					실행문장
 * 					break; ==> 실행문장 수행 후에 종료
 * 				case 3:
 * 					실행문장 ==> 3을 수행하고 4를 수행하고 종료
 * 				case 4:
 * 					실행문장
 * 					break;
 * 			}
 * 		=> break가 어디서 와야 하는지를 잘 생각해야 한다.
 * 		=> 범위가 지정되면 다중 조건문
 * 		=> 범위가 없이 값이 1개일 때 ==> switch
 * 		=> 메뉴 만들기, 키보드 입력 ==> 웹, 게임의 서버프로그램에 주로 사용
 */

// 성적계산 : 3개정수 입력받고 평균, 총점, 학점 구하기

import java.util.Scanner;
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int kor,eng,mat,total,avg; // switch case에서 실수는 사용X
		double avg2;
		char score=' ';
		
		System.out.print("국어 점수 입력:");
		kor=scan.nextInt();
		System.out.print("영어 점수 입력:");
		eng=scan.nextInt();
		System.out.print("수학 점수 입력:");
		mat=scan.nextInt();
		
		total=kor+eng+mat;
		avg2=total/3.0;
		avg=(int)(avg2/10); // switch에 이용 : 왜 10으로 나눴는가?
		
		switch(avg)
		{
		case 10: // 10일 때 9일 때
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default: // 나머지
			score='F'; // default는 break 줘도 되고 안줘도 됨.
		}
		
		System.out.println("===== 결과값 도출 =====");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg2);
		System.out.println("학점:"+score+"학점");
		
		scan.close();

	}

}
