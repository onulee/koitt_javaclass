import java.util.Scanner;

public class Ex1013_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		int choice = 0;

		loop1: while (true) {
			System.out.println("[ ���̸�Ʈ ���θ� ]");
			System.out.println("1.��ǻ��");
			System.out.println("2.TV");
			System.out.println("3.AUDIO");
			System.out.println("4.��������");
			System.out.println("5.���籸�Ÿ��");
			System.out.println("0.����");
			System.out.println("----------------------");
			System.out.println("�����ϰ� ���� ��ǰ ��ȣ�� �����ϼ���.>>");
			choice = scan.nextInt();

			switch (choice) {

			case 1: //��ǻ�� ����
				b1.buy(new Computer());
				print(b1);
				break;
			case 2: //TV����
				b1.buy(new Tv());
				print(b1);

				break;
			case 3:  // audio ����
				b1.buy(new Audio());
				print(b1);

				break;
			case 4:
				System.out.println("������ �󸶳� �����Ͻðڽ��ϱ�?(1.������ 0.���)");
				choice = scan.nextInt();
				if(choice==0) {
					break;
				}else {
					b1.setMoney(choice);
					System.out.println(choice+"���� �ݾ��� �����Ǿ����ϴ�.");
					System.out.println("���� �ѱݾ� : "+b1.getMoney());
				}
				break;
				
			case 5:
				System.out.println("[ ���ų��� ]");
				b1.summary();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}
		}
	}

	static void print(Buyer b1) {
		System.out.println("���� �ݾ� : " + b1.money);
		System.out.println("���� ���ʽ� ����Ʈ : " + b1.bonusPoint);
	}

}//class
