/*
 * 
 */
import java.io.*; // 파일 읽어오기 (파일입출력 , 메모리입출력)
import java.util.*; // import는 여러개 사용 가능하다.
public class 문자열_6 {
	static String seoulData=" ";
	static // 자동 실행
	{
		try
		{
			FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				seoulData+=(char)i;
			}
			fr.close();
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(seoulData);
		
		// 1. 페이징 기법 => 10페이지 출력
		String[] seoul=seoulData.split("\n");
		Scanner scan=new Scanner(System.in);
		int curpage=1; // 현재페이지
		int totalpage=(int)(Math.ceil(seoul.length/10.0)); // Math.ceil() : 올림함수 27.3 => 28
		// System.out.println("총페이지:"+totalpage);
		while(true)
		{
			System.out.print("페이지 선택(1~"+totalpage+"):");
			curpage=scan.nextInt();
			
			if(curpage<1 || curpage>totalpage)
			{
				System.out.println("프로그램 종료");
				break;
			}
			
			final int ROW=10; // ROW라는 상수 주기
			int j=0; // 10개씩 나눠주는 변수
			int pagecnt=(curpage*ROW)-ROW; // for문의 시작위치 (출력)
			/*
			 * 		1페이지 요청 : 0~9
			 * 		2페이지 요청 : 10~19
			 * 		3페이지 요청 : 20~29
			 * 		...
			 */
			for(int i=0;i<seoul.length;i++)
			{
				String[] ss=seoul[i].split("\\|");
				if(j<ROW && i>=pagecnt)
				{
					System.out.println(ss[0]+"."+ss[1]);
					j++;;
				}
			}
		}
	
	}

}
