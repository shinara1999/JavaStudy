import java.util.Scanner;

public class 메소드_5_메소드변경 {
	
	// Call By Reference
	static void userInput(int[] kor, int[] eng, int[] mat, int[] total, double[] avg)
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 국어 점수:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 점수:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 점수:");
			mat[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+mat[i];
			avg[i]=total[i]/3.0;
		}
	}
	
	static void scoreChange(char[] score, double[] avg)
	{
		for(int i=0;i<score.length;i++) // 3명의 학점 동시에 구하기
		{
			switch((int)(avg[i]/10.0))
			{
			case 10:
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}
		}
	}
	
	static void rankChange(int[] rank, int[] total)
	{
		for(int i=0;i<rank.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
	}
	
	static void print(int[] kor, int[] eng, int[] mat, int[] total, double[] avg, char[] score, int[] rank)
	{
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",kor[i], eng[i], mat[i], total[i], avg[i], score[i], rank[i]);
		}
	}
	
	static void process()
	{
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] mat=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		char[] score=new char[3];
		double[] avg=new double[3];
		userInput(kor, eng, mat, total, avg);
		scoreChange(score, avg);
        rankChange(total, rank);
        print(kor, eng, mat, total, avg, score, rank);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();

	}

}
