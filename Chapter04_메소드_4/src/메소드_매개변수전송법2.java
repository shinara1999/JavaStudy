// swap

public class 메소드_매개변수전송법2 {
	
	static void swap(int a) // 복사본
	{
		a=100;
	}
	
	static void swap2(int[] arr)
	{
		System.out.println("arr="+arr);
		arr[0]=100;
	}
	// => 배열 => 메모리주소 이용
	// => 기본형 => 실제 저장된 값 이용
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10; // 원본 => Call By Value : 값만 보낸다. (원본은 그대로이다.)
		swap(b);
		System.out.println("b="+b); // 메모리가 틀리기 때문에 바뀌지 않는다.
		
		/*
		 * 		int b=10;
		 * 		int a=b;
		 * 		a=100; => b값은 안바뀐다.
		 */
		
		int[] kkk= {1, 2, 3}; // Call By Reference (배열, 클래스에서만 가능)
		swap2(kkk);
		

	}

}
