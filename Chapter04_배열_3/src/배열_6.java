/*
 * 		알파벳 ==> 문자열은 안됨
 * 				 ---------- 비교연산자를 사용할 수 없다.
 * 				 compare() 음수/양수/0
 * 				 String s="H"
 * 				 String s1="K"
 * 
 * 				 s.compare(s1)
 * 				 -         --
 * 				 H          K ==> -2 / 음수가 나오면 s1이 더 크고, 양수가 나오면 s가 더 크다.
 * 
 * 				 S, J, I, V, Q
 * 				 -  -
 * 				 J  S 
 * 				 -     -
 *               I     J
 * 				 -        -
 *               I        V
 * 				 -           -
 *               I           Q
 * 				 ------------- 1round
 * 				 I  S  J  V  Q
 * 				    -  -
 * 					J  S
 * 					-     -
 * 					J     V
 * 					-        -
 * 					J        Q
 * 				 ------------- 2round
 * 				 I  J  S  V  Q
 *                     -  -
 *                     S  V
 *                     -     -
 *                     Q     S
 *               ------------- 3round
 *               I  J  Q  V  S
 *               		  -  -
 *               		  S  V
 *               ------------- 4round
 *               I  J  Q  S  V
 * 
 */

import java.util.Arrays;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(alpha)); // ASC / DESC
		
		System.out.println("===== 정렬후 =====");
		for(int i=0;i<alpha.length;i++)
		{
			for(int j=0;j<alpha.length;j++)
			{
				if(alpha[i]>alpha[j])
				{
					char temp=alpha[i];
					alpha[i]=alpha[j];
					alpha[j]=temp;
				}
			}
			System.out.println((i+1)+"Round==> "+alpha[i]);
			System.out.println(Arrays.toString(alpha));
		}
		

	}

}
