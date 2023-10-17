package com.sist.main2;
import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("홍길동");
		
		// 객체형변환
		String name=(String)list.get(0); // list의 return형은 object이므로 오류 발생 => (String) 형변환 시켜준다.
		
		// or <String> 이용
		List<String> list2=new ArrayList<String>();
		list.add("홍길동");
		
		String name2=list2.get(0);
		// 상위 클래스 리턴 => 반드시 형변환 => 라이브러리
	}

}
