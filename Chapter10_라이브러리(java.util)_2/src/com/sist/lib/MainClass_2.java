package com.sist.lib;

import java.text.*;
import java.util.*;

// 날짜변환
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 시스템의 시간을 읽어온다.
		// Date
		Date date=new Date();
		System.out.println(date); // 데이터베이스 호환 (오라클 연결)
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		/*
		 		년도 : y => yyy => yy => yyyy
		 		월 : M (1월) => MM (01월)
		 		일 : d (8일) => dd (08일)
		 		시간 : h => hh
		 		분 : m => mm
		 		초 : s => ss
		 */
		System.out.println(sdf.format(date));
	}

}
