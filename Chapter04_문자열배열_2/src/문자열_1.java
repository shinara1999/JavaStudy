/*
 * 		문자열 저장 => String => "" 
 * 		한개 저장
 * 			String 변수명="";
 * 		여러개 저장
 * 			String[] 배열명={"","",""...};
 * 			String[] 배열명=new String[5];
 * 		String은 클래스= => 메소드 (기능)
 * 						  ----- 3가지 확인해야 한다.
 * 							1. 메소드명 : 기능
 * 							2. 결과값 확인
 * 							3. () => 매개변수
 * 		=> length()
 * 			=> 원형 : int length() => 문자갯수
 * 					 ---
 * 					 String s="Hello";
 * 					 s.length() => Hello의 문자 갯수가 얼마인가?
 * 					 int len=s.length()
 * 					 sysout(len) => 5
 * 		=>toUpperCase()
 * 			=> 원형 : String toUpperCase() => 대문자 변환 시에 사용		
 * 					 ------
 * 					 String s="Hello";
 * 					 String ss=s.toUpperCase();
 * 					 sysout(ss) => HELLO
 * 
 * 		=> toLowerCase()
 * 			=> 원형 : String toLowerCase() => 소문자 변환 시에 사용
 * 					 ------
 *					 String s="Hello";
 * 					 String ss=s.toLowerCase();
 * 					 sysout(ss) => hello
 * 		=> substring()
 * 			=> 원형 : String substring(int begin) => 문자를 자른다
 * 					 ------			  ---------
 * 					  리턴형				매개변수
 * 					  ---- 요청처리결과	------ 사용자요청
 * 					 => 로그인 : 요청 => id, pwd / 결과값 => boolean
 * 					    boolean isLogin(String id, String pwd)
 * 					 String ss=s.substring(1);
 * 					 sysout(ss); => ello
 * 					 String substring(int begin, int end) => 문자를 자른다
 * 					 String ss=s.substring(1, 3);
 * 					 sysout(ss); => el
 * 		=> startsWith()
 * 			=> 원형 : boolean startsWith(String msg) => 시작문자열이 같은지 확인
 * 					 => if문에서 주로 처리
 * 					 String s="Hello Java!"
 * 					 if(s.startsWith("H"))
 * 						sysout()
 * 					 => 서제스트 (자동완성기)
 * 		=> endsWith()
 * 			=> 원형 : boolean endsWith(String msg) => 끝나는 문자열이 같은지 확인
 * 					 => 확장자 (jpg, png, gif...) => 갤러리 게시판
 * 		=> contains()
 * 			=> 원형 : boolean contains(String msg) => 문자열 포함 여부 확인
 * 					 => 검색
 * 					 LIKE '%A%'
 * 		=> trim()
 * 			=> 원형: String trim() => 좌우 공백 제거
 * 					=> 로그인 입력 , 검색어 입력 , 회원가입
 * 					=> 유효성검사
 * 		=> equals()
 * 			=> 원형 : boolean equals(String msg) => 같은 문자인지 확인
 * 				 	 => 로그인 (아이디, 비밀번호)
 * 		=> replace()
 * 			=> 원형 : String repalce(char c1, charc2) => 문자, 문자열 별경 => 데이터배이스
 * 					 ||(문자열 결합) , %(입력값)
 * 					 => 이미지 URL
 * 		=> value of() : 모든 데이터형을 문자열로 반환
 *			=> 원형 : String valueOf(int a) => boolean b
 *					 => static : 자동 메모리 할당
 *					 String() valueOf()
 *		=> toString() : 생략이 가능 => 객체의 주소값 출력
 *		=> indexOf() : 지정된 문자위치값 확인 (문자번호 0번부터)
 *			=> 원형 : int indexOf(char)
 *					 int lastIndexOf()String s
 *		=> lastIndexof() : 지정된 문자위치값 확인 (문자번호, lelngth()-1)
 *			=> 원형 : int lastIndexOf()String s
 *		=> concat() : 문자열 결합 (+)
 *			=> 원형 : String concat(String s)
 *		=> split() : 특정 문자를 중심으로 잘라서 배열에 저장
 *			=> 원형 : String[] split(String regax)
 *										   ----- 정규식
 * 		=> replaceAll() : 문자열 변환
 * 			=> 원형 : String replaceAll(String regax)
 * 		---------------------------------------------------------------------------
 */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"박병찬", "성준수", "전영중", "최종수", "조신우"};
		// String은 문자 저장에 제한이 없다.
		/*
		 * 	Stack					Heap
		 * 	names		    names[0] names[1] names[2] names[3] names[4] => 0번부터 일률적으로 처리	
		 * 	-----			---------------------------------------------
		 * 	 100			"박병찬" | "성준수" | "전영중" | "최종수" | "조신우"
		 * 	-----			|--------------------------------------------
		 * 				 메모리주소 (100)
		 * 		1. 선언
		 * 			데이터형[] 배열명
		 * 		2. 초기값 부여
		 * 			데이터형[] 배열명={};
		 * 			데이터형[] 배열명=new 데이터형[갯수];
		 * 			배열명[0]="";
		 * 			for문
		 * 			난수발생...
		 * 		3. 활용 / 변경 , 출력
		 * 					   --- for-each
		 * 			배열명[0]="" => 변경
		 */
		// 출력 => 이 방법은 속도가 빠르다는 장점이 있다.
		for(String name:names)
		{
			System.out.println(name);
		}
		// 인덱스를 이용한 출력
		System.out.println("=====================");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("=====================");
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		
		int index=0;
		for(String n:names)
		{
			if(n.equals(name))
			{
				break;
			}
			index++;
		}
		System.out.println(name+"은(는)"+(index+1)+"번째에 위치해 있습니다.");
		

	}

}
