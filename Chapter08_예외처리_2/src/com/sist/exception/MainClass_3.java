package com.sist.exception;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택적인 부분 ==> 오류 발생시 제외 ==> 크롤링
//		try
//		{
			for(int i=1;i<=10;i++)
			{	 
				try // 예외처리를 안쪽에 줘야 제외시키고 넘어간다.
				{
				int j=(int)(Math.random()*3);
				System.out.println("j="+j);
				System.out.println("i="+i+", i/j="+(i/j));
				// 제외 => continue;
				}catch(Exception e) {}
			}
//		}catch(Exception e) {}
	}

}
