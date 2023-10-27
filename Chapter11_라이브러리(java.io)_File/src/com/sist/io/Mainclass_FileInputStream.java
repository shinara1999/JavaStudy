package com.sist.io;

import java.io.*;

public class Mainclass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\category.txt"); // 한글파일은 FileInputStream(X) => FileReader로 읽어온다. (깨짐)
			int i=0; // 한글자씩 읽어오기 => ASC (문자번호)
			// A => 65
			// 파일 끝날때까지 읽어온다. => -1 (EOF)
			// 바이트 스트림은 한글파일 읽기 용도가 아닌 파일 업로드 / 다운로드 시 사용한다.
			
			String msg="";
			while((i=fis.read())!=-1)
			{
				msg+=(char)i;
			}
			fis.close();
			System.out.println(msg);
		}catch(Exception ex) {}
	}

}
