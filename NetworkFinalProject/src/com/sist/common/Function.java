package com.sist.common;

// 웹 => 구분자 없이 사용 => 파일명
// 내부 프로토콜 : ex) aaa를 접속한 모든 사용자에게 전송한다.
// 번호로 구분한다. => 번호로 서버 접근 설정 (port)
// 번호 => 서버에서 지시 => 클라이언트가 수행 => 같은 내용 (공유)

public class Function {
	// 서버에 요청 => 번호로 구분
	// 로그인은 100번, 종료는 900번... 고유번호를 설정하는 것이다.
	
	public static final int LOGIN=100; 		// 로그인
	public static final int MYLOG=110;
	public static final int WAITCHAT=200;   // 채팅
	public static final int EXIT=900;       // 나가기
	public static final int MYEXIT=910;
}
