package com.sist.io;
// 파일 정보 출력

import java.io.*;
import java.util.*;
import java.text.*;

/*
 		*** getName() , getPath() , length()
 */

public class MainClass_File_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			File file=new File("c:\\javaDev\\movie.txt");
			System.out.println("최종 수정일: "+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")
					.format(new Date(file.lastModified())));
					// long형으로 출력된다. => 1695783952083
					// new Date()를 이용해 변환 => Wed Sep 27 12:05:52 KST 2023
					// new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format() 을 이용해 변환 => 2023-09-27 12:05:52
			
			System.out.println("========== 기타 정보 ==========");
			System.out.println("***파일명: "+ file.getName());
			System.out.println("***경로명+파일명: "+ file.getPath());
			System.out.println("경로명: "+file.getParent());
			System.out.println("읽기 가능: "+file.canRead()); // boolean 반환
			System.out.println("쓰기 가능: "+file.canWrite()); // boolean 반환
			System.out.println("숨김 파일: "+file.isHidden());
			System.out.println("절대 경로: "+file.getAbsolutePath());
			System.out.println("정규 경로:"+file.getCanonicalPath());
			// System.out.println("파일 크기:"+file.length());
			System.out.println("File.pathSeparator-"+File.pathSeparator);
			System.out.println(file.separator);
			
			// 파일크기 : length() 가 아닌 이걸 사용해야 한다.
			long size=file.length();
			String s="";
			if(size/1024>0)
			{
				s=(size/1024)+"KB";
			}
			else
			{
				s=size+"Bytes";
			}
			System.out.println("파일 크기: "+s);
		}catch(Exception ex) {}
	}

}



