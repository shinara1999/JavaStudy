package com.sist.lib;
// 검색
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int k=r.nextInt(100)+1;
			set.add(k);
		}
		System.out.println(set);
		
		// ------------------------------------------
		// 50보다 작은수
		for(int i:set)
		{
			if(i<50)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println("\n");
		// 50보다 큰 수
		for(int i:set)
		{
			if(i>50)
			{
				System.out.print(i+" ");
			}
		}
		// ------------------------------------------ => 잘 사용하지 않는다.
		
		// 아래 사용 권장 (더 편리하다.) => 정렬 / 검색이 빠르다.
		System.out.println("\n");
		TreeSet<Integer> tSet=new TreeSet<Integer>(); // 자동정렬이 가능하다.
		tSet.addAll(set);
		System.out.println("=========== tSet ===========");
		System.out.println(tSet);
		
		System.out.println("50보다 작은 수:"+tSet.headSet(50));
		System.out.println("50보다 큰 수:"+tSet.tailSet(50));
	}

}
