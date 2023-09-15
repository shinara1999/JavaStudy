/*
 * 	54page
 * 		형식)
 * 			if(조건문)
 * 			{
 * 				조건문이 true일 때 실행하는 문장 (false일 때는 수행하지 않는다.)
 * 				---- (true/false)
 * 					 ------------
 * 					  비교연산자 , 논리연산자 , 부정연산자
 * 			}
 * 			
 * 			단일 조건문 : 독립수행
 * 					   ------ if문이 한개의 문장으로 사용
 * 	55page
 * 		중첩 if문
 * 			if(조건문)
 * 			{
 * 				if(조건문)      ===> 한 줄로 바꾸기 : if(조건문 && 조건문)
 * 				{
 * 				}
 * 			}
 */

// 가위바위보 출력 => 가위, 바위, 보를 숫자로 바꿔서 문제 해결
public class 단일조건문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int com=(int)(Math.random()*3); // 0 , 1 , 2
		
		if(com==0)
		{
			System.out.println("가위");
		}
		if(com==1)
		{
			System.out.println("바위");
		}
		if(com==2)
		{
			System.out.println("보");
		}

	}

}
