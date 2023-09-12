/*	
 * 	25page : 관리할 데이터를 저장하는 공간을 변수라고 한다.
 * 
 *		변수 : 변수명 => 소문자로 시작한다. / 한 개만 저장이 가능하다.
 *			 식별자 (명명규칙)
 *				1. 알파벳이나 한글로 시작한다.
 *					---- 대소문자 구분
 *						ABc abc ABC 다 다르다 => 소문자로 통일
 *				2. 명칭의 갯수는 제한하지 않는다.
 *					=> 3~7글자로 압축
 *						a , b , c => kor , math , eng , ave (잘 알아볼 수 있게 명명하는 것이 좋다.)
 *				3. 숫자는 사용이 가능하다
 *					앞에 사용은 불가 
 *					2a (x) a2 (O)
 *				4. 특수문자 사용이 가능하다 ($ , _ 만 가능)
 *					_는 많이 사용된다
 *					file_name , file_count
 *					_name , _count => _가 앞에 붙으면 임시변수를 의미한다.
 *				5. 변수명에는 공백을 줄 수 없다
 *					file name (x)
 *				6. 키워드는 사용할 수 없다.
 *				   ---- 자바에서 사용하는 단어 (빨간색으로 표시되는 단어)
 *					int int (x)
 *
 *		변수를 만드는 방법
 *			1) 선언
 *				데이터형 변수명;
 *				----- -----
 *				 int    a; ==> 4byte 메모리 공간을 만들고 이름을 a로 부여한다
 *			2) 초기값 부여
 *				a=100;
 *		
 *			3) 동시에 처리 => int a=100; (사용빈도가 많다.)
 *
 *			4) 값읽기 / 값변경
 *			   ----------- 읽기(값을 가져오는 과정)/쓰기(저장)/수정
 *
 *	26page
 *		형식)
 *			데이터형 변수명
 *			
 *			정수값을 저장한다 (200)
 *			int num=200;
 *			데이터형 - 변수명 - 리터럴(값자체) - ;
 *
 *			=> 프로그램 개발 : 가독성 , 퍼포먼트(속도)
 *						   ---- 리펙토링
 *				
 *		데이터형의 크기)
 *			long l=100 => 100은 int형이고, long보다 작기 때문에 자동으로 long에 들어간다
 *			왼쪽 > 오른쪽
 *
 *			byte < char < int < long < float < double
 *				   short
 *				   => 메모리 크기(X) => 수표현
 *
 *		각 데이터형 표현법)
 *			byte
 *				byte b=100;
 *				int i = 100; (21억4000만 초과하지 않으면 됨)
 *				long l=100L; long l=200 => 200L로 자동으로 바뀜
 *			char
 *				char c='A' , char c=65
 *			boolean
 *				boolean b=true; b=false;
 *			float
 *				float f=10.5; => 오류 10.5를 double로 인식하게 되는데, f는 d보다 작으므로 오류가 발생하게 된다.
 *					  f=10.5F; 로 표기
 *				double d='A'   d=65.0 => d는 실수형이므로 65.0으로 반환된다.
 *				double d=10    d=10.0
 *				double d=10.5F d=10.5
 *				double d=10L   d=10.0
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte=127;
		int _int=20000;
		long _long=20000; // 20000L
		float _float=10.5f;
		double _double=100; // 100.0 => 자동 형변환
		char _char=65; // 'A' char은 문자가 저장된다.
		boolean _boolean=true;
		
		System.out.println("_byte:"+_byte); // + : 산술, 문자열 결합
		System.out.println("_int:"+_int);
		System.out.println("_long:"+_long);
		System.out.println("_float:"+_float);
		System.out.println("_double:"+_double);
		System.out.println("_char:"+_char);
		System.out.println("_boolean:"+_boolean);
	}

}
