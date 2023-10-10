import java.util.Scanner;

public class 메소드_4_메소드변경 {
	
//	1. 년도, 월, 일 사용자로부터 입력받기
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		
		return scan.nextInt(); // 입력값 바로 리턴받기
	}
	
// 요일구하기
//	2. 전년도까지의 총 날수 (1년도 1월 1일 ~ 12.31)
	static int getWeek(int year, int month)
	{
		int total=(-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		
//  3. 전달까지의 총 날수
//	-------------- +1 (요청한 달의 1일자를 구한다.)
		int[] lastday= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if((year%4==0 && year%100!=100)||(year%400==0)) // 윤년조건
		{
			lastday[1]=29; // 윤년일 때 29일
		}
		else
		{
			lastday[1]=28; // 윤년 아닐 떄 28일
		}
		
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		total++;
	
//  4. 총날수%7 => 요일
		int week=total%7;
		return week;
		
	}
	
//	5. 달력 출력
	static void print(int year, int month, int week)
	{
		int[] lastday= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if((year%4==0 && year%100!=100)||(year%400==0)) // 윤년조건
		{
			lastday[1]=29; // 윤년일 때 29일
		}
		else
		{
			lastday[1]=28; // 윤년 아닐 떄 28일
		}
		
		String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) // 배열이니까 -1을 해준다.
		{
			if(i==1) // 공백이 들어가는 위치
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if(week>6) // 6이상이 되면 줄바꿈을 해라.
			{
				System.out.println();
				week=0;
			}
		}
	}
	
//	6. 조립
	static void process()
	{
		int year=userInput("년도");
		int month=userInput("월");
		int week=getWeek(year, month);
		print(year, month, week);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
