import java.util.Scanner;

public class Ex0925_04 {

	public static void main(String[] args) {
		// �л������Է� ���α׷�
		// 1. �����Է� - ��ȣ,�л��̸�,����,����,���� -> �հ�,���,��� 0.������������ �̵�
		// 2. ������� - ������ ����� �ǰ� -> �ٽ���� 1, 0.���������� �̵�
		// 3. ����Է� - ����Էµǰ� -> �ٽ��Է� 1, 0.���������� �̵�
		// 4. �������� - 1�� ��µǰ� ��ȣ�� �Է��ϸ� 1.����,2.����,3.���� -> �����Է��ϼ���.>> ��Ӽ����Ͻðڽ��ϱ�?1, 0.����������
		// �̵�
		// 0. ����

		// ��������
		Scanner scan = new Scanner(System.in);
		int sel_num = 0;
		int count = 0; // �л��Է¼�
		int rank=1;
		// ��ȣ(int),�̸�(String),����,����,����,�հ�,���(double),���
		int[][] score = new int[10][6]; // ��ȣ,����,����,����,�հ�,���
		String[] name = new String[10]; // �̸�
		double[] avg = new double[10];
		String[] index = { "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���", "���" };

		// ù ������
		loop1: while (true) {
			System.out.println("-------------------------------");
			System.out.println("    �л������Է� ���α׷�");
			System.out.println("-------------------------------");
			System.out.println("    1.�����Է�");
			System.out.println("    2.�������");
			System.out.println("    3.����Է�");
			System.out.println("    4.��������");
			System.out.println("    0.����");
			System.out.println("-------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>");
			sel_num = scan.nextInt();

			switch (sel_num) {

			case 1:
				System.out.println("�����Է��������Դϴ�.");
				while (true) {
					System.out.println("�̸��� �Է��ϼ���.>>(0.���������� �̵�)"); // 0
					name[count] = scan.next(); // 0,1,2,3

					if (name[count].equals("0")) {
						break;
					}
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
				break;
			case 2:
				while (true) {
					System.out.println("������ ����Ͻðڽ��ϱ�?(1.���, 0.���������� �̵�)");
					if (scan.nextInt() == 0) {
						break;
					}
					System.out.println("---------------------");
					System.out.println("   �������-���α׷�����           ");
					System.out.println("---------------------");

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

				break;

			case 3:
				System.out.println("����Է��������Դϴ�.");
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

				break;
			case 4:
				System.out.println("���������������Դϴ�.");

				break;
			case 0:
				System.out.println("�����������Դϴ�.");
				break loop1;

			}// switch

		} // while

	} // main

}// class
