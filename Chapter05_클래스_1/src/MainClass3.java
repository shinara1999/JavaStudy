/*
 * 		프로그램
 * 		벤치마킹 ===> 요구사항 분석 ===> 데이터 저장 ===> 구형
 * 		------
 * 		사이트 한페이지  클래스     ===> new    ===> method
 * 		----
 * 		 ㅣ
 * 		상세보기 ------------------- new
 * 		클래스 => 114 page ~ 115 page
 */

class Recipe
{
	// 멤버변수 => 자동 초기화 (초기값을 주거나 하지 않는다.)
	/*
	 * 	String  => null (주소를 가지고 있지 않은 상태)
	 * 	int     => 0
	 * 	double  => 0.0
	 * 	boolean => false
	 * 	char    => '\0'
	 */
	String poster;
	String title;
	String chef;
	int score;
	String hit;
	int showUser;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recipe r1=new Recipe(); // new한 순간 메모리에 저장된다.
		System.out.println(r1.poster); // null
		System.out.println(r1.title); // null
		System.out.println(r1.chef); // null
		
		r1.poster="https://recipe1.ezmember.co.kr/cache/recipe/2023/09/24/66912efca16e829100ef21732f4b26841_m.jpg";
		r1.title="대패 우유 카레우동 레시피";
		r1.chef="동이";
		r1.score=5;
		r1.hit="1229";
		r1.showUser=1;
		
		System.out.println("======= 레시피 정보 =======");
		System.out.println("Poster:"+r1.poster);
		System.out.println("Title:"+r1.title);
		System.out.println("Chef:"+r1.chef);
		System.out.println("Score:"+r1.score);
		System.out.println("조회수:"+r1.hit);
		System.out.println("사용자:"+r1.showUser);
		System.out.println("평점:★★★★★");
		
		Recipe r2=new Recipe(); // new한 순간 메모리에 저장된다.
		
		r2.poster="https://recipe1.ezmember.co.kr/cache/recipe/2019/05/25/39ac1e73e998e88da300d38663242f0a1_m.jpg";
		r2.title="버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		r2.chef="루던";
		r2.score=5;
		r2.hit="34만";
		r2.showUser=279;
		
		System.out.println("======= 레시피 정보 =======");
		System.out.println("Poster:"+r2.poster);
		System.out.println("Title:"+r2.title);
		System.out.println("Chef:"+r2.chef);
		System.out.println("Score:"+r2.score);
		System.out.println("조회수:"+r2.hit);
		System.out.println("사용자:"+r2.showUser);
		System.out.println("평점:★★★★★");

	}

}
