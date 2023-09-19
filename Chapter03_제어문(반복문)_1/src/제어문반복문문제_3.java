// B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)

public class 제어문반복문문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char c='B';c<='N';c+=2)
		{
			if(c=='N')
			{
				System.out.print(c); // N 뒤에는 ,를 찍지 않는다.
			}
			else
			{
				System.out.print(c+",");
			}
		}
	}

}
