/*
 * 		break    : 반복 중단
 * 				   게임 => ESC (반복문, switch)
 * 		continue : 특정 부분을 제외
 * 		----------------------- 반복문에서만 사용이 가능하다.
 * 		***제어영역 => 자신의 반복문만 제어할 수 있다.
 * 		for
 * 		{
 * 			for
 * 			{
 * 				break; => 2차 for문만 제외
 * 			}
 * 			break; => 1차 for문만 제외
 * 		}
 * 
 * 		// 이름이 있는 break
 * 		outer:for
 * 		{
 * 			for
 * 			{
 * 				break outer; => 1차, 2차 for문 전부 제외
 * 			}
 * 		}
 * 
 * 		
 */
public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// break => 반복문 종료
//		for(int i=1;i<=10;i++)
//		{
//			if(i==3)
//			{
//				// 소스코딩 가능
//				break; // i가 3일 때 반복문 종료
//				// 소스코딩 불가능
//				// System.out.println("..."); ==> 바로 오류 발생
//			}
//			System.out.println("i="+i);
//		}
		
		// continue => 특정부분 제외
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				continue; // 3을 제외하고 다시 증가식으로 이동 출력
			}
			/*
			 * 		for
			 * 		while
			 * 		----- break는 동일
			 * 			  continue = for문에서는 증가식으로 이동
			 * 					   = while문에서는 조건식으로 이동 => 무한루프가 될 수 있다.
			 * 					   => 처음부터 다시 실행할 경우 주로 사용
			 */
			System.out.println("i="+i);
		}
		System.out.println("===== while =====");
		int i=1;
		while(i<=10)
		{
			if(i==3)
			{
				break;
			}
			System.out.println("i="+i);
			i++;
		}

//		int i=1;
//		while(i<=10)
//		{
//			if(i==3)
//			{
//				continue; // 조건식으로 이동 -> 12121212... 무한루프 걸림
//			}
//			System.out.println("i="+i);
//			i++;
//		}
	}

}
