
public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.printf("[%d,%d]좌표로 땅으로 이동합니다.\n",x,y);

	}
	void stimPack() {
		System.out.println("능력 증가");
	}

}
