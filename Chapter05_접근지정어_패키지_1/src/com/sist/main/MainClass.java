package com.sist.main;

import com.sist.manager.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("프로그램 시작");
//		try {
//		int a=10/0;
//		}catch(Exception ex) {} // 에러를 무시한다.
//		System.out.println("프로그램 종료");
		
		MusicSystem ms=new MusicSystem();
		for(Music m:ms.getMusics()) // getter
		{
			System.out.println(m.getMno()+"."+m.getTitle());
		}
	}

}
