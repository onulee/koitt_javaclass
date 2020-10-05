import java.util.Scanner;

public class Ex1005_02 {

	public static void main(String[] args) {
		// 학생 5명의 데이터 값 입력
		// 1,2,3,4,5
		// 국어점수 95,96,97..100
		// 영어점수 동일
		// 평균과 합계 자동 계산 입력
		// 출력
		// 번호  이름   국어  영어    평균        합계
		// 01  홍길동  95  95  95.00  190
		// 02  유관순  96  96  96.00  192
		
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[5];
		String[] n = {"홍길동","유관순","이순신","김구","김유신"};
		
		for(int i=0;i<stu.length;i++) {
			stu[i] = new Student();
			System.out.println("번호를 입력하세요.>>");
			stu[i].number = scan.nextInt();
			System.out.println("이름을 입력하세요.>>");
			stu[i].name = scan.next();
			System.out.println("국어점수를 입력하세요.>>");
			stu[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			stu[i].eng = scan.nextInt();
			stu[i].total = stu[i].kor + stu[i].eng;
			stu[i].avg = stu[i].total/2.0;
			
		}
		
		for(int i=0;i<stu.length;i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %.2f \n",stu[i].number,stu[i].name,stu[i].kor,stu[i].eng,stu[i].total,stu[i].avg);
		}
		
		
		
		
		

	}

}
