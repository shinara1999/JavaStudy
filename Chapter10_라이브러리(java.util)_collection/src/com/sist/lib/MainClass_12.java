package com.sist.lib;

import java.util.*;

public class MainClass_12 {
	// 제네릭 => 매개변수
	public static void display1(ArrayList<Integer> list) {
		for(int i:list)
		{
			System.out.print(i+" ");
		}
	}
	public static void display2(ArrayList<Double> list) {
		for(double d:list)
		{
			System.out.print(d+" ");
		}
	}
	public static void display3(ArrayList<String> list) {
		for(String s:list)
		{
			System.out.print(s+" ");
		}
	}
	public static void display4(ArrayList<?> list) {
		for(Object s:list)
		{
			System.out.print(s+" ");
		}
	}
	// ArrayList<string>
	public static void display5(ArrayList list) {
		for(Object s:list)
		{
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		display1(list);
		
		//ArrayList<Double list1>
	}

}
