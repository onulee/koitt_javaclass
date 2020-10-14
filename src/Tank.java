
public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("[%d,%d]좌표로 땅으로 이동합니다.\n", x, y);
	}

	void changeMode() {
		System.out.println("시지모드 변경");
	}

}
