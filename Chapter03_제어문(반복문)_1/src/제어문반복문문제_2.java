// 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)

public class 제어문반복문문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i<=50;i+=5)
		{
			if(i==50)
			{
				System.out.print(i); // 50을 제외한 사이에 , 찍기
			}
			
			else
			{
				System.out.print(i+",");
			}
		}

	}

}
