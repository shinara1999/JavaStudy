package com.sist.lib;

import java.util.*;

public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"박문대", "선아현", "김래빈", "차유진", "배세진", "신청려", "이세진", "류청우", "박문대", "김래빈"};
		
		// 배열을 컬렉션으로 변경
		List<String> list=Arrays.asList(names);
		
		// 출력
		for(String name:list)
		{
			System.out.println(name); //중복이 그대로 출력된다.
		}
		
		// 중복 제거
		Set<String> set=new HashSet();
		set.addAll(list); // 데이터값을 저장했을 때 addAll을 이용하면 전체를 다 대입할 수 있다.
		
		// 중복된 데이터는 set에 저장되지 않는다. => 중복제거됨
		System.out.println("====== 중복 제거 ======");
		for(String name:set)
		{
			System.out.println(name);
		}
		
		// 원상복구
		System.out.println("====== 원상 복구 ======");
		List<String> list2=new ArrayList<String>();
		list2.addAll(set);
		for(String name:list2)
		{
			System.out.println(name);
		}
	}

}










