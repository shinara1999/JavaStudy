import java.util.*;
class A
{
	static int[] arr=new int[5];
	// arr[0]=1; => 명시적 초기화가 불가하므로 1. 초기화블록 이나 2. 생성자 를 이용해야 한다.
	
	// 클래스 영역에는 선언만 가능하다.
	A() {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // arr 저장
		System.out.println(Arrays.toString(a.arr));
		
		A b=new A();
		System.out.println(Arrays.toString(b.arr)); // static은 영역이 1개
		System.out.println(Arrays.toString(a.arr));

	}

}
