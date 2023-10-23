class Member implements Cloneable
{
	String id;
	String pwd;
	String name;
	
	// 초기화
	public Member()
	{
		id="ppangjung04";
		pwd="nugyenong";
		name="전영중";
	}
	
	public void print()
	{
		System.out.println("ID:"+id);
		System.out.println("PWD:"+pwd);
		System.out.println("Name:"+name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	// clone => 재정의  (오버라이딩)
	/*
	 * 	Web 관련 자바
	 * 	-----------
	 * 		toString() : 객체를 문자열로 변경
	 * 		clone() : 메모리 복제 => 새로운 메모리 생성
	 * 		finalize() : 호출이 되면 메모리 해제
	 * 		---------- 자동 호출 (확인)
	 */
	
}
public class MainClass_6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Member m=new Member();
//		m.print();
//		
//		Member m1=(Member)m.clone();
//		m1.print();
		
		Member m1=new Member();
		m1.print();
		
		m1.id="jeon";
		m1.pwd="j1234";
		m1.name="전영중";
		m1.print();
		
		Member m2=(Member)m1.clone();
		m2.print();
	}

}
