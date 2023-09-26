/*
 * 		배열 => 같은 데이터형을 일정한 순서로 모아서 관리
 * 			   ----------   --------
 * 							   ㅣ
 * 							  인덱스 (0번부터 시작)
 * 			=> 배열의 크기 : length
 * 			=> 출력시에는 향상된 for문 이용 (for-each 구문)
 * 			=> 관련된 종류의 데이터가 3개 이상인 경우
 * 			=> 선언 => 초기값
 * 					  ----
 * 					   ㅣ
 * 					   1) 명시적
 * 					   2) new (자동 초기화)
 * 						  int    => 0
 * 						  double => 0.0
 * 						  char   => '\0'
 * 						  String => null
 * 		---------------------------------------------
 */

// 알파벳 임의 10개, 버블정렬

import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c=new char[10];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(c));
		System.out.println("===== 정렬 후 =====");
		
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=0;j<c.length-1-i;j++)
			{
				if(c[j]>c[j+1])
				{
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));

	}

}
