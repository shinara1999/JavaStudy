// 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

public class 자바조건문문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=(char)((Math.random()*26)+65); // 대문자
		char ch2=(char)((Math.random()*26)+97); // 소문자
		
		char ch3=' '; // 변수 초기화(공백)
		
		int temp=(int)(Math.random()*2); // 0 , 1 가위바위보와 같은 원리
										 // 문자로 비교할 수 없으니까 임의의 숫자를 두어 비교한다.
		
		if(temp==0)
		{
			ch3=ch; // temp가 0일 때 ch3는 대문자이다.
			System.out.println(ch3+"은(는) 대문자입니다.");
			
		}
		
		if(temp==1)
		{
			ch3=ch2; // temp가 1일 때 ch3는 소문자이다.
			System.out.println(ch3+"은(는) 소문자입니다.");
		}
		
	}

}
