/*
 * 		split 의 결과값 => String[] (잘라서 배열에 저장)
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String actor="강동원,허준호,이솜,이동휘,김종수,박소이";
//		String[] movie=actor.split(",");
//		System.out.println(movie[0]);
//		System.out.println(movie[1]);
//		System.out.println(movie[2]);
//		System.out.println(movie[3]);
//		System.out.println(movie[4]);
//		System.out.println(movie[5]);
		
//		String actor="강동원|허준호|이솜|이동휘|김종수|박소이";
//		String[] movie=actor.split("\\|"); // |는 읽을려면 \\를 붙여야 한다.
//		System.out.println(movie[0]);
		
		String name="                        Hello Java ";
		System.out.println(name.trim()); // trim() : 좌우의 공백 제거 (중간은 제거X)
		
		/*
		 * 		replace => 원하는 문자 변경
		 * 
		 * 		문자 , 문자열 모두 가능하다.
		 */
		String s="Hello Java";
		System.out.println(s.replace('a', 'b')); // 앞에있는 문자를 뒤에있는 문자로 바꿔라.
		System.out.println(s.replace("Java", "Oracle")); // 앞에있는 문자열을 뒤에있는 문자열로 바꿔라.
		System.out.println(s); // 대입을 하지 않으면 s자체는 바뀌지 않는다.
		
		/*
		 * 		문자열 결합
		 */
		String msg="귀신을 믿지 않는 가짜 퇴마사!";
		if(msg.length()>10)
		{
			msg=msg.substring(0, 10)+"...";
			// msg=msg.substring(0, 10).concat("..."); => concat보다는 +를 주로 사용하므로 기억 안해도 된다.
		}
		System.out.println(msg);
	}

}
