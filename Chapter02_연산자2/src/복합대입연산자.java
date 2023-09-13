// 41page => 증감 (원하는 갯수만큼 증감할 수 있다.) => 복합 대입 연산자
/*
 * 		op=
 * 		+=
 * 		-=
 * 		------ 위 2개만 중심으로 보면 된다.
 * 		*=
 * 		/=
 * 		&=
 * 		^=
 * 		|=
 * 		>>=
 * 		<<=
 * 
 * 		한개 증가
 * 		------
 * 		int a=10;
 * 		a++ , ++a , a=a+1 ==> a+=1
 * 		------
 * 		두개 증가
 * 		a++;
 * 		a++;
 * 		
 * 		a=a+2 ==> a+=2
 * 
 * 		a-- , --a
 * 		a=a-1 , a-=1 ==> 문자열 누적 , 숫자 누적시에 주로 사용
 */
public class 복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		// a를 100 증가하여라
		a+=100;	
		System.out.println(a);
		
		// a를 50 감소하여라
		a-=50;
		System.out.println(a);
		
		/*
		 *		변수 수정
		 *		int a=10;
		 *		a=50; => 데이터형을 다시 선언하면 오류가 발생하므로 쓰지 않는다.
		 */
	}

}
