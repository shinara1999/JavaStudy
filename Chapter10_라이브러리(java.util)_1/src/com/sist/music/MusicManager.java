package com.sist.music;
// Music 제어 프로그램
import java.io.*;
import java.util.*;
public class MusicManager {
	private static Music[] musics=new Music[48];
	// 접속하는 모든 유저에게 공유 => 목록 => static
	// 초기화 ==> 클래스블록에서는 초기화가 불가
	/*
	 		1) 인스턴스 블록 : 인스턴스 , static
	 		2) static 블록 : static => 인스턴스를 초기화 (객체 생성)
	 		3) 생성자 : 인스턴스 , static
	 		
	 	예외처리의 종류 (예외: java.io , java.net , java.sql)
	 								--------------------
	 									ㅣ 웹(네트워트)
	 		= 예외 복구
	 			try
	 			{
	 				=> 정상 수행 , 예외가 발생되는 소스
	 				   -------
	 			}catch(예외클래스)
	 			{
	 				예외 발생시 복구
	 				=> 예외의 위치
	 					=> getMesssage()
	 					=> printStackTrace()
	 					=> 디버깅 확인 ==> 수정
	 			}
	 		= 예외 회피 (예외 떠맡기기)
	 			=> 라이브러리에서 많이 사용 => 개발자
	 			=> 예상되는 에러를 선언 => 컴파일러가 확인을 안하고 동작
	 			   method() throws 예외..(순서가 없다.)
	 			=> 처리 방법은 throws이용 , try~catch절 이용
	 		= 임의의 발생
	 			=> throws new 예외처리생성자()
	 		= 사용자 정의 예외처리
	 			=> class MyException extends Exception
	 				{
	 				}
	 				
	 		try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?

			① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
							 --------------------------
								사용자 입력../실수
			② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.

			③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다.
				finally { } 블록은 실행되지 않는다. ==> 무조건 수행
			④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.

	 */
	
	// 생성자 이용
	
	public MusicManager()
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			String music_data="";
			while((i=fr.read())!=-1)
			{
				music_data+=(char)i;
			}
			
			// 1.
			String[] mds=music_data.split("\r\n");
			i=0;
			for(String s:mds)
			{
				try
				{
					
					StringTokenizer st=new StringTokenizer(s, "|");
					musics[i]=new Music();
					musics[i].setRank(Integer.parseInt(st.nextToken()));
					musics[i].setTitle(st.nextToken());
					musics[i].setSinger(st.nextToken());
					musics[i].setAlbum(st.nextToken());
					musics[i].setKey(st.nextToken());
					i++;
				}catch(Exception ex) {}
			}
		}catch(Exception ex)
		{
			// 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			// 파일 닫기
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
	public Music[] musicAllData()
	{
		return musics;
	}
	
}

