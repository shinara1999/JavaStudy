/*
 * 		while
 * 		-----
 *			초기값
 * 			while(조건식)
 * 			{
 * 				반복 수행 문장
 * 				증감식
 * 			}
 * 
 * 		=> 10개의 난수
 * 		=> 최대값 / 최소값
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 최대값 최소값 변수 설정
		int max=1, min=100; // 최대는 가낭 낮은 값, 최소는 가장 높은 값 설정
		
		
		int i=1; // 루프변수(어디부터 어디까지)
		while(i<=10)
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			// 최대값 최소값
			if(max<rand)
			{
				max=rand;
			}
			if(min>rand)
			{
				min=rand;
			}
			i++;
		}
		System.out.println("\nMAX:"+max);
		System.out.println("MIN:"+min);

	}

}
