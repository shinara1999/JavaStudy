// 1~1000까지에서 7의 배수의 합 ,9의 배수의 합

public class 제어문반복문문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seven=0, nine=0, svn=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
			{
				seven+=i;
			}
			if(i%9==0)
			{
				nine+=i;
			}
			if(i%7==0 && i%9==0)
			{
				svn+=i;
			}
		}
		System.out.println("7의배수의 합:"+seven);
		System.out.println("9의배수의 합:"+nine);
		System.out.println("7의배수이면서 9의배수의 합:"+svn);

	}

}
