import java.util.Scanner;

public class Ex0925_04 {

	public static void main(String[] args) {
		// 학생성적입력 프로그램
		// 1. 성적입력 - 번호,학생이름,국어,영어,수학 -> 합계,평균,등수 0.이전페이지로 이동
		// 2. 성적출력 - 성적이 출력이 되고 -> 다시출력 1, 0.이전페이지 이동
		// 3. 등수입력 - 등수입력되고 -> 다시입력 1, 0.이전페이지 이동
		// 4. 성적수정 - 1번 출력되고 번호를 입력하면 1.국어,2.영어,3.수학 -> 점수입력하세요.>> 계속수정하시겠습니까?1, 0.이전페이지
		// 이동
		// 0. 종료

		// 변수선언
		Scanner scan = new Scanner(System.in);
		int sel_num = 0;
		int count = 0; // 학생입력수
		int rank=1;
		// 번호(int),이름(String),국어,영어,수학,합계,평균(double),등수
		int[][] score = new int[10][6]; // 번호,국어,영어,수학,합계,등수
		String[] name = new String[10]; // 이름
		double[] avg = new double[10];
		String[] index = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

		// 첫 페이지
		loop1: while (true) {
			System.out.println("-------------------------------");
			System.out.println("    학생성적입력 프로그램");
			System.out.println("-------------------------------");
			System.out.println("    1.성적입력");
			System.out.println("    2.성적출력");
			System.out.println("    3.등수입력");
			System.out.println("    4.성적수정");
			System.out.println("    0.종료");
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요>>");
			sel_num = scan.nextInt();

			switch (sel_num) {

			case 1:
				System.out.println("성적입력페이지입니다.");
				while (true) {
					System.out.println("이름을 입력하세요.>>(0.이전페이지 이동)"); // 0
					name[count] = scan.next(); // 0,1,2,3

					if (name[count].equals("0")) {
						break;
					}
					score[count][0] = count + 1; // 번호
					System.out.println("점수를 입력하세요.>>");
					score[count][1] = scan.nextInt(); // 국어
					System.out.println("점수를 입력하세요.>>");
					score[count][2] = scan.nextInt(); // 영어
					System.out.println("점수를 입력하세요.>>");
					score[count][3] = scan.nextInt(); // 수학
					score[count][4] = score[count][1] + score[count][2] + score[count][3];
					avg[count] = score[count][4] / 3.0;

					count++;
				}
				break;
			case 2:
				while (true) {
					System.out.println("성적을 출력하시겠습니까?(1.출력, 0.이전페이지 이동)");
					if (scan.nextInt() == 0) {
						break;
					}
					System.out.println("---------------------");
					System.out.println("   성적출력-프로그램구현           ");
					System.out.println("---------------------");

					// 학생 출력
					for (int i = 0; i < index.length; i++) {
						System.out.print(index[i] + "\t");
					}
					System.out.println();

					for (int i = 0; i < score.length; i++) {
						for (int j = 0; j < score[i].length; j++) {
							// 번호(int),이름(String),국어,영어,수학,합계,평균(double),등수
							if (j == 1) {
								System.out.print(name[i] + "\t");
							}
							if (j == 5) {
								System.out.print(avg[i] + "\t");
							}
							System.out.print(score[i][j] + "\t");
							// 번호(0),이름(1),국어(1),영어(2),수학(3),합계(4),평균(5),등수(5)
						}
						System.out.println();
					}

				}

				break;

			case 3:
				System.out.println("등수입력페이지입니다.");
				// 학생등수입력
				for (int i = 0; i < count; i++) {
					for (int j = 0; j < count; j++) {
						if (score[i][4] < score[j][4]) {
							rank++;
						}
					}
					score[i][5] = rank;
					rank=1;
				}

				break;
			case 4:
				System.out.println("성적수정페이지입니다.");

				break;
			case 0:
				System.out.println("종료페이지입니다.");
				break loop1;

			}// switch

		} // while

	} // main

}// class
