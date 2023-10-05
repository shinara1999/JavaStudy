// 로또 => 6개 정수를 중복 없이 추출 (1~45) => 출력
// 		 --------------------- 1         --- 2 => 메소드 2개 필요
public class 메소드_4 {
	
	// 6개 정수 중복없이 발생시키기
	static int[] getRand()
	{
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1; // 로또 : 1~45
			for(int j=0;j<i;j++) // 로또는 중복이 나오면 안된다.
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;
				}
			}
		}
		return lotto;
	}
	
	// 출력
	static void print(int[] lotto)
	{
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] lotto=getRand();
		print(lotto);
		
		// 6개 정수 중복없이 발생시키기
//		int[] lotto=new int[6];
//		
//		for(int i=0;i<lotto.length;i++)
//		{
//			lotto[i]=(int)(Math.random()*45)+1; // 로또 : 1~45
//			for(int j=0;j<i;j++) // 로또는 중복이 나오면 안된다.
//			{
//				if(lotto[i]==lotto[j])
//				{
//					i--;
//					break;
//				}
//			}
//		}
//		
//		// 출력
//		for(int i:lotto)
//		{
//			System.out.print(i+" ");
//		}

	}

}
