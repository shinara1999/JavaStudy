package com.sist.manager;

public class Student {
	// default (접근지정어) => 같은 패키지에서는 사용 가능
	// 다른 패키지에서는 사용 불가
	// public => 모든 패키지에서 접근 가능
	// 단점 => 모든 데이터가 노출된다.
	public int hakbun;
	public String name;
	public int kor, eng, mat;

}
