package com.sist.io;
/*
 		데이터 저장 	 =====	  데이터 가공	  =====	   데이터 출력
 		변수: 한개			  연산자				   도스출력
 		배열					  제어문				   윈도우창 출력 ***
 		클래스  				  ----- 메소드		   브라우저 출력
 		----- 메모리
 		파일 ***
 		 => 업로드 , 다운로드 , Open
 		오라클 (RDBMS)
 		 => JDBC = DBCP = ORM
 		 				  (라이브러리 : MyBatis , JPA)
 		-----------------------------------------------------------------
 		사용자 정의 클래스
 		+ 라이브러리
 		-------------- 한개의 프로그램 완성
 		라이브러리
 		 = java.lang    => Object, String, Math, Wrapper
 		 			       ** StringBuffer
 		 = java.util    => Date, StringTokenizer
 		 				   List , Map
 		 			       ** Set , Calendar
 		 = java.io      => File , FileInputStream / FileOutputStream
 		 				   FileReader / FileWriter , BufferedReader
 		 				   ** ObjectInputStream / ObjectOutputStream
 		 = java.net     => URL / URLEncoder / Socket
 		 = java.sql     => Connection / Statement / ResultSet
 		 = ** java.text => DecimalFormat / SimpleDateFormat
 		 
 		 자바 ==> 2차 자바 : 브라우저 (Web)
 		 	     3차 자바 : Spring (핵심)
 		 -----------------------------------------------------------------
 		 1) IO
 		 	Input/Output  => 입출력
 		 	------------
 		 	  = 메모리
 		 	  = 파일
 		 	  = 네트워크
 		 	  ---------- => 클래스가 동일
 		 	입출력 방식
 		 	---------
 		 	
 		 	메모리 (데이터 저장)  ======  자바 응용 프로그램  ======  화면 출력
 		 	파일 , 네트워크	    ㅣ  				        ㅣ
 		 				   InputStream			   OutputStream
 		 				  	    ㅣ						ㅣ
 		 			  일반 파일 (.zip, .png)			  Writer
 		 			  => 1byte => 바이트스트림			
 		 			  문자 저장 (.txt, .dat)
 		 			  => 2byte => 문자스트림
 		 			     ** 영어 외 다른 언어
 		 			        => 1글자당 2byte
 		 			     Reader
 		 -----------------------------------------------------------------
 		 *** 스트림은 데이터 이동 통로
 		 	------ 읽기/쓰기 => 단방향 통신 => 두 개의 프로그램을 동시에 수행 (쓰레드)
 		 		   => 네트워크
 		 		   => 웹에서는 이미 서버가 만들어져 있다.
 		 		      => 기능을 추가시키는 역할 (톰캣=자바엔진=테스트서버) : 벡엔드
 		 		      					 	--- 50명까지만 접속 가능
 		 바이트 스트림 (1byte) => 업로드 , 다운로드 , 카페...
 		 
 		  		InputStream				OutputStream
 		  			 ㅣ						  ㅣ
 		  	  **FileInputStream		  **FileOutputStream
 		  	  FilterInputStream		  FilterOutputStream	
 		  	  		 ㅣ						  ㅣ
 		  	**BufferedInputStream	**BufferedOutputStream
 		  	 => 메모리에 전체를 저장				  ㅣ
 		  	  	(속도가 빠르다.)		 **ObjectOutputStream
 		  	**ObjectInputStream
 		  	 => *** 객체단위 저장
 		  	  		 	
 		  	  		 	
 		 문자 스트림 (2byte) => 파일제어(한글) => 파일읽기 / 쓰기
 		 
 		 		Reader						Writer
 		 		  ㅣ							  ㅣ
 		 	 **FileReader				 **FileWriter
 		 		  ㅣ							  ㅣ
 		    **BufferedReader			BufferedWrither
 		 		
 		 *** 독립적인 클래스
 		 	 File : file , directory => 포함
 		 	 
 		 ***
 		   바이트스트림 (1byte씩 송수신) => 자료실 (업로드 , 다운로드)
 		   			 => 갤러리게시판 , 후기게시판
 		   문자스트림   (2byte씩 송수신) => 한글파일 읽기 / 저장
 		   			  ** 한글은 1글자 당 2byte => UTF-8
 		   			  	 --------------------------- Git 연결 시 통일
 		   보조스트림 : 읽는 속도, 쓰는 속도를 빨리하기 위해 미리 메모리에 올려놓고 시작
 		   			  String / StringBuffer
 		   		=> Buffered~ 
 		   		=> 전체를 메모리로 이동 => 메모리에 제어
 		   파일
 		   	 File => 정보
 		   	 파일 읽기 : FielInputStream / FileReader
 		   	 		   => String은 저장 불가능 => byte[]로 변경 후 저장
 		   	 파일 쓰기 : FileOutputStream / FileWriter
 		   	 		   => String 자체를 저장
 		   네트워크
 		   	 => OutputStream (1byte)
 		   	 => BufferedReader (2byte로 변환 후 수신0
 		   	 
 	   ==> 메소드 : read() , write() , close() 
 	   ==> IO는 반드시 예외처리한다. (체크 예외처리)
 	   
 	   *** File
 	   		=> 파일의 정보를 읽어올 때 생성자를 이용한다.
 	   		=> file
 	   		   new file("경로명\\파일명")
 	   		=> directory
 	   		   new File("경로명")
 	   		=> 주요 메소드
 	   		   1) 파일 특성
 	   		   	  = 읽기 전용 => boolean canRead()
 	   		   	  = 쓰기 전용 => boolean canWrite()
 	   		   	  = 숨김 파일 => boolean isHidden()
 	   		   2) 파일 정보
 	   		   	  = 파일명 : String getName()
 	   		   	  = 경로명 + 파일명 : *** String getPath()
 	   		   	  = 경로명 : String getParent()
 	   		   	  = 파일 크기 : *** long length()
 	   		   	  = 수정일 : long lastModified()
 	   		   3) 파일 종류
 	   		   	  = 파일 : boolean isFile()
 	   		   	  = 폴더 : boolean isDirectory()
 	   		   4) 파일 , 디렉토리 만들기
 	   		      = createNewFile() => 파일 만들 경우
 	   		      = *** mkdir()
 	   		   5) 삭제
 	   		   	  = *** void delete() => 폴더 삭제시에 파일이 존재하면 삭제가 안된다.
 	   		   	    rm 파일명 , rm -rf
 	   		   	    => AWS (리눅스=명령어)
 	   		   6) 존재여부 확인
 	   		   	  = boolean exists()
 	   		   7) 폴더에 있는 모든 파일 읽기
 	   		   	  = *** File[] listFiles()
 	   		   8) 파일 크기
 	   		   	  Byte => KB => MB
 	   		   	  		 ----
 	   		   	  		 파일크기/1024 => (파일크기/1024)/1024
 */

// 폴더 전체 확인
import java.io.*;
public class MainClass_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			// directory 확인
			File dir=new File("c:\\javaDev");
			
			// window => \ 사용 , mac이나 linux => / 사용
			// 			(\\ 2개 사용해야 한다.)
			// 가급적이면 절대경로를 이용한다.
			// . => 현재폴더 , .. => 상위폴더로 이동 (cd => change directory)
			// 폴더안에 있는 폴더/파일읽기
			File[] list=dir.listFiles();
			
			// 출력
			for(File f:list)
			{
				if(f.isFile())
				{
					System.out.println(f.getName()+"(file)");
				}
				else if(f.isDirectory())
				{
					System.out.println(f.getName()+"(dir)");
				}
			}
		}catch(Exception ex) {}
	}

}










