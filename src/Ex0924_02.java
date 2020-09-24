import java.util.Scanner;

public class Ex0924_02 {

	public static void main(String[] args) {
		// 1��857440 - ���ú���(�������ڷ� �־��ּ���.0-9������ ����)
		// 1��987550 - �Է°� - 2�ڸ� ���ڰ� �¾ҽ��ϴ�.
		// ----------------
		// oxxoxxo

		// 1. �������� 0-9������ ���� ����, ���ڿ� ��ȯ
		// 2. ���ڿ� �Է�
		// 3. ���ڿ� ��
		// 4. ���

		// ��������
		String win_str = "";
		String in_str = "";
		int count = 0;
		String[] win_show = new String[8];
		Scanner scan = new Scanner(System.in);

		// ���ڸ� ���ڿ��� ��ȯ-> ���ڿ� ex)9��246596
		for (int i = 0; i < 8; i++) {
			if (i == 1) {
				win_str += "��";
				continue;
			}
			win_str += (int) (Math.random() * 10);
		}

		// ���ڿ� �Է�
		while (true) {
			System.out.println("���ú��� ��ȣ�� ��������(ex:1��123456)>>");
			in_str = scan.next();

			if (in_str.length() != 8) {
				System.out.println("8�ڸ��� �ƴմϴ�. �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		// 1��857440 - ���ڿ�
		// 1��987550 - ���ڿ�

		// ���ڿ� ��
		for (int i = 0; i < win_str.length(); i++) {
			if (win_str.charAt(i) == in_str.charAt(i)) {
				win_show[i] = "O";
				count++;
			} else {
				win_show[i] = "X";
			}
		}

		// ���
		System.out.print("��    ��" + "\t");
		for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------");

		System.out.print("��÷��ȣ :" + "\t");
		for (int i = 0; i < win_str.length(); i++) {
			System.out.print(win_str.charAt(i) + "\t");
		}
		System.out.println();

		System.out.print("�Է¹�ȣ :" + "\t");
		for (int i = 0; i < in_str.length(); i++) {
			System.out.print(in_str.charAt(i) + "\t");
		}
		System.out.println();

		System.out.print("��÷ǥ�� :" + "\t");
		for (int i = 0; i < win_show.length; i++) {
			System.out.print(win_show[i] + "\t");
		}
		System.out.println();

	}

}
