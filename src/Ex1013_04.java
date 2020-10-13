
public class Ex1013_04 {

	public static void main(String[] args) {
		Car car=null;
		FireEngine fe = new FireEngine();
		fe.water();
		car = fe; //fe에는 water기능이 있지만
		// car.water();  // car에는 water기능없어서 사용 불가능

		FireEngine fe2=null;
		fe2 =(FireEngine) car;
		// FireEngine fe2 = new FireEngine();
		fe2.water();
	}

}
