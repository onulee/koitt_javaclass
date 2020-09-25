import java.util.Scanner;

public class Ex0925_05 {

	public static void main(String[] args) {
		// 번호(int),이름(String),국어,영어,수학,합계,평균(double),등수
		// 3명의 입력받아서 출력을 하시오.

		// 변수선언
		Scanner scan = new Scanner(System.in);
		int sel_num = 0;
		// 번호(int),이름(String),국어,영어,수학,합계,평균(double),등수
		int[][] score = new int[10][6]; // 번호,국어,영어,수학,합계,등수
		String[] name = new String[10]; // 이름
		double[] avg = new double[10];
		String[] index = { "번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int count = 0;
		int rank = 1;

		// 3명의 학생성적 입력
		while (count < 3) {
			System.out.println("이름을 입력하세요.>>");
			name[count] = scan.next();

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

}
