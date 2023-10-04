// 3. 1~n까지 합을 구하는 메소드 구현

/*
 * 	메소드 사용시에 => 호출
 * 	------------------- main()은 컴파일러에 의해 자동 호출
 * 						----------------------------
 * 									ㅣ Callback
 * 
 * 	메소드
 * 		= CallBack => main => 자동 호출되는 메소드 (시작점)
 * 		= 사용자정의 : 프로그래머가 직접 제작
 * 		= 라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
 * 			= 자바에서 제공
 * 			= 외부업체에서 지원 (Jsoup, Spring) => mvnrepository.com
 * 			= CBD => 조립식
 * 			  ----------- 메소드 호출
 * 		= 조립할때 , 재사용 , 유지보수가 편리하게 만든다
 * 		= 재사용
 * 		  메소드를 불러온다
 * 		  -------------
 * 			int aaa() =====> int a=aaa()
 * 			double bbb() ==> double d=bbb()
 * 			void ccc() ====> ccc()
 * 			boolean ddd() => boolean b=ddd()
 * 			--------------------------------
 * 			class A
 * 			{
 * 				int aaa(){}
 * 			}
 * 			class B
 * 			{
 * 				main()
 * 				{
 * 					A.aaa()
 * 				}
 * 			}
 */
public class 메소드문제_3 {
	static int sum()
	{
		int hap=0;
		int n=(int)(Math.random()*100)+1;
		for(int i=1;i<=n;i++)
		{
			hap+=i;
		}
		System.out.println(n+"까지의 합="+hap);
		return hap;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sum();

	}

}
//		static void sum(int n)
//		{
//			int hap=0;
//			for(int i=1;i<=n;i++)
//			{
//				hap+=1;
//			}
//			System.out.println("hap:"+hap);
//		}
//		
//		Scanner scan=new Scanner(System.in);
//		sysout("정수 입력:")
//		int num=scan.nextInt();
//		
