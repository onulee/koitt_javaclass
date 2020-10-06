
public class Ex1006_02 {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x=10;
		System.out.println("main d1.x의 값 :"+d1.x);
		change(d1.x);
		System.out.println("main d1.x의 값 :"+d1.x);

	}
	
	static void change(int x) {
		x=1000;
		System.out.println("change메소드 x의 값 :"+x);
	}

}
