package com.sist.io;

import java.io.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\genie.txt");
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			int i=0; // read()       => 한글자 읽기
					 // read(byte[]) => 읽은 바이트수
			byte[] buffer=new byte[1024];
			// => 1024byte를 읽어서 새로운 파일에 전송한다.
			while((i=bis.read(buffer, 0, 1024))!=-1)
			{
				bos.write(buffer, 0, i); // 0부터 읽은 바이트 수 만큼만 저장한다는 뜻
			}
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료");
			
		}catch(Exception ex) {}

	}

}
