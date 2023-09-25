/*
 * 	page86
 * 		1. new => 메모리 확보
 * 				  -------- 메모리 크기
 * 					ㅣ
 * 				  메모리 주소를 전송
 * 				  => new를 사용할때마다 메모리 주소가 달라진다.
 * 
 * 		   예) int[] arr=new int[5]; : new를 이용하면 자동초기화(0값)
 * 			   arr이라는 이름에 5개의 자리를 만들어준다.
 * 
 * 			메모리 주소를 이용해서 데이터를 제어 ==> 참조변수
 * 											 ------
 * 												1. 배열
 * 												2. 클래스
 * 			=> 데이터형의 형변환
 * 			   double[] arr={10, 20, 'A', 'B', 30}
 * 				=> arr[0]=10.0
 * 				   arr[1]=20.0
 *  			   arr[2]=65.0
 *   			   arr[3]=66.0
 *    			   arr[4]=30.0
 *    		   int[] arr={10.0, 20, 'A', 'B', 30} => 오류 발생 (큰데이터만 가능)
 *    		   boolean[] arr={true, false, true...}
 *    
 *    		   데이터형[] 배열명;
 *    					---- 참조변수
 *    		   => 전체 크기 (저장된 갯수) => length
 *    		   => 데이터형[] 배열명=new 데이터형[]; => 오류 발생
 *    						    		  --- 여기에 배열의 크기를 줘야 오류가 발생하지 않는다.
 *  page92   		   => 배열 복사
 *    			  얕은 복사 : 참조(공유)
 *    			  깊은 복사 : 새로운 배열을 만든다.
 *    
 *    		   int a=10;
 *    		   int b=a;
 * 				
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 얕은복사 => Call By Reference
		// 저장된 주소값이 같은 경우 같은 메모리를 제어한다.
		int[] arr=new int[5];
		// 0으로 초기화 => 연속적인 메모리구조
		/*
		 * 		arr[0] => 일반 변수와 동일
		 */
		
		// 배열이타 클래스인 경우 같은 주소를 가지고 있으면 같은 메모리 제어 => 얕은복사
		// 메모리 주소가 다른 경우 따로 제어
		int[] arr2=arr;
		
		System.out.println("arr="+arr);
		System.out.println("arr2="+arr2);
		arr[0]=100;
		arr[1]=200;
		
		System.out.println("arr2=>"+arr2[0]);
		System.out.println("arr2=>"+arr2[1]);

		// 깊은복사 => Call By Value
		

	}

}
