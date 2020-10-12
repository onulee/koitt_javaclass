import java.util.Scanner;

public class StuDeck {

	// �л����� �Է�
	int inputScore(Student[] stu, int count) {
		Scanner scan = new Scanner(System.in);
		int number = 0, kor = 0, eng = 0, math = 0;
		String name = "";

		for (int i = count; i < stu.length; i++) {
			number = i + 1;
			System.out.println("�̸��� �Է��ϼ���.(����������:0)>>");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("������������ �̵��մϴ�.>>");
				break;
			}
			System.out.println("���������� �Է��ϼ���.>>");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			math = scan.nextInt();
			stu[i] = new Student(number, name, kor, eng, math);
			count++;
		}

		return count;
	}

	// �л����� ���
	void printScore(Student[] stu, int count) {
		// ��ȣ �̸� ���� ���� ���� �հ� ��� ���
		System.out.println("----------------------------------------------");
		String[] nameCard = { "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		System.out.print(nameCard[0] + "\t" + nameCard[1] + "\t" + nameCard[2] + "\t" + nameCard[3] + "\t" + nameCard[4]
				+ "\t" + nameCard[5] + "\t" + nameCard[6] + "\t" + nameCard[7] + "\n");
		System.out.println("----------------------------------------------");
		for (int i = 0; i < count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", stu[i].number, stu[i].name, stu[i].kor, stu[i].eng,
					stu[i].math, stu[i].total, stu[i].avg, stu[i].rank);
		}
		System.out.println("----------------------------------------------");
	}

	// ��������
	void modifyScore(Student[] stu, int count) {
		Scanner scan = new Scanner(System.in);
		StuDeck d = new StuDeck();
		String name = "";
		int choice = 0;
		System.out.println("�����Ϸ��� �л��� �̸��� �Է��ϼ���.>>");
		name = scan.next();
		loop2: for (int i = 0; i < count; i++) {
			if (name.equals(stu[i].name)) {
				modifyPrint(); // �����Ϸ��� ���� ���� ���
				choice = scan.nextInt();
				switch (choice) {

				case 1:
					System.out.printf("%s�� �������� : %d \n", stu[i].name, stu[i].kor);
					System.out.println("�����ϰ��� �ϴ� ���������� �Է��ϼ���.>>");
					stu[i].kor = scan.nextInt();
					stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
					stu[i].avg = stu[i].total / 3.0;
					d.printScore(stu, count);
					break loop2;
				case 2:
					System.out.printf("%s�� �������� : %d \n", stu[i].name, stu[i].eng);
					System.out.println("�����ϰ��� �ϴ� ���������� �Է��ϼ���.>>");
					stu[i].eng = scan.nextInt();
					stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
					stu[i].avg = stu[i].total / 3.0;
					d.printScore(stu, count);
					break loop2;
				case 3:
					System.out.printf("%s�� �������� : %d \n", stu[i].name, stu[i].math);
					System.out.println("�����ϰ��� �ϴ� ���������� �Է��ϼ���.>>");
					stu[i].math = scan.nextInt();
					stu[i].total = stu[i].kor + stu[i].eng + stu[i].math;
					stu[i].avg = stu[i].total / 3.0;
					d.printScore(stu, count);
					break loop2;
				case 0:
					System.out.println("����ȭ������ �̵��մϴ�.>>");
					break loop2;
				}

			}

		}

	}

	void modifyPrint() {
		System.out.println("�����Ϸ��� ������ �����ϼ���>>");
		System.out.println("----------------------");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("0.������������ �̵�");
		System.out.println("----------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
	}

	// ���ó��
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
		System.out.println("         ����ó�����α׷�");
		System.out.println("----------------------");
		System.out.println("    1.�����Է�");
		System.out.println("    2.�������");
		System.out.println("    3.��������");
		System.out.println("    4.���ó��");
		System.out.println("    0.����");
		System.out.printf("���� %d�� �л��� �ԷµǾ����ϴ�. \n", count);
		System.out.println("----------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
	}

}// class
