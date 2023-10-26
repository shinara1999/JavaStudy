package com.sist.lib;

import java.util.*;

/*
 		ArrayList
 			= 단방향 포인터 (인덱스)를 가지고 있다.
 				=> 조회하기 편리하다. (성능이 좋다.)
 			= 검색이 빠르다. , 데이터 추가시에 뒤에 추가하면 속도가 빠르다.
 			= 수정 , 중간에 추가 , 삭제 시 속도가 느려진다는 단점이 있다.
 			  ----------------------------------------- 웹에서는 사용하지 않는다.
 			= 수정 , 삭제가 없는 프로그램에서 주로 이용
 		LinkedList
 		Vector
 */
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<Integer>();
		
		/*
		 		List<String> list new List<String>()
		 		List<String> list new ArrayList<String>()
		 		List<String> list new LinkedList<String>()
		 */
		
		// 데이터 추가 => add(Object) => add(Integer)
		// Wrapper => 기본형과 동일하게 사용이 된다.
		// int i=10 , Integer i=10 => 오토박싱
		vec.add(10); // 0
		vec.add(20); // 1
		vec.add(30); // 2
		vec.add(40); // 3
		vec.add(50); // 4
		
		// ==> addElement
		// vec.addElement(60); => 옛날 코드
		
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); // 언박싱
			// elementAt(index)
			System.out.println(i+" => "+k);
		}
		
		// 삭제 remove
		System.out.println("======삭제 후======");
		vec.remove(2);
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i);
			System.out.println(i+" => "+k);
		}
		
		// 수정 set
		System.out.println("======수정 후======");
		vec.set(2, 1000);
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i);
			System.out.println(i+" => "+k);
		}
		
		// 데이터 갯수 size
		System.out.println("======데이터 갯수 확인======");
		System.out.println("총 데이터 갯수:"+vec.size());
		
		// 전체 삭제 clear
		System.out.println("======전체 삭제======");
		vec.clear();
		System.out.println("총 데이터 갯수:"+vec.size());
		
		// isEmpty
		if(vec.isEmpty())
		{
			System.out.println("접속자가 없습니다.");
		}
		else
		{
			System.out.println("접속자가 있습니다.");
		}
	}

}
