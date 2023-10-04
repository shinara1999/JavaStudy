/*
 *  리턴값을 받는 경우
 */
public class 메소드_3 {
	static int plus(int a, int b)
	{
		System.out.println("plus() call");
		System.out.println("요청처리 종료...");
		System.out.println("결과값을 전송...");
		return a+b; // 리턴은 가장 마지막줄에 와야한다
	}
	/*
	 * 		main에서는 가급적이면 처리하지 않는다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=plus(10, 20);
		System.out.println("결과값"+a);
	}

}
