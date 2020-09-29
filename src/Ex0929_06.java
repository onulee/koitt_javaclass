import java.util.Scanner;

public class Ex0929_06 {

	public static void main(String[] args) {
		// Grade 클래스를 만들어서
		// 합계, 평균 2개의 메소드를 만듭니다. 매개변수는 3개
		// Student 클래스 3명의 학생만들어서 국어,영어,수학
		// main메소드에서는 3개의 데이터를 입력받아서
		// 합계호출, 평균호출해서 결과값을 출력하시오.
		//선언부
		Scanner scan = new Scanner(System.in);
		Grade grade = new Grade();
		Student[] stu = new Student[3];
		String[] index = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int count=1;
		
		// Student객체선언
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
		}

		// Student객체 데이터 입력
		for(int i=0;i<stu.length;i++) {
			stu[i].number = i+1;
			System.out.println("이름을 입력하세요>>");
			stu[i].name = scan.next();
			System.out.println("국어점수 입력하세요.>>");
			stu[i].kor_score = scan.nextInt();
			System.out.println("영어점수 입력하세요.>>");
			stu[i].eng_score = scan.nextInt();
			System.out.println("수학점수 입력하세요.>>");
			stu[i].math_score = scan.nextInt();
			stu[i].total = grade.total(stu[i].kor_score, stu[i].eng_score, stu[i].math_score);
			stu[i].avg = grade.avg(stu[i].kor_score, stu[i].eng_score, stu[i].math_score);
		}
		
		//등수처리
		for (int i = 0; i < stu.length; i++) {
			for(int j=0;j<stu.length;j++) {
				if(stu[i].total<stu[j].total) {
					count++;
				}
			}
			stu[i].rank=count;
			count=1;
		}
		
		//출력
		System.out.println("[ 성적처리 프로그램 ]");
		for(int i=0;i<index.length;i++) {
			System.out.print(index[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].number+"\t");
			System.out.print(stu[i].name+"\t");
			System.out.print(stu[i].kor_score+"\t");
			System.out.print(stu[i].eng_score+"\t");
			System.out.print(stu[i].math_score+"\t");
			System.out.print(stu[i].total+"\t");
			System.out.print(stu[i].avg+"\t");
			System.out.print(stu[i].rank+"\t");
		    System.out.println();
		}


	}

}
