// 1학년부터 4학년까지 중간고사 시험을 보았다. 
// 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
// 이를 판단하는 프로그램을 작성해보자.
// 점수가 0미만 100초과이면 경고문구 출력!

// 중첩 if문: true/false의 큰 틀을 잡고 그 다음 if문을 작성한다.
import java.util.Scanner;
public class 자바조건문문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.print("1~4학년 중 한개를 입력하시오:");
		int grade=scan.nextInt();
		
		System.out.print("점수를 입력하시오:");
		int score=scan.nextInt();
		
		if(score>=0 && score<=100) // 정상 입력
		{	
			if(grade==4)
			{
				if(score>=70)
					System.out.println("합격입니다.");
				if(score<70)
					System.out.println("불합격입니다.");
			}
		
			if(grade<4)
			{
				if(score>=60)
					System.out.println("합격입니다.");
				if(score<60)
					System.out.println("불합격입니다.");
			}
		}
		
		if(score<0 || score>100) // 잘못된 입력
		{
			System.out.println("점수를 다시 입력하십시오!!");
		}
		
		scan.close();

	}

}
