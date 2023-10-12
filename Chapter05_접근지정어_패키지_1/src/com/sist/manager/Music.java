package com.sist.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 캡슐화
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Music {
	private int mno; 
	private String title;
	private String singer;
	private String album;
	private int idcreament;
	private String state;
	// 은닉화 과정 => private : 클라이언트가 볼 수 있게 만들어야 한다.
	// 변수 => 메모리에 저장 / 메모리에서 데이터 읽기
	//		  읽기 / 쓰기 => 기능 추가 ===> getter/setter
	

}
