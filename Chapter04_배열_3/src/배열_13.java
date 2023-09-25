import java.util.*;
public class 배열_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int sum=0; // Scope => 사용범위
		double avg=0;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 최대값, 최소값 출력");
			System.out.println("2. 총합");
			System.out.println("3. 평균");
			System.out.println("4. 종료");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			
			// 종료
			if(menu==4)
			{
				break;
			}
			// 최대값 , 최소값
			else if(menu==1)
			{
				int max=arr[0];
				int min=arr[0];
				
				for(int i:arr)
				{
					if(max<i)
					{
						max=i;
					}
					if(min>i)
					{
						min=i;
					}
				}
				System.out.println("최대값:"+max);
				System.out.println("최소값:"+min);
			}
			// 총합
			else if(menu==2)
			{
				for(int i:arr)
				{
					sum+=i;
				}
				System.out.println("총합:"+sum);
			}
			// 평균
			else if(menu==3)
			{
				for(int i:arr)
				{
					avg=sum/10.0;
				}
				System.out.println("평균:"+avg);
			}
		}

	}

}
