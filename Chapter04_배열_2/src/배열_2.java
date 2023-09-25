// 응용
// 정수 1개 입력받아서 이진법 출력 (16bit 32767) 양수만 입력받기
/*		
 * 		이진법:
 * 		10
 * 		0000	0000	0000	1010 => 뒤에서부터 값을 변경해나가야 한다
 */

import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int[] binary=new int[16]; // 16칸, 0부터
		int index=15; // 맨 뒤의 값 15번부터 채운다.
		
		// 역순으로 값을 배치 --사용
		System.out.print("0~32767 사이의 양의 정수 입력:");
		int num=scan.nextInt();
		
		System.out.println("===== Lib =====");
		System.out.println(Integer.toBinaryString(num)); // 아래 코딩을 한번에 출력하는 라이브러리
		
		while(true) // 횟수지정을 할 수 없으므로
		{
			binary[index]=num%2; // 나머지값 먼저
			num=num/2;
			
			if(num==0)
			{
				break;
			}
			index--;
		}
		
		// 출력
		for(int i=0;i<binary.length;i++) // 4칸씩 넣기
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}


	}

}
