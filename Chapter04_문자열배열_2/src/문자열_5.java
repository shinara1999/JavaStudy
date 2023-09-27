import java.io.*; // 파일 읽어오기 (파일입출력 , 메모리입출력)
import java.util.*; // import는 여러개 사용 가능하다.
/*
 * 		라이브러리
 * 		-------
 * 			java.lang : OBject , String , StringBuffer , Math , Wrapper
 * 			java.util : List , Set , Map
 * 			java.io   :
 * 			java.net  :
 * 			java.text :
 * 			------------------------------------------------------------
 */
public class 문자열_5 {
	static String movie;
	static // main 전에 실행하게 만드는 블록
	{
		try
		{
			FileReader fr=new FileReader("c:\\JavaDev\\movie.txt");
			int i=0;
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) // -1 (EOF : End Of File) 파일의 끝이라는 뜻
			{
				data.append((char)i);
			}
			System.out.println(data.toString());
			movie=data.toString();
			
		}catch(Exception ex){}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// 파일 읽기 (throws Exception 처리)
		// System.out.println(movie);
		
		String[] movieData=movie.split("\n");
		// System.out.println(movieData[0]);
		
		System.out.println("========== 영화 목록 =========="); // 목록 보기 : split 사용
		// 검색
		// 송강호가 출연한 영화를 출력해라.
		// detail[4].contains(name)
		Scanner scan=new Scanner(System.in);
//		System.out.print("이름을 입력하시오:");
//		String name=scan.next();
		
		// 1990년에 개봉한 영화
		// detail[5].contains("1990")
		
		// 12세이상 관람가
		// detail[6].startsWith("12")
		System.out.print("등급을 입력하시오:");
		int grade=scan.nextInt();
		
		for(String movie:movieData)
		{
			String[] detail=movie.split("\\|");
			if(detail[6].startsWith(String.valueOf(grade))) // startsWith에는 문자열만 들어갈 수 있으므로 grade를 형변환 시킨다.
			{
				
			System.out.println("순위:"+detail[0]);
			System.out.println("영화명:"+detail[1]);
			System.out.println("장르:"+detail[2]);
			// System.out.println(""); // 이미지 파일은 아직 못불러오니까 공백으로 둔다.
			System.out.println("출연진:"+detail[4]);
			System.out.println("개봉일:"+detail[5]);
			System.out.println("등급:"+detail[6]);
			System.out.println("감독:"+detail[7]);
			System.out.println("-----------------------------------------------------------------------------------");
			
			}
		}
		

	}

}
