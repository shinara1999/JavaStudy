package com.sist.lib;

import java.text.MessageFormat;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="조르딕 키르아";
		String sex="남자";
		int age=14;
		String addr="일본";
		String phone="010-0707-0707";
		// INSERT => 문자열 : '' , 정수는 그대로
		String sql="INSER INTO menber VALUES('"+name+"','"+sex+"',"+age+",'"+addr+"','"+phone+"')"; // String은 작은따옴표 안에 들어가야 한다.
		System.out.println(sql);
		
		System.out.println("======== 변환 이용 ========");
		sql="INSERT INTO member VALUES (''{0}'',''{1}'',"+"{2},''{3}'',''{4}'')";
		Object[] obj= {name, sex, age, addr, phone};
		System.out.println(MessageFormat.format(sql, obj));
		// ?, ?, ?, ?, ?
	}	
	// *** DecimalFormat , *** SimpleDateFormat , *** MessageFormat 기억하기
	// 출력 형식으로 변환 => java.text

}
