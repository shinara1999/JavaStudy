package com.sist.lib;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/*
 		자바 입출력 (입력: InputStream , 출력:outputStream)
 				  -------------------------------------- IO
 		=> 반드시 예외처리를 해야된다.
 		=> 반드시 => import를 이용해서 클래스를 읽어온다.
 				   ------- import java.io.*;
 		=> 특징
 			=> 단방향
 			=> 데이터 이동통로를 이용하고 있다.
 			   ------------ Stream
 			=> 이동 통로
 			   -------
 			   	1) 1byte : 바이트 스트림
 			   		~InputStream , ~OutputStream
 			   		=> 파일 업로드 / 파일 다운로드
 			   		   ----------------------
 			   		=> 네트워크는 1바이트씩 전송한다.
 			   	2) 2byte : 문자 스트림
 			   		~Reader , ~Writer
 			   		=> 파일 쓰기 / 파일 읽기
 		-----------------------------------------------------------------------------------
 357 page
 
 		바이트 스트림
 		----------
 		   InputStream			OutputStream
 		   	 	ㅣ					  ㅣ
 		 FileInputStream	    FileOutputStream
 		ObjectInputStream	   ObjectOutputStream
 		
 			Reader					Writer
 			------					------
 			  ㅣ						  ㅣ
 		  FileReader			   FileWriter
 		------------------------------------------------------------------------------------
 		보조스트림
 		Buffered~
 			=> BufferedReader , BufferedWriter , BufferedInputStream , BufferedOutputStream
 		------------------------------------------------------------------------------------
 		
 		1) 자바 특징
 		   -------
 		    자바에서 IO는 Stream을 사용하고 있다.
 		    		   -------
 		    		   	ㅣ 데이터 이동 통로
 		    		   	  ------------- FIFO = Queue
 		    		   	  LIFO = Stack (메모리)
 		   => IO
 		   	  = 메모리 입출력
 		   	  = 파일 입출력
 		   	  = 네트워트 입출력 => 웹
 		   => IO는 단방향 통신
 		   	    양방향 => 쓰레드를 이용해서 2개의 프로그램을 동시에 돌린다.
 		   	    ---- 채팅
 		   => 읽기 / 쓰기 (1byte, 2byte)
 		      자바(서버) =====> 브라우저 =====> 화면 출력
 		      					ㅣ
 		      				  C/C++
 		      char=>2		 char=>1		 char=>2
 		         char=>byte로 변경  byte=>char로 변경
 		         	encoding		  decoding
 		      
 		      = 1byte : 바이트 스트림
 		       ~InputStream , ~OutputStream
 		      = 2byte : 문자 스트림
 		       ~Reader , ~Writer
 		       ** 한글은 1글자 2byte => 한글이 깨진다.
 356 page
 		 메모리 (데이터 저장) ========== 자바응용프로그램 ========== 모니터 전송     
 		   					  ㅣ						  ㅣ
 		   				  InputStream			 OutputStream
 		   				   System.in			  System.out
 		   				   
 		   				  class System
 		   				  {
 		   				  		static InputStream in;
 		   				  		static OutputStream out;
 		   				  }
 357 page
 		 IO 관련 클래스
 		 													  Object
 		 							  							ㅣ
 				-------------------------------------------------------------------------------------------------	
 				ㅣ						ㅣ						ㅣ						ㅣ						ㅣ
 			   File		   			InputStream	  	  	   OutputStream    	          Reader	    	      Writer
 			   						    ㅣ						ㅣ						ㅣ						ㅣ
 								**FileInputStream	 	**FileOutputStream		 **BufferedReader		   BUfferedWriter
 			   			 	 	FilterInputStream		FilterOutputStream			**FileReader			**FileWriter
 			   			 	 			ㅣ						ㅣ
 			   			 	  **BufferedInputStream	  **BufferedOutputStream
 			   			 
 			   	+ **ObjectInputStrem, **ObjectOutputStream
 			   	
 			   	==> 파일 모드 (mode) : r, w, a
 			   		r
 			   		FileReader r=new FileReader("경로")
 			   		w
 			   		FileWriter w=new FileWriter("경로") ==> create : 새로운 파일 만들기
 			   		a
 			   		FileWriter a=new FileWriter("경로", true) ==> append : 기존의 파일에 붙여쓰기
 			   	==> File : 독립된 클래스
 			   		----
 			   		 = File 정보
 			   		   new File("경로명\\파일명")
 			   		 = 디렉토리 정보
 			   		   new File("경로명")
 			   		 = 주요 기능
 			   		   => getName()   : 파일명 , 폴더명
 			   		   => getPath()   : 경로명 ~ 파일명
 			   		   => getParent() : 경로명
 			   		   => 특성
 			   		   	  1. canRead()  : 읽기 전용
 			   		   	  2. canWrite() : 쓰기 전용
 			   		   	  3. isHidden() : 숨김 파일
 			   		   => 파일/폴더 확인
 			   		   	  isFile() , isDirectory()
 */
import java.util.*;
/*
 		int[] arr=new int[10];
 		int index=0;
 		for(int i=0;i<arr.length;i++)
 		
 		inr index=9;
 		for(int i=9;i>=0;i--)
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q=new LinkedList<Integer>();
//		// 데이터 첨부
//		q.offer(10);
//		q.offer(20);
//		q.offer(30);
//		q.offer(40);
//		q.offer(50);
//		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.poll());
//		}
//		System.out.println("=======================");
//		Stack<Integer> s=new Stack<Integer>();
//		
//		// 저장
//		s.push(10);
//		s.push(20);
//		s.push(30);
//		s.push(40);
//		s.push(50);
//		
//		while(!s.isEmpty())
//		{
//			System.out.println(s.pop());
//		}
		
		String s="자바";
		byte[] b=s.getBytes();
		try {
			System.out.println(URLEncoder.encode(s, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}












