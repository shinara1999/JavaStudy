package com.sist.io;
/*
 		IO => 입력, 출력
 		= 메모리 입출력
 		= 파일 입출력
 		= 네트워크 입출력
 		---------------------------------
 		1. 클래스의 종류
 			1) 송수신 => 1byte === 바이트 스트림
 			2) 송수신 => 2byte === 문자 스트림
 			   **  스트림 : 데이터를 이동하는 통로
 			메모리, 파일, 네트워크 ===== 자바응용프로그램 ===== 화면출력
 								ㅣ				    ㅣ
 						InputStream(1byte)	   OutputStream
 						Reader(2byte)			  Writer
 			3) 클래스
 			    = 1byte(바이트 스트림)
 			    	=> 파일전송, 업로드, 다운로드 => byte 단위로 전송
 			    	
 			     InputStream : 읽기							  OutputStream : 쓰기
 			   			ㅣ						   			 		  ㅣ
 			   --------------------		  			 		 --------------------
 			   ㅣ				  ㅣ		 		    		 ㅣ					ㅣ
 	   **FileInputStream   FilterInputStream		**FileOutputStream   FilterOuputStream		
 								  ㅣ												ㅣ
 						 **BufferedInputStream						  **BufferedOutputStream
 						 
 			** Buffer : 임시 기억장소 => 속도 최적화 (속조가 빨라진다.)
 						=> 파일이나 웹서버에 있는 모든 데이터를 메모리에 올려놓고 시작
 			
 				= 2byte
 					=> 파일 제어 (파일 읽기 / 파일 쓰기)
 					*** 문자 스트림 (한글 => 2byte)
 					
 				Reader             Writer
 				  ㅣ                 ㅣ
 			 **FileReader       **FileWriter
 			   ----------         ----------
 				  ㅣ                 ㅣ
 		  **BufferedReader      BufferedWriter
 		  
 		  		= 객체 단위 저장
 		  			= ObjectInputStream
 		  			= ObjectOutputStream
 		  			= 직렬화 / 역직렬화
 		  			객체 저장
 		  			class A
 		  			{
 		  				int age;
 		  				String name;
 		  				int kor;
 		  			}
 		  			
 		  			A a=new A(); // 메모리 공간을 만들어서 저장한다.
 		  			
 		  			---a---
 		  			
 		  			-------		--------100--------
 		  						     ---age---
 		  						 		 0			a.age => .연산자 (주소 접근연산자)	
 		  						    -----------
 		  						
 		  						     ---name---
 		  							    null		a.name
 		  						    -----------
 		  						
 		  						     ---kor---
 		  						
 		  						    -----------
 		  						         0			a.kor
 		  						    -----------
 		  						-------------------
 		  			메모리에 저장
 		  			----------
 		  			
 		  			------------------------------- => 직렬화
 		  			  age        name         kor
 		  					ㅣ            ㅣ
 		  			-------------------------------
 		  			
 		  			메모리에서 값을 읽기
 		  			--------------- => 역질렬화 (병렬화) => ObjectInputStream
 		  			
 		  			--------100--------
 		  				---age---
 		  					0			
 		  			   -----------
 		  						
 		  				---name---
 		  				   null		
 		  			   -----------
 		  						
 		  				---kor---
 		  						
 		  			   -----------
 		  					0			
 		  			   -----------
 		  			-------------------
 		  	  => 파일 관련
 		  	  	 .txt (파일 자체를 제어)
 		  	  	 ---- Spring , MyBatis ==> XML을 대체 (어노테이션)
 		  	  		  ------ xml 없이 사용 => Spring-Boot
 		  	  	 .xml , .json , .csv , .properties (웹)
 		  	  	 ----   -----   ----
 		  	  	  ㅣ      ㅣ      ㅣ   => 데이터분선 (공공포털)
 		  	  	  		=> JavaScript
 		  	  	  		   ---------- 자바의 데이터형과 연동이 안된다.
 		  	  	  		   => class A
 		  	  	  		   {
 		  	  	  		   		String name="a";
 		  	  	  		   		int age=20;
 		  	  	  		   }
 		  	  	  		   
 		  	  	  		   {name:"a", age:20} => 객체표현법 => JSON
 		  	  	  		   => Ajax , Vue , React ==> RestFul
 		  	  	 -------------------> 제어 (읽기/쓰기) 클래스가 이미 라이브러리로 제공된다.
 		  	  	 => 파일 정보 => File
 		  	  	    File : 파일, 디렉토리까지 관리
 		  	  	    ---- 일반 클래스
 		  	  	    사용법)
 		  	  	    	File file=new File("c:\\javaDev\\aa.txt");
 		  	  	    		 파일 정보 읽기
 		  	  	    	File dir=new File("c:\\javaDev");
 		  	  	    		 폴더 정보 읽기
 		  	  	    주요 메소드)
 		  	  	    	=> long length()      : 파일 크기ㅣ => 단위 Bytes
 		  	  	    	=> String getName()   : 파일이나 폴더 이름만 읽은 경우
 		  	  	    	=> String getPath()   : 경로+이름
 		  	  	    	=> String getParent() : 경로
 		  	  	    	=> boolean isFile()
 		  	  	    	   boolean isDirectory()
 		  	  	    	=> boolean exists()   : 존재여부 확인
 		  	  	    	=> File[] listFiles() : 폴더안에있는 모든 파읽 읽기
 		  	  	    	=> delete() : 파일 삭제
 		  	  	    	=> createNewFile() : 파일 생성
 		  	  	    	=> mkdir() : 폴더 생성
 		  	  	    	------------------------------------------------
 		  	  	    	FileInputStream / FileReader
 		  	  	    	   = read() , ream(byte[], offset, len) , close()
 		  	  	    	FileOutputStream / FileWriter
 		  	  	    	   = write() , write(String...) , close()
 */
// => Buffered
import java.io.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// InputStream => fileInputStream , URL
		// 필터스트림 ==> 1byte를 읽어서 => 2byte로 변환해서 사용
//		String data="";
//		while(true)
//		{
//			String s=in.readline();
//			if(s==null)
//			{
//				break;
//			}
//			data+=s;
//		}
	}

}
