// 2. 1~10까지 합을 구하는 메소드 구현 (매개변수X 리턴형O)
// 사용자가 요청하는 값이 없으므로 매개변수가 존재하지 않는다.

public class 메소드문제_2 {
	
	static int sum()
	{
		int hap=0;
		for(int i=1;i<=10;i++)
		{
			hap+=i;
		}
		System.out.println("hap="+hap);
		return hap; // 자체출력 void
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();

	}

}
