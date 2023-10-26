package com.sist.lib;
import java.util.*;
public class MainClass_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 20, 30, 50, 40, 70, 60, 10, 20, 40};
		Set<Integer> set=new HashSet<Integer>(); // 중복된 숫자를 없앨 수 있다.
		for(int a:arr)
		{
			set.add(a);
		}
		System.out.println(set);
		
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);
		System.out.println(list);
		System.out.println("===== 정렬 (ASC) =====");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("===== 정렬 (DESC) =====");
		Collections.reverse(list);
		System.out.println(list);
		
		// ArrayList<?> list=new ArrayList<String>();
		
	}

}
