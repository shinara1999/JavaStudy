/*
 * 		1-100 사이의 난수 3개 발생
 * 		=> 발생된 난수 출력
 * 		=> 3개 난수중에 MAX와 MIN 출력
 */


public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		
		System.out.println("3개의 난수는 "+a+","+b+","+c+"입니다.");
		
		int max=a;		
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		{
			System.out.println("최대값은 "+max+"입니다.");
		}
		
		int min=a;		
		if(min>b)
			min=b;
		if(min>c)
			min=c;
		{
			System.out.println("최솟값은 "+min+"입니다.");
		}

	}

}
