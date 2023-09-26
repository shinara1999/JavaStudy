// substring() : 문자를 자른다
/*
 * 		"Hello Java"
 * 		 0123456789
 * 		 
 * 		 중간에서 자를수도 있고, 원하는 위치에서도 자를 수 있다.
 * 
 * 		 substring(6) => 해당 번호부터 마지막까지 출력 => Java
 * 		 substring(0, 5) => 마지막 번호는 제외 => Hello
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		
		String s1=s.substring(0, 5);
		System.out.println(s1);
		
		String s2=s.substring(4);
		System.out.println(s2);
		
		String address="서울특별시 용산구 이태원로 254 B2 지번 서울시 용산구 한남동 683-130 B2";
		String address2=address.substring(0, address.indexOf("지번")); // indexOf() 사용
		System.out.println(address2);
		
		String address3=address.substring(address.indexOf("지번")+3);
		System.out.println(address3);
		
		String address4=address.substring(address.indexOf("한남동"), address.indexOf("683")-1);
		System.out.println(address4);
		
		String address5=address.substring(address.lastIndexOf(" ")); // 마지막 공백부터 자르기
		System.out.println(address5);
		
		String ext="Hello.Java.java";
		// 첫번째 점의 위치는 indexOf , 두번째 점의 위치는 lastIndexOf 사용
		String ss=ext.substring(ext.lastIndexOf(".")+1); // 마지막 . 다음부터 자르기
		System.out.println(ss);
		

	}

}
