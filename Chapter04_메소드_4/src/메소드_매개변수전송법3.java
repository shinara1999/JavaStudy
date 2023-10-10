import java.util.*;
public class 메소드_매개변수전송법3 {
	
	static void change2(String s) 
	{
		s="Hello Method";
	}
	
	static void change(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] temp=new int[5];
		System.out.println("적용 전:");
		System.out.println(Arrays.toString(temp));
		System.out.println("적용 후:");
		change(temp);
		System.out.println(Arrays.toString(temp));
		
		String ss="";
		change2(ss);
		System.out.println(ss); // String은 Call By Reference를 사용할 수 없다. (변경X)
		
		// 주소가 같은 경우에는 저장값을 언제든 제어할 수 있다.
		int[] a= {1, 2, 3};
		int[] b=a;
		int[] c=a;
		int[] d=a;
		d[0]=10;
		System.out.println("a[0]="+a[0]); // 어느 누가 바뀌어도 다 바뀐다.
		

	}

}
