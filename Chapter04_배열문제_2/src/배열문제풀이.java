import java.util.*;
public class 배열문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
//		int[] kor=new int[5];
//		int[] rank=new int[5];
//		
//		for(int i=0;i<kor.length;i++)
//		{
//			kor[i]=(int)(Math.random()*50)+50;
//		}
//		System.out.println("국어점수 출력");
//		System.out.println(Arrays.toString(kor));
//		
//		for(int i=0;i<rank.length;i++)
//		{
//			rank[i]=1;
//			for(int j=0;j<kor.length;j++)
//			{
//				if(kor[i]<kor[j])
//				{
//					rank[i]++;
//				}
//			}
//		}
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.println(kor[i]+" "+rank[i]+"등");
//		}
		
		// 2
//		int[] arr=new int[10];
//		int max=0;
//		int min=100;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr)
//		{
//			if(i>max)
//			{
//				max=i;
//			}
//		}
//		for(int i:arr)
//		{
//			if(min>i)
//			{
//				min=i;
//			}
//		}
//		System.out.println("Max:"+max+", Min:"+min);
		
		// 3 
//		int[] arr=new int[100];
//		int[] count=new int[10]; // word count
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr)
//		{
//			count[i]++;
//		}
//		for(int i=0;i<count.length;i++)
//		{
//			System.out.printf("count[%d]=%d\n", i, count[i]);
//		}
		
		// 4
//		int[] arr=new int[10];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1; // random의 원형은 double형이다.
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println("index[1]:"+arr[1]);
//		
//		// 5 (4번의 연장)
//		int max=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max<arr[i])
//			{
//				max=arr[i];
//			}
//		}
//		int index=0; // 인덱스번호 추출
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max==arr[i])
//			{
//				index=i;
//			}
//		}
//		System.out.println("최대값의 인덱스번호:"+index);
		
		// 6
//		int[] arr=new int[10];
//		int sum=0;
//		double avg=0;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr)
//		{
//			sum+=i;
//			avg=sum/10.0;
//		}
//		System.out.println("총합:"+sum+", 평균:"+avg);
//		
//		// 7 (6번의 연장)
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i==3)
//			{
//				continue; // 해당번호를 제외하고 출력
//			}
//			System.out.print(arr[i]+" ");
//		}
		
		// 8
//		int[] arr=new int[5];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.print("첫 번째 인덱스 입력:");
//		int index1=scan.nextInt();
//		System.out.print("두 번째 인덱스 입력:");
//		int index2=scan.nextInt();
//		
//		// 교환 => 임시변수 설정 temp
//		int temp=arr[index1];
//		arr[index1]=arr[index2];
//		arr[index2]=temp;
//		
//		System.out.println(Arrays.toString(arr));
		
		// 9, 10
//		char[] arr=new char[26];
//		char c='A';
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=c++;
//		}
//		for(char i:arr)
//		{
//			System.out.print(i);
//		}
//		
//		// 거꾸로출력
//		System.out.println();
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]);
//		}
		
		// 11
//		int[] arr=new int[10];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i:arr)
//		{
//			if(i%3==0)
//			{
//				System.out.print(i+" ");
//			}
//		}
		
		// 12

	}

}














