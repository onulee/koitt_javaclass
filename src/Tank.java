
public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("[%d,%d]��ǥ�� ������ �̵��մϴ�.\n", x, y);
	}

	void changeMode() {
		System.out.println("������� ����");
	}

}
