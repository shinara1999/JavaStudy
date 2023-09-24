// 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.

public class 배열문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numList=new int[10];
		int total=0;
		double avg=0;
		
		for(int i=0;i<numList.length;i++)
		{
			int num=(int)(Math.random()*10)+1;
			numList[i]=num;
			total+=numList[i];
			
		}
		avg=total/numList.length;
		
		for(int num:numList)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.printf("평균:%.2f", avg);
		
		

	}

}
