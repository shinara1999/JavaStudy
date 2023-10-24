package com.sist.seoul;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("명소(1), 자연(2):");
		int rank=scan.nextInt();
		
		SeoulManager sm=new SeoulManager();
		Seoul[] seoul=sm.seoulAllData(rank);
		
		for(Seoul s:seoul)
		{
			System.out.println(s.getRank()+"."+s.getName());
		}
	}

}
