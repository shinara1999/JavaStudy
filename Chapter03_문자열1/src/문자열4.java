// charAt...
// 대문자 / 소문자 변경
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		// 대문자 변환
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.print((char)(c-32)); // 대소문자 차이가 32이다.
		}
		
		System.out.println(s.toUpperCase()); // 훨씬 간단
		
		s="ABCDEFG";
		// 소문자 변환
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			System.out.print((char)(c+32)); // 대소문자 차이가 32이다.
		}
		
		System.out.println(s.toLowerCase()); // 훨씬 간단
		

	}

}
