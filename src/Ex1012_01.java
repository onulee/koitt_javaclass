import java.util.Scanner;

public class Ex1012_01 {

	public static void main(String[] args) {

		// ����
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0;
		Student[] stu = new Student[5];
		StuDeck d = new StuDeck();
		// �޴��ݺ�
		loop1: while (true) {
			d.firstPrint(count); // �޴���¸޼ҵ�
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				count = d.inputScore(stu, count); // �л����� �Է�
				break;
			case 2:
				d.printScore(stu, count); // �л����� ���
				break;
			case 3:
				d.modifyScore(stu, count);
				break;
			case 4:
				d.rankScore(stu, count);
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;

			}// switch

		} // while
	}// main

	

	

	// ī�� ����
	// Card,Deck,Main Ŭ���� ����
	// ���� ī�� 5�徿 2���� �ְ�, 2���� ī�带 ���� �����־�
	// 2���� ������ �ִ� ī�带 ����Ͻÿ�.

}
