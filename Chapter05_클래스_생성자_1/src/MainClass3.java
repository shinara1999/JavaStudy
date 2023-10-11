class Member{
	// 명시적인 초기화
	// 우선순위는 명시적인 초기화이다.
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="신아라";
	// Member(){}
	{
		mno=3;
		id="park";
		pwd="1234";
		name="심청이";
	}
	Member(){
		mno=2;
		id="hong";
		pwd="1234";
		name="홍길동"; // 최종 저장되는 값 (순서대로 저장된다.)
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1=new Member(); // 메모리 저장 => 생성자 호출
		System.out.println("번호:"+m1.mno);
		System.out.println("ID:"+m1.id);
		System.out.println("PWD:"+m1.pwd);
		System.out.println("Name:"+m1.name);
		
		Member m2=new Member(); // 메모리 저장 => 생성자 호출
		System.out.println("번호:"+m2.mno);
		System.out.println("ID:"+m2.id);
		System.out.println("PWD:"+m2.pwd);
		System.out.println("Name:"+m2.name);

	}

}
