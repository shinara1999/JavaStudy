/*
 * 		String toUpperCase() => 대문자 변환
 *		String toLowerCase() => 소문자 변환
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
		// msg.toUpperCase(); => 이대로 출력하면 변경X
		// msg=msg.toUpperCase(); // => 다시 변수에 저장해야 한다.
		
		// System.out.println(msg);
		
		// msg=msg.toLowerCase();
		// System.out.println(msg);
		
		System.out.println(msg.toUpperCase()); // 여기서 변경하면 여기 출력물만 바뀐다.
		System.out.println(msg); // 여기서는 안바뀜. => 원본을 그대로 유지한다.
		
		System.out.println(msg.toLowerCase()); // 소문자 출력 (msg에 저장은 안된다.)
		System.out.println(msg);
		
		// 대문자로 변환하는 것은 가끔 나온다.
		// 오라클에서는 대문자 구분
	}

}
