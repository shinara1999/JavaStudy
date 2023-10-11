class B{
	int a=10;
	// 생성자 X , 일번 메소드
	void B(){
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	/*
	 * 		생성자 => 초기화가 필요하다. (명시적 초기화가 불가능하다.)
	 * 				제어문 / 파일 읽기
	 * 			 => 시작과 동시에 처리 => 가장 먼저 호출
	 * 				--------------
	 * 					   ㅣ
	 * 					자동 로그인
	 * 					윈도우 화면 설정
	 * 					서버 연결
	 * 					데이터베이스 연결
	 */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B(); // 생성자는 호출 시 반드시 new를 앞에 써준다.
		b.B();
		// new B().a=100;
		// System.out.println(new B().a); // new는 무조건 메모리 따로따로!!
		
		

	}

}
