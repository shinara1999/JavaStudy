package com.sist.lib;

import java.util.StringTokenizer;

/*
 		StringTokenizer
 */
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="red|green|blue|black|pink|white|yellow|cyan|magenta";
		
		StringTokenizer st=new StringTokenizer(data, "|");
		
		System.out.println("컬러 갯수:"+st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		/*
		 		hasMoreoTokens
		 		1) cursor
		 		------------------------------------
		 			=> before First
		 		------------------------------------
		 			red => st.nextToken() ==> true
		 		------------------------------------
		 			blue => st.nextToken() ==> true
		 		------------------------------------
		 			green => st.nextToken() ==> true
		 		------------------------------------
		 */	
			
	}

}
