
import java.util.Arrays;
import java.util.Scanner;
public class 배열문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		// 10명의 컴퓨터 정수를 입력받아 배열에 저장하고 총점과 평균을 구하여 출력하는 프로그램을 작성
//		int[] numList=new int[10];
//		int total=0;
//		double avg=0;
//		
//		for(int i=1;i<numList.length;i++)
//		{
//			System.out.print("정수입력:");
//			int num=scan.nextInt();
//			numList[i]=num;
//		}
//		
//		for(int num:numList)
//		{
//			total+=num;
//			avg=total/numList.length;
//		}
//		System.out.println("총점:"+total);
//		System.out.printf("평균:%.2f",avg);
		
		
		// 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램
		int[] numList={95, 75, 85, 100, 50};
		
		Arrays.sort(numList);
		System.out.println(Arrays.toString(numList));
	}

}
