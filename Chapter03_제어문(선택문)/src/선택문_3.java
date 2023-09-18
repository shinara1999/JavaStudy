// 12 1 2 겨울 3 4 5 봄 6 7 8 여름 9 10 11 가을
/*
 * 		case값이 동일할 수 없다
 * 		case값에 실수를 사용할 수 없다
 * 		case값:
 * 		case문장을 수행하고 종료시에는 반드시 break
 * 		case에 사용하는 순서는 상관이 없다 (but 차례대로 쓰는것을 권장)
 * 
 * 		switch(정수)
 * 		{
 * 			default:  ===> default가 먼저 와도 됨.
 * 				break;
 * 			case3:
 * 			case2:
 * 				break;
 * 		}
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=(int)(Math.random()*12)+1; //1~12
		System.out.println("입력된 달:"+month);
		
		switch(month) // if(month==12 || month==1 || month==2) 와 같다.
		{
		case 12:
		case 1:
		case 2:
			System.out.println(month+"월은 겨울");
			break;
			
		case 3:case 4:case 5: // 이렇게 연결해서 작성도 가능
			System.out.println(month+"월은 봄");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println(month+"월은 여름");
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println(month+"월은 가을");
			break;
		}

	}

}
