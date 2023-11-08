package com.sist.io;

// BufferedInputStream => 파일 데이터 읽기

import java.io.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			// 1byte => 한글 불가
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			int i=0;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			bis.close();
		}catch(Exception ex) {}

	}

}
