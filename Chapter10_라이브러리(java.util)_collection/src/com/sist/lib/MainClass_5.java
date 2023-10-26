package com.sist.lib;

// 객체 중복 제거 => 객체 비교는 극히 드물다.

import java.util.*;

class Student
{
	private String name;
	private int age;
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode(); // 같은 경우에는 주소값이 같다.
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 객체 비교 => instanceof
		if(obj instanceof Student) // 객체와 객체가 같은 값을 가지고 있는지
		{
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}
	// 생성자
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
}
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet();
		Student s1=new Student("주찬양", 18);
		Student s2=new Student("주찬양", 18);
		
		s1.setName("최종수"); // s1의 값 변경
		s1.setAge(19);
		
		System.out.println("s2.name:"+s2.getName());
		System.out.println("s2.age:"+s2.getAge());
		
//		if(s1.equals(s2))
//		{
//			System.out.println(s1+"=="+s2);
//		}
//		else
//		{
//			System.out.println(s1+"!="+s2);
//		}
		
		set.add(s1);
		set.add(s2);
		System.out.println(set); // 메모리주소가 중복이 되었기 때문에 하나는 제거하고 하나만 출력한다.
	}

}










