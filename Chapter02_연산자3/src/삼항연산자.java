// if~else
// (조건)?값1:값2
// 조건 : true => 값1
// 조건 : false => 값2
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; // 1~100
		// Random r=new Random() r.next(100) => 라이브러리 추후 배울 예정.
		System.out.println(a%2==0?a+"는(은) 짝수다":a+"는(은) 홀수다");
		//                -------?--------------:----------------
		//                 나머지:0      값1              값2
		
		char ch='a';
		char c=(char)((Math.random()*26)+65); // A~Z 사이의 대문자
		int s=(int)(Math.random()*2); // 0,1
		ch=s==0?c:(char)(c+32); // 대소문자는 32차이가 나기 때문에 +32를 하면 소문자로 바뀐다.
		System.out.println(ch>='A' && ch<='Z'?ch+"는(은) 대문자입니다":ch+"는(은) 소문자입니다");

	}

}
