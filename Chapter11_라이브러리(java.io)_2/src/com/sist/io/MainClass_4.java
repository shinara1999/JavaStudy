package com.sist.io;

// BufferedOutputStream => 파일 쓰기

import java.io.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\java_data//sawon.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			String data="신아라|개발부|서울|사원|3200\r\n";
			bos.write(data.getBytes());
			bos.close();
			
		}catch(Exception ex) {}
	}

}
