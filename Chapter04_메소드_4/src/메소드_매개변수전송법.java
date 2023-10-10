/*
 * 		1. 값만 전송하는 방식
 * 		   = 기본형 => 메모리가 다르다
 * 		   = Call By Value
 * 		2. 메모리 주소 전송하는 방식
 * 		   = 배열, 클래스 => 같은 메모리에서 작업
 * 		   = Call By Reference
 * 		   = 예외) String (Call By Value)
 * 		   = Spring
 * 		   = 얕은복사 / 깊은복사
 * 			 ------
 */
public class 메소드_매개변수전송법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 얕은복사
		int[] arr= {10, 20, 30};
		int[] temp=arr; // 주소값을 대입
		System.out.println("arr="+arr);
		System.out.println("temp="+temp);
		
		System.out.println("temp[0]="+temp[0]);
		System.out.println("arr[0]="+arr[0]); // AS : 별칭을 준다.
		
		temp[0]=1000;
		System.out.println("arr[0]="+arr[0]); // arr의 값도 바뀐다.
		
		
		int a=10;
		int b=a;
		System.out.println("b="+b);
		b=100;
		System.out.println("a="+a); // 메모리 공간이 다르기 때문에 바뀌지 않는다.
		

	}

}
