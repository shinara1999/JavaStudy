/*
 * 		변수 / 연산자 / 제어문
 * 			  ------------ 명령문
 * 		=> 묶어서 사용
 * 		변수 : 배열 / 클래스 (핵심!!)
 * 		명령문 : 관련된 명령
 * 			   => 입력 관련 / 출력 관련 / 요청 관련 => 메소드
 * 			   => 동작 => 조립해서 사용 (객체지향 프로그램)
 * 						 ---------- 수정 / 추가 (유지보수)
 * 		메소드는 한개의 기능만 수행이 가능하게 만든다.
 * 		=> 자바는 클래스 영역을 벗어날 수 없다. (클래스 종속)
 * 		1. 메소드의 구성요소
 * 			= 리턴형 : 사용자 요청에 대한 처리 결과값
 * 					 결과값은 반드시 한개만 사용 가능하다.
 * 								 ------------- 여러개인 경우 : 배열/클래스/컬렉션
 * 					 => 예측해서 설정
 * 			= 매개변수 : 사용자가 요청한 값
 * 					   웹에서 마우스클릭, 엔터, 버튼 누르기, 입력창에 입력 
 * 							--------                  ----------
 * 					   => 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 * 								 ---------- : 마우스 , 키보드
 * 			= 메소드명 : 식별자 (변수)
 * 					   => 소문자로 시작한다. +a
 * 			= return 문장 : 처리에 대한 결과값을 보내준다, 메소드의 종료
 * 			  ---------- 항상 맨 마지막에 오는것은 아니다. (중간에서 종료시킬 수도 있음)
 * 			  메소드()
 * 			  {
 * 				if()
 * 				{
 * 					return; (이런식으로)
 * 				}
 * 			  }
 * 		2. 메소드 형식
 * 			 public : 모든 클래스에서 사용
 * 			 protected : 상속받는 클래스 , 같은 폴더 안에서 사용
 * 			 default : 같은 폴더 안에서만 사용
 * 			 private : 자신의 클래스 안에서만 사용 => 은닉화
 * 				ㅣ
 * 			[접근지정어] [옵션] 리턴형 메소드명 (매개변수)
 * 						ㅣ
 * 					   static : 자동 메모리 저장 ==> new
 * 					   abstract : 추상메소드 ==> 선언 (설계=>요구사항)
 * 					   final : 수정이 불가능 => String, Math..
 * 
 * 			 리턴형(1개)으로 사용 => 기본형 (int , long , byte , char , double , boolean)
 * 								   ---                        ------   -------
 * 						      => 참조형 : 배열 / 클래스
 * 							            String , int[]
 * 			 			      => 메소드 매개변수 전송법
 * 							     -----------------
 * 							     Call By Value / Call By Reference
 * 			 매개변수(0개이상)로 사용 => 기본형 : Call By Value
 * 								 => 참조형 : Call By Reference
 * 								 *** 매개변수가 3개 이상이면 배열/클래스를 사용한다.
 * 
 * 			 [접근지정어] [옵션] 리턴형 메소드명 (매개변수) => *선언부
 * 			 {
 * 				*구현부
 * 				-- 변수선언
 * 				-- 연산자
 * 				-- 제어문
 * 				--------- 반드시 결과값을 도출해야 한다.
 * 				return 결과값;
 * 				=> 결과값이 없을 때는 자체 처리 : void => return을 생략할 수 있다.
 * 													   ㅣ모든 메소드는 return을 필요로 한다.
 * 													   ㅣ(안쓰는게 아니고 컴파일러가 자동 추가했다는 뜻)
 * 			 }
 * 			 => return / import java.lang.*
 * 						 ------------------ String , Math , System... 등은 자동 추가
 * 				return을 생략할때는 void인 경우에만 가능하다.
 * 			 *** 모든 프로그램
 * 			 = 입력 => 변수에 대한 초기화
 * 			 = 처리부분 (요청처리) => CRUD
 * 								  ---- 
 * 									Create : 추가 => INSERT
 * 									Read : 읽기 (목록, 상세보기) => SELECT
 * 									Update : 수정 => UPDATE
 * 									Delete : 삭제 => DELETE
 * 			 = 출력 => 사용자가 볼 수 있게 만든다. => HTML, CSS
 * 			 = main() => 프로그램의 시작과 종료를 나타낸다.
 * 
 * 		3. 메소드 유형
 * 			 리턴형         매개변수
 * 			   O             O
 * 					=> String substring(int begin) => 원형
 * 					   ------           ---------
 *             O             X
 *             		=> String trim()
 *             		   double random()
 *             X             O
 *             		=> void main(String[] arg)
 *             		   ---- 메소드 자체에서 처리
 *             X             X
 *             		=> void , println() => 다음줄 출력
 *             
 *             		*** 한개의 클래스 안에서 메소드명이 동일할 수 있다.
 *             							------------
 *             								ㅣ
 *             						 	  매개변수의 갯수나 데이터형이 다르다.
 *             							  aaa(int a) => aaa(int)
 *             							  aaa(double d)
 *             							  aaa(int a, int b) => 오버로딩
 *             								=> 중복 정의 메소드
 *             		plus(int,int) , plus(char,char) , plus(double,double)
 *     4. 메소드 호출
 *     	  ---------
 *     		 = 인스턴스 메소드 => new를 이용해서 메모리 저장
 *     		   Scanner scan=new Scanner(System.in);
 *     		   scan.nextInt();
 *     		   String s="";
 *     		   s.메소드
 *     		 = 클래스 메소드 (static) => 공유 => 자동저장
 *     		   Math.random()
 *     
 *     		 => static
 *     			클래스명.메소드명()
 *     			---------------
 *     				=> 같은 클래스인 경우 => 클래스명은 생략이 가능
 *     		 => aaa(int a, int b)
 *     				=> aaa(10, 20) 호출할 때는 값을 채워서 호출해야 한다.
 *     		 => int aaa()
 *     			int a=aaa()
 *     			---
 *     5. return값 설정
 *     	  -----------
 *     		int display()
 *     		{
 *     			return 10;
 *     		}
 *     
 *     		double display()
 *     		{
 *     			return 10.5;
 *     		{
 *     
 *     		String display()
 *     		{
 *     			return "";
 *     		}
 *     
 *     		void display()
 *     		{
 *     			return; **생략 가능!!
 *     		}
 *     
 *     		int[] display()
 *     		{
 *     			int[] arr=new int[5];
 *     			return arr; => 리턴값이 많을때는 배열로 넘길 수 있다.
 *     		}		
 *     
 *     		==> *** 필요할 때 여러번 호출 가능하다. (재사용)
 *     
 *     6. 메소드 사용 목적
 *     		= 반복되는 기능 제거
 *     		= 코드 관리가 쉽다 (기능별 분리)
 *     		= 소스가 간결하다
 *     		= 재사용 (다른 클래스 연결)
 *     		--------------------------
 */

// 5개의 정수를 전송 => 정렬한다 int[]
// 5자리 정수를 전송 (만단위) => 이것을 거꾸로 출력
import java.util.*;
public class 메소드_1 {
	
	static int[] sortASC(int[] arr) // 배열을 정렬해서 넘겨준다.
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) // > : 오름차순(ASC) , < : 내림차순(DESC)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr; // 배열을 return함
	}
	
	static int[] sortDESC(int[] arr) // 배열을 정렬해서 넘겨준다.
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) // > : 오름차순(ASC) , < : 내림차순(DESC)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr; // 배열을 return함
	}
	
	// ASC , DESC 두개를 한번에 쓰는 방법
//	static int[] sort(int[]arr, String type)
//	{
//		boolean bCheck=false;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(type.equals("ASC"))
//				{
//					bCheck=arr[i]>arr[j]; // ASC
//				}
//				else
//				{
//					bCheck=arr[i]<arr[j]; // DESC
//				}
//				if(bCheck)
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		return arr; // 배열을 return함
		
		// void 사용
		static void sort_1(int[]arr, String type)
		{
			boolean bCheck=false;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(type.equals("ASC"))
					{
						bCheck=arr[i]>arr[j]; // ASC
					}
					else
					{
						bCheck=arr[i]<arr[j]; // DESC
					}
					if(bCheck)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
//			return arr; => void는 return을 사용할 수 없다.
	}
		
	// 5자리 정수 거꾸로 출력
	static int reverse(int a)
	{
		String str=String.valueOf(a); // 정수형을 문자열로 변경
		
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res+=str.charAt(i);
		}
    	return Integer.parseInt(res); // ?
	}
	
	// 조립
	static void process()
	{
		// 5개정수 설정
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		
//		int[] result=sortASC(arr); // 정렬해서 넘겨준다. 정렬한 값을 result에 저장
//		System.out.println("정렬 후(오름차순):");
//		System.out.println(Arrays.toString(result));
//		
//		result=sortDESC(arr); // 정렬해서 넘겨준다. 정렬한 값을 result에 저장
//		System.out.println("정렬 후(내림차순):");
//		System.out.println(Arrays.toString(result));
		
		// ASC , DESC 두개를 한번에 쓰는 방법
//		int[] result=sort(arr,"ASC");
//		System.out.println(Arrays.toString(result));
//		result=sort(arr,"DESC");
//		System.out.println(Arrays.toString(result));
		
		// void 사용 << Call By Reference >>
		sort_1(arr, "ASC");
		System.out.println(Arrays.toString(arr));
		sort_1(arr, "DESC");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(reverse(12345));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 조립된것만 호출하면 끝

	}

}











