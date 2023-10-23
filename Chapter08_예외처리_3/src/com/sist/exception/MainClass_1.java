package com.sist.exception;
/*
 * 		throws => 선언 => 예외회피
 * 		=> method 뒤에 붙어있다. => 라이브러리에 주로 사용
 * 								 -------- 자동완성기 이용
 * 		=> throws 이용할 수 있다 , try~catch 이용
 * 		   예외처리의 중심은 try~catch 이용
 * 		----------------------------------------------
 * 		주의점
 * 		void method() throws Exception , IOException , SQLException
 * 		{
 * 		}
 * 
 * 		==> 사용
 * 		void main()
 * 		{
 * 			try
 * 			{
 * 			}catch(IOException e)
 * 			{
 * 			}
 * 			catch(SQLException e)
 * 			{
 * 			}
 * 			catch()Exception e
 * 			{
 * 			}
 * 		}
 * 	
 * 		=> 가장 큰 예외처리로도 가능하다.
 * 			void main() throws Exception
 * 			{
 * 			}
 * 			void main()
 * 				 try
 * 				{
 * 				}catch(Exception ex)
 * 				{
 * 				}
 * 		}
 */
public class MainClass_1 {
//	public void method() throws Exception, IOException, SQLException
	{
		//컴파일 통과
		int i=Integer.parseInt("10 ");
		System.out.println();
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MainClass_1 m=new MainClass_1();
		try
		{
			// m.method();
		}catch(Exception ex)
		{
			
		}
	}

}
