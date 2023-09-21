/*	page99
 * 		문자열
 * 		---- String은 기능이 많다.
 * 		1. 문자의 갯수 확인 가능 (총 몇글자인지) : length()
 * 		2. 검색
 * 		  ----
 * 			startsWith  : 시작하는 문자열이 같은 경우
 * 			endsWith    : 끝나는 문자열이 동일 => cookie
 * 			***contains : 포함된 문자가 있는지
 * 			***equals   : 같은 값 ==> id, pw
 * 			  -------- 대소문자 구분
 * 		3. 문자열 제어
 * 			= 변경 : replace(), replaceAll()
 * 					replace('a','b') => a를 전부 b로 바꿔라.
 * 					replaceAll("[가-힣]", "") => 한글 전체를 공백으로 바꿔라.
 * 					replaceAll("[0-9A-Za-z]", "") => 숫자, 영문 전체를 공백으로 바꿔라.
 * 	
 * 					     String s="Hello Java"
 * 							       0123456789
 * 			= 문자 자르기 : substring(1) => 1번부터 잘라서 가져와라.
 * 						 substring(4, 7) => 4번부터 6번(7-1)까지 가져와라.
 * 											(마지막번호 제외)
 * 			= 대문자 : toUpperCase
 * 			= 소문자 : toLowerCase
 * 		4. 모든 데이터형을 문자열로 변경
 * 			= valueOf(1) => "1" ==> 윈도우, 웹 => 
 * 		5. 분리 : split() => Spring[]
 * 		   charAt(index)
 * 				"Hello Java" => charAt(0) => 'H' (문자를 가져온다.)
 * 				***index번호가 자바는 무조건 0번부터 시작한다.(오라클은 1번)
 * 
 * 		String => 일반형 =>
 * 		------------------ Call By Value / Call By Reference
 * 						   => String	   => 배열/클래스
 * 		형식) String s="";
 * 			 String s=new String("");
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello Java!!"; // 공백도 갯수를 센다.
		System.out.println(s.length()); // 변수.length() : 12자
		
		if(s.startsWith("ddd")) // 변수.startsWith("문자열") : "문자열"로 시작하는 문자열인가?
		{
			System.out.println("포함");
		}

	}

}
