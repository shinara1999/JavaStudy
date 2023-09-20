// 5개 난수 발생, 최대값 구하기
public class 제어문_반복문사용이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int d=(int)(Math.random()*100)+1;
		int e=(int)(Math.random()*100)+1;
		
		int max=1;
		
		if(a>max)
		{
			max=a;
		}
		if(b>max)
		{
			max=b;
		}
		if(c>max)
		{
			max=c;
		}
		if(d>max)
		{
			max=d;
		}
		if(e>max)
		{
			max=e;
		}
		
		System.out.println("MAX:"+max);

	}

}
