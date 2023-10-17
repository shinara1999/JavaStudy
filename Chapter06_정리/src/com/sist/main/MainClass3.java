package com.sist.main;
/*
 * 	194 page 목적, 형식
 * 	199 page 논리적 포함관계
 * 
 * 	abstract => 추상적인 => 공통적인 내용을 모아둔 것이다.
 * 	게시판
 * 		= 글쓰기
 * 		= 상세보기	
 * 		= 목록
 * 		= 수정
 * 		= 삭제
 * 		= 검색
 * 		
 * 		===> 답변형게시판
 * 		===> 묻고답하기
 * 		===> 갤러리게시판
 * 		===> 댓글형게시판
 * 		===> 추상/인터페이스 => 벤치마킹
 * 
 * 	201~202, 204, 206 page
 * 		= 단일상속 => 변수 충돌
 * 		= 오버라이딩 => 재정의 => 메소드 변경
 * 		  변수 / 메소드
 * 		= 오버로딩 / 오버라이딩
 * 		  ----------------
 * 	207 page
 * 		= 접근 지정어
 * 			=> private 변수는 접근 불가능
 * 	211 page
 * 		
 * 		= 자신의 객체 ==> this
 * 		= 자신의 생성자 호출 ==> this()
 * 		= 상위클래스 객체 ==> super
 * 		= 상위클래스의 생성자 호출 ==> super()
 * 
 * 		===> 상속을 받은 클래스느느 자신과 관련된 메소드, 변수, 상위클래스의 변수, 메소드 사용 가능
 * 		===> 상속을 내린 클래스는 자신과 관련된 메소드, 변수만 사용 가능
 * 
 * 	217 page
 * 		= final ==> 변수는 상수형이다
 * 					메소드는 확장이 안된다 => java.lang
 * 
 * 	221, 227 page
 * 		객체의 형변환 => 클래스의 크기가 있다 => 반드시 상속, 포함
 * 
 * 		클래스도 데이터형이다.
 * 		=> 자바에서 지원하지 않는 데이터형이라 사용자 정의 데이터형
 * 
 * 		*** 제어자
 * 		접근지정어 : private , protected , public , default
 * 		그 외 : static , final , abstract , synchronized
 * 		static : 공통적인 => 공유
 * 			==> 클래스, 메소드, 변수 ==> 지역변수에서는 사용할 수 없다.
 * 		final : 마지막
 * 			==> 클래스, 메소드, 변수, 지역변수
 * 		abstract : 추상적인(공통성), 미완성
 * 			==> 추상클래스, 인터페이스
 * 		synchronized : 동기적인 (네트워크, 쓰레드)
 * 			= 비동기 Ajax
 * 			= 동기적
 * 		
 * 		조합
 * 		---------------------------------------------
 * 		대상						 조합
 * 		클래스		public, default, final, abstract
 * 					protected/private (X)
 * 		변수			private final, static
 * 		메소드		public final, static, abstract
 * 		지역변수		final
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
