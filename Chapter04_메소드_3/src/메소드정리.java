/*
 * 		1. 리턴형
 * 			= 요청 처리에 대한 결과값 전송
 * 						   ---------
 * 							= 한개 (기본형) => 정수, 실수, 문자, 논리
 * 							= 여러개 (배열, 클래스)
 * 										 ----- 상세보기, 목록...
 * 			= 결과값이 없는 경우 : 추가, 수정, 삭제 ==> void
 * 			= 결과값이 있는 경우 : 목록, 상세보기, 검색...
 * 
 * 		2. 매개변수
 * 			= 사용자가 요청값을 받을 경우
 * 			= 여러개 사용이 가능하다. => 3개이상이면 배열/클래스로 처리
 * 			= 가변 매개변수 (...)
 * 
 * 		3. 메소드명
 * 			= 식별자 => 문자갯수(제한은 없다. 하지만 압축해서 쓰는것을 권장)
 * 
 * 		4. return문
 * 			=> 가급적 메소드 마지막에 설정하는 것이 좋다.
 * 			=> void일 경우 return문 생략 가능
 * 
 * 		5. 형식
 * 			리턴형 메소드명(매개변수...)
 * 			{
 * 				return 값;
 * 			}
 * 
 * 		6. 유형
 * 			리턴형/매개변수
 * 			  O     O
 * 			  O     X
 * 			------------ 출력내용이 있는 경우
 * 			  X     O
 * 		      X     X
 * 			------------ 메소드 자체 처리 (void)
 * 
 * 		7. 사용 목적
 * 			= 다른 클래스와 연결 (메세지) => 메소드 호출
 * 			= 재사용
 * 			= 반복 제거
 * 			= 수정이 편리하다.
 * 			= 에러 처리가 수월하다.
 * 
 * 		8. 메소드 형태
 * 			= static
 * 			= instance : 교재에 나와있는 방법
 */
public class 메소드정리 {
	
//	static void data(String s, String s1) // 좋지 않은 코딩
//	{
//		System.out.println(s+" "+s1);
//	}
	
	static void data(String...s) // **가변 매개변수** 를 이용한다.
	{
		for(String ss:s)
		{
			System.out.println(ss);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data("Java", "Oracle", "Spring", "Python");

	}

}
