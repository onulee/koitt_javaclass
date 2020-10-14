
public class Dropship extends Unit {
	
	void load() {
		System.out.println("태우기");
	}
	void unload() {
		System.out.println("내리기");
	}
	
	@Override
	void move(int x, int y) {
		System.out.printf("[%d,%d]좌표로 하늘로 자유롭게 이동합니다. \n",x,y);
		
	}

}
