import java.util.Scanner;

public class StuDeck {

	// 학생성적 입력
	int inputScore(Student[] stu, int count) {
		Scanner scan = new Scanner(System.in);
		int number = 0, kor = 0, eng = 0, math = 0;
		String name = "";

		for (int i = count; i < stu.length; i++) {
			number = i + 1;
			System.out.println("이름을 입력하세요.(이전페이지:0)>>");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다.>>");
				break;
			}
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			stu[i] = new Student(number, name, kor, eng, math);
			count++;
		}

		return count;
	}

	// 학생성적 출력
	void printScore(Student[] stu, int count) {
		// 번호 이름 국어 영어 수학 합계 평균 등수
		System.out.println("----------------------------------------------");
		String[] nameCard = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		System.out.print(nameCard[0] + "\t" + nameCard[1] + "\t" + nameCard[2] + "\t" + nameCard[3] + "\t" + nameCard[4]
				+ "\t" + nameCard[5] + "\t" + nameCard[6] + "\t" + nameCard[7] + "\n");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", stu[i].number, stu[i].name, stu[i].kor, stu[i].eng,
					stu[i].math, stu[i].total, stu[i].avg, stu[i].rank);
		}
		System.out.println("----------------------------------------------");
	}

	// 성적수정
	void modifyScore(Student[] stu, int count) {
		Scanner scan = new Scanner(System.in);
		StuDeck d = new StuDeck();
		String name = "";
		int choice = 0;
		System.out.println("수정하려는 학생의 이름을 입력하세요.>>");
		name = scan.next();
		loop2: for (int i = 0; i < count; i++) {
			if (name.equals(stu[i].name)) {
				modifyPrint(); // 수정하려는 과목 선택 출력
				choice = scan.nextInt();
				switch (choice) {

				case 1:
					System.out.printf("%s의 국어점수 : %d \n", stu[i].name, stu[i].kor);
					System.out.println("수정하고자 하는 국어점수를 입력하세요.>>");
					stu[i].kor = scan.nextInt();
					stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
					stu[i].avg = stu[i].total / 3.0;
					d.printScore(stu, count);
					break loop2;
				case 2:
					System.out.printf("%s의 영어점수 : %d \n", stu[i].name, stu[i].eng);
					System.out.println("수정하고자 하는 국어점수를 입력하세요.>>");
					stu[i].eng = scan.nextInt();
					stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
					stu[i].avg = stu[i].total / 3.0;
					d.printScore(stu, count);
					break loop2;
				case 3:
					System.out.printf("%s의 수학점수 : %d \n", stu[i].name, stu[i].math);
					System.out.println("수정하고자 하는 국어점수를 입력하세요.>>");
					stu[i].math = scan.nextInt();
					stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
					stu[i].avg = stu[i].total / 3.0;
					d.printScore(stu, count);
					break loop2;
				case 0:
					System.out.println("이전화면으로 이동합니다.>>");
					break loop2;
				}

			}

		}

	}

	void modifyPrint() {
		System.out.println("수정하려는 과목을 선택하세요>>");
		System.out.println("----------------------");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		System.out.println("0.이전페이지로 이동");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	// 등수처리
	void rankScore(Student[] stu, int count) {
		StuDeck d = new StuDeck();
		int rank_num = 1;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (stu[i].total < stu[j].total) {
					rank_num++;
				}
			} // for
			stu[i].rank = rank_num;
			rank_num = 1;
		}

		d.printScore(stu, count);
	}
	
	void firstPrint(int count) {
		System.out.println("----------------------");
		System.out.println("         성적처리프로그램");
		System.out.println("----------------------");
		System.out.println("    1.성적입력");
		System.out.println("    2.성적출력");
		System.out.println("    3.성적수정");
		System.out.println("    4.등수처리");
		System.out.println("    0.종료");
		System.out.printf("현재 %d의 학생이 입력되었습니다. \n", count);
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

}// class
