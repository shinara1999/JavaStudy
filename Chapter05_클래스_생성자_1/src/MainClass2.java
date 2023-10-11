import java.util.*;
class Student{
	// heap (프로그램 종료시까지 메모리 유지) => 다른 클래스에서 사용 가능
	String name;
	int kor, eng, mat;
	
	// 매개변수 / 지역변수 => stack
	Student(String name, int kor, int eng, int mat) 
	{
		// 매개변수 / 지역변수 => 메소드 안에서만 사용 가능 => 자동 메모리 삭제
		this.name=name; // heap의 this에 stack의 this를 저장해라.
		// name=name; 이라고 하면 같은 stack끼리 저장하는 것이기 때문에 X
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		
		// 지역변수, 매개변수 => 멤버변수에서 찾는다.
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			System.out.print((i+1)+"번째 이름 입력:");
			String name=scan.next();
			
			System.out.print((i+1)+"번째 국어 점수 입력:");
			int kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 점수 입력:");
			int eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 점수 입력:");
			int mat=scan.nextInt();
			
			std[i]=new Student(name, kor, eng, mat);
		}
//		ArrayList<Student> list=new ArrayList<Student>(); => 컬랙션
//		list.add(new Student("", 0, 0, 0));
		
		// 출력
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n", std[i].name, std[i].kor, std[i].eng, std[i].mat, (std[i].kor+std[i].eng+std[i].mat),
					(std[i].kor+std[i].eng+std[i].mat)/3.0);
		}

	}

}
