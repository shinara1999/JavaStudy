// <<= , >>=   쉬프트연산자 (비트이동연산자)

/*
 * 		<< : 비트를 왼쪽으로 이동
 * 		>> : 비트를 오른쪽으로 이동
 * 
 * 		27<<3
 * 		----- 27을 3만큼 이동한다.
 * 
 * 		int a=27;
 * 		a=a<<3 ==> a<<=3
 * 		----------------
 * 		16+8+(4)+2+1
 * 		11011 (2진법)
 * 		왼쪽으로 3칸 이동 ==> 11011000
 * 						128+64+16+8 ==> 216
 * 
 * 		a>>=3
 * 		11011
 * 		오른쪽으로 3칸 이동 ==> 11
 * 						  2+1 ==> 3
 */
public class 복합대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=27;
		a<<=3;
		System.out.println("a="+a);
		
		a=27;
		a>>=3;
		System.out.println("a="+a);
		
		// a=33 ==> 왼쪽으로 2 이동, 오른쪽으로 2 이동
		
		a=33;
		a<<=2;
		System.out.println("a="+a);
		
		a=33;
		a>>=2;
		System.out.println("a="+a);
	}

}
