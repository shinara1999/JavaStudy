/*
 * 1. 선택조건문 : => true일 때 처리 , false일 때 처리를 나눠서 작업 => ID 중복체르
 * 							중복일 경우 => 이미 사용중인 ID입니다.
 * 							중복이 아닐 경우 => 사용 가느
 * 				1) 형식
 * 					if(조건문)
 * 					{
 * 						// 조건문이 true일 경우
 * 					}
 * 					else
 * 					{
 * 						// 조건문이 false일 때 처리
 * 					}
 * 					==> 간결하게 처리 삼항연산자 (웹, 게임)
 * 					==> 대문자 / 소문자	
 * 					==> 웹 => 페이지
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"은(는) 대문자 입니다.");
		}
		else
			System.out.println(c+"은(는) 소문자 입니다.");
		
		// else문장은 독립적으로 사용 불가 => if문과 같이 사용 가능
		// else문장은 바로 위에 있는 if만 지원한다.
		/*
		 * 	if()
		 * 	{
		 * 	}
		 * 	------
		 * 	if()
		 * 	{
		 * 	}
		 * 	------
		 * 	if()
		 * 	{
		 * 	}
		 * 	else => 바로 위에 있는 if문만!! 위에 두개난 연관X
		 * 	{
		 * 	}
		 */
		
		int a=10;
		if(a%2==0)
		{
			System.out.println(a+"은(는) 짝수이다.");
		}
		else
			System.out.println(a+"은(는) 홀수이다.");
		
	}

}
