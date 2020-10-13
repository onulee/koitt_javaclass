
public class Singleton1 {
	
	int kind;
	int number;
	private static Singleton1 s = new Singleton1();
	
	private Singleton1(){};
	
	public static Singleton1 getInstance() {
		return s;
	}
	
	

}
