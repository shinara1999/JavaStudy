package com.sist.main;
class Member{
	// 변수를 은닉화
	private int age;
	private String name;
	
	// getter setter => 마우스 우클릭 > Source > Generate Getters and Setters 선택
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member(); // m(age, name)
		// 값 저장
		m.setAge(20); // m.age
		m.setName("홍길동"); // m.name
		
		System.out.println(m.getAge());
		System.out.println(m.getName());
	}

}
