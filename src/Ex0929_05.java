import java.util.Scanner;

public class Ex0929_05 {

	public static void main(String[] args) {
		// Grade 클래스를 만들어서
		// 합계, 평균 2개의 메소드를 만듭니다. 매개변수는 3개
		
		//main메소드에서는 3개의 데이터를 입력받아서
		// 합계호출, 평균호출해서 결과값을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		Grade grade = new Grade();
		Student[] stu = new Student[3];
		
		
		
		
		String[] index = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		
		int num = 1;
		System.out.println("이름을 입력하세요>>");
		String name=scan.next();
		System.out.println("국어점수 입력하세요.>>");
		int kor_score = scan.nextInt();
		System.out.println("영어점수 입력하세요.>>");
		int eng_score = scan.nextInt();
		System.out.println("수학점수 입력하세요.>>");
		int math_score = scan.nextInt();
		int total = grade.total(kor_score,eng_score,math_score);
		double avg=grade.avg(kor_score, eng_score, math_score);
		
		System.out.println("[ 성적처리 프로그램 ]");
		for(int i=0;i<index.length;i++) {
			System.out.print(index[i]+"\t");
		}
		System.out.println();
		
		System.out.print(num+"\t");
		System.out.print(name+"\t");
		System.out.print(kor_score+"\t");
		System.out.print(eng_score+"\t");
		System.out.print(math_score+"\t");
		System.out.print(total+"\t");
		System.out.print(avg+"\t");
		
		
		
		

	}

}
