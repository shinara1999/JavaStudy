package com.sist.lib;
/*
 		컬렉션 프레임워크
 			= 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 			  ----------							   -----
 			  클래스의 집합 (자바에서 지원하는 라이브러리 => 사용법)
 			= 데이터 수정, 삭제, 추가, 읽기 => CRUD (자료구조)
 			= 배열의 단점을 보완 => 고정적(정적) => 추가, 삭제가 어렵다.
 				=> 동적 메모리 할당 (가변)
 				   필요시마다 추가, 삭제가 편리하다.
 			= 단점 : 모든 데이터형을 저장할 수 있디. (Object)
 			= 기본적으로 데이터를 관리할 때 생각해봐야 할 것
 			  -------------------> 같은 데이터형을 모아서 처리
 	
 		제네릭 : 데이터형을 통일화
 			   --------------
 			   	기존에 만들어진 메소드에 리턴형 , 매개변수를 변경
 			   	*** 데이터를 저장할 때 한가지 데이터형만 사용이 가능하게 만들어서 사용
 			   	*** 소스가 간결하다. , 가독성이 좋다.
 			   		--------	    ----
 			   		 ㅣ 형변환 없이 사용  ㅣ 어떤 데이터가 첨부되어 있는 지 확인 가능
 			    *** 컬렉션에서 사용
 			    => 사용법 => 클래스 뒤에 <>
 			       <> => 클래스만 사용 (기본형은 사용이 불가능 => Wrapper
 			       ArrayList<Integer>
 			       ArrayList<Music> ...
 			   => T , E , K , V
 			   	  T => <type> => 클래스 (type => 클래스 등록)
 			   	  	   => mybatis => type
 			   	  	   => spring => class
 			   	  E => elements => 클래스
 			   	  K => key
 			   	  V => value
 			   	  ArrayList<E>
 			   	  Set<E>
 			   	  Map<K,V>
 			   예)
 			   	  class Box<T>
 			   	  {
 			   	  		T t;
 			   	  		public void setT(T t)
 			   	  		{
 			   	  			this.t=t;
 			   	  		}
 			   	  		public T getT()
 			   	  		{
 			   	  			return t;
 			   	  		}
 			   	  }
 			   	  
 			   	  Box box=new Box() ==> T (Object)
 			   	  Box<Integer> box=new Box<Integer>();
 			   	  		=> T (Integer)
 			   	  
 		클래스의 종류
 		=> List
 		   순서가 존재 (자동으로 인덱스 번호 부여)
 		   데이터 중복 허용
 		   => 가장 많이 사용되는 컬렉션
 		   => 구현하는 클래스
 		     -------
 		      ㅣ ArrayList , Vector , LinkedList
 		   => ArrayList
 		   		: 비동기방식 => 접근 속도가 빠르다. => 데이터베이스에서 데이터 읽기
 		   					 --------------- 	---------- 웹 핵심
 		   		  => 단점 : 추가 , 삭제 시 속도가 늦다.
 		   		  		   --------- 오라클에서 주로 하는 일
 		   		  => 읽기 / 데이터 모아서 전송
 		   		  	 => 마이바티스 : 리턴형 List
 		   		  => Vector의 단점 보완
 		   		  
 		   => Vector : 동기방식 => 네트워크 (접속자의 정보 저장)
 		   => LinkedList : 접근 속도가 늦다. , 추가/삭제가 빠르다.
 		   	  ---------- 자체 처리 (Application)
 		 --------------- List 라는 인터페이스 이용 모든 메소드 동일
 		 --------------- java.util => 사용시에는 반드시 import를 이용한다.
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<String> list=new ArrayList<String>();
		List<String> list=new Vector<String>(); // => 위에것보다 이걸 주로 사용한다.
		
		// 가변이기 때문에 메모리 저장 크기를 지정하지 않는다. (저장된 데이터만큼만 메모리가 할당된다.)
		// 배열은 사용하지 않는 공간이 있는 경우 메모리 누수현상이 발생한다.
		// => 추가 => add(Object) => add(String)
		list.add("사과"); // 0번지 => 추가되는 순서대로 인덱스 번호를 갖는다.
		list.add("귤");	 // 1
		list.add("포도"); // 2
		list.add("감");  // 3
		list.add("딸기"); // 4 => 삭제 시 자동으로 위로 당겨진다.
		// 인덱스 번호가 자동으로 변경 ...
		// 추가시에는 마지막에 추가 , 가급적이면 삭제는 하지 않는다.
		// 데이터 읽기 => 출력 => size() , get(index)
		for(int i=0;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		// 삭제 remove(index) => 데이터(중복허용한다.)
		System.out.println("=======삭제 후=======");	
		list.remove(1);
		for(int i=0;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		// 수정 => set(index, 데이터)
		System.out.println("=======수정 후=======");
		list.set(1, "샤인머스켓");
		for(int i=0;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		// 저장갯수 => size
		System.out.println("=======저장갯수=======");
		System.out.println("과일 갯수:"+list.size()+"개");
		
		// 전체삭제 (데이터 비우기) => clear
		System.out.println("=======전체삭제=======");
		list.clear();
		System.out.println("과일 갯수:"+list.size()+"개");
		
		// isEmpty => 검색 시 사용
		System.out.println("=======데이터 존재여부 확인=======");
		if(list.isEmpty())	
		{
			System.out.println("장바구니가 비워져 있습니다.");
		}
		else
		{
			System.out.println("장바구니에 선택된 데이터가 있습니다.");
		}
	}

}










