// 중복없는 난수 발생
// => 예약일 , 예약시간...

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10]; // 1~10 중복 없이
		
		int su=0; // 난수 저장 변수
		boolean bCheck=false; // 중복 여부 확인
		
		for(int i=0;i<arr.length;i++)
		{
			bCheck=true;
			// --------------------------------- 난수발생
			// bCheck=true : 난수 중복이므로 다시 돌리기 , bCheck=false면 중복 아니므로 종료 후 arr에 저장
			while(bCheck)
			{
				// 난수 발생
				su=(int)(Math.random()*10)+1;
				bCheck=false; // 빠져나가는 조건을 선언 후 진행해야 한다.
				//비교 => arr에 저장된 값과 su가 같은게 있는지 확인
				for(int j=0;j<i;j++)
				{
					// i=저장된 갯수
					if(arr[j]==su) // 같은 수가 있는지 확인
					{
						bCheck=true; // 중복이므로 while문을 다시 돌린다는 뜻
						break;
					}
					
				}
			}
			// ----------------------------------
			arr[i]=su;
		}
		
		// 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
