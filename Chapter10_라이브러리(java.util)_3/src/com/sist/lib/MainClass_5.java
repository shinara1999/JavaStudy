package com.sist.lib;
// => 메소드 (340 page)
// => 검색 => 

import java.util.*;

public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(); // list에는 정수값만 모을 수 있다.
		
		// 정수만 메모리에 저장해서 관리
		/*
		 		Wrapper => 기본형을 클래스형
		 				   => 기능을 부여
		 				   => 제네릭을 사용할 수 있게 한다.
		 			=> 장점은 Wrapper클래스와 기본형 호환
		 			Integer => 10, 20, 30...
		 			Integer i=10; ==> int
		 */
		
		// 추가 => add()
		list.add(Integer.valueOf(10)); // 굳이 Integer.valueOf()를 사용하지 않아도 된다.
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		// 인덱스는 add한 순서대로 부여된다. 추가할 때마다 메모리 자동 증가
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // 형변환이 필요 없어진다.
			System.out.println(i+":"+val);
		}
		
		System.out.println("===== 추가 =====");
		list.add(3, 60); // 가급적 사용하지 않는것을 권장한다. => 속도가 느려지기 때문
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);
			System.out.println(i+":"+val); // 하나씩 뒤로 밀린다.
		}
		
		System.out.println("===== 삭제 =====");
		list.remove(3);
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);
			System.out.println(i+":"+val); // 하나씩 앞으로 당겨진다.
		}
		// 인덱스 번호는 0번 ==> size() : 갯수 i<list.size()
		// 인덱ㅅ를 초과하면 오류 발생
		
		// for-each
		System.out.println("===== for-each =====");
		for(int i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("===== 저장 갯수 =====");
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty()); // 데이터가 없냐고 물어본 것 => false
		// 라이브러리 중 isXxx() 메소드는 => boolean 반환
		// setXxx() => void
		
		System.out.println("===== 삭제 =====");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty()); // true
	}

}
