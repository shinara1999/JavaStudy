
import java.util.Scanner;
public class 배열문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 5개 정수를 입력받은 후 차례로 출력하는 프로그램
//		int[] numList=new int[5];
//		
//		for(int i=0;i<numList.length;i++)
//		{		
//			int num=scan.nextInt();
//			numList[i]=num;
//		}
//		
//		for(int num:numList)
//		{
//			System.out.print(num+" ");
//		}
		
		
		// 문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램
//		char[] cList=new char[10];
//		
//		for(int i=0;i<cList.length;i++)
//		{
//			char c=scan.next().charAt(0);
//			cList[i]=c;
//		}
//		
//		for(char c:cList)
//		{
//			System.out.print(c);
//		}
		
		
		// 정수 10개를 입력받은 후 세번째, 다섯번째와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램
//		int[] numList=new int[10];
//		
//		for(int i=0;i<numList.length;i++)
//		{
//			int num=scan.nextInt();
//			numList[i]=num;
//		}
//		
//		System.out.println(numList[2]+" "+numList[4]+" "+numList[9]);
		
		
		// 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		int[] numList=new int[10];
		
		for(int i=0;i<numList.length;i++)
		{
			int num=scan.nextInt();
			numList[i]=num;
		}
		
		int max=0;
		for(int num:numList)
		{
			if(num>max)
			{
				max=num;
			}
		}
		System.out.println("MAX:"+max);
	}

}
