
public class Dropship extends Unit {
	
	void load() {
		System.out.println("�¿��");
	}
	void unload() {
		System.out.println("������");
	}
	
	@Override
	void move(int x, int y) {
		System.out.printf("[%d,%d]��ǥ�� �ϴ÷� �����Ӱ� �̵��մϴ�. \n",x,y);
		
	}

}
