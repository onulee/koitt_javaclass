import java.util.Scanner;

public class Ex0925_05 {

	public static void main(String[] args) {
		// ��ȣ(int),�̸�(String),����,����,����,�հ�,���(double),���
		// 3���� �Է¹޾Ƽ� ����� �Ͻÿ�.

		// ��������
		Scanner scan = new Scanner(System.in);
		int sel_num = 0;
		// ��ȣ(int),�̸�(String),����,����,����,�հ�,���(double),���
		int[][] score = new int[10][6]; // ��ȣ,����,����,����,�հ�,���
		String[] name = new String[10]; // �̸�
		double[] avg = new double[10];
		String[] index = { "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		int count = 0;
		int rank = 1;

		// 3���� �л����� �Է�
		while (count < 3) {
			System.out.println("�̸��� �Է��ϼ���.>>");
			name[count] = scan.next();

			score[count][0] = count + 1; // ��ȣ
			System.out.println("������ �Է��ϼ���.>>");
			score[count][1] = scan.nextInt(); // ����
			System.out.println("������ �Է��ϼ���.>>");
			score[count][2] = scan.nextInt(); // ����
			System.out.println("������ �Է��ϼ���.>>");
			score[count][3] = scan.nextInt(); // ����
			score[count][4] = score[count][1] + score[count][2] + score[count][3];
			avg[count] = score[count][4] / 3.0;

			count++;

		}

		// �л�����Է�
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (score[i][4] < score[j][4]) {
					rank++;
				}
			}
			score[i][5] = rank;
			rank=1;
		}

		// �л� ���
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// ��ȣ(int),�̸�(String),����,����,����,�հ�,���(double),���
				if (j == 1) {
					System.out.print(name[i] + "\t");
				}
				if (j == 5) {
					System.out.print(avg[i] + "\t");
				}
				System.out.print(score[i][j] + "\t");
				// ��ȣ(0),�̸�(1),����(1),����(2),����(3),�հ�(4),���(5),���(5)
			}
			System.out.println();
		}

	}

}
