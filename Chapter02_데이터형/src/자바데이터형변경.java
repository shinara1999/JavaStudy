


public class 자바데이터형변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int _int=(int)100.0; // int => 소수점이하를 제거
		// 강제로 형변환 시키는 방법
		System.out.println("_int:"+_int);
		
		byte _byte=(byte)300;
		System.out.println("_byte:"+_byte); // 44
		/*
		 * 		byte 300이 44가 나오는 이유
		 * 
		 * 		256 128 64 32 16 8 4 2 0
		 * 		1    0  0  1  0  1 1 0 0
		 * 		=> byte는 8칸까지만 읽을 수 있으므로 2^7인 128까지만 읽을 수 있다.
		 * 		   (256은 버려진다.)
		 * 		=> 00101100
		 * 		=> 32+8+4 = 44
		 */
		System.out.println(0b00101100);
	}

}
