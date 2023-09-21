// startsWith , endsWith , contains => 검색기, 자동완성기

import java.util.Scanner;
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java"
		};
		
		System.out.print("검색어 입력:");
		String findData=scan.nextLine(); // nextLine() : 단어가 아닌 전체문장을 가져올 때 사용
		System.out.println(findData);
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i].contains(findData)) // 특정 단어가 포함되는 문장 가져오기
			// if(data[i].endsWith(findData)) // 마지막 단어가 포함된 문장 가져오기
			// if(data[i].startsWith(findData)) // 첫번째 단어가 포함된 문장 가져오기
			{
				try
				{
					Thread.sleep(500); // 멈췄다 출력되는 프로그램
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}
