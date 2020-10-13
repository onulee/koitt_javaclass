
public class Ex1013_02 {

	public static void main(String[] args) {
		
		Singleton1 s2 = Singleton1.getInstance();
		s2.kind = 1;
		s2.number = 1;
		System.out.println(s2.kind+","+s2.number);
		
		Singleton1 s3 = Singleton1.getInstance();
		s3.kind=3;
		s3.number=4;
		System.out.println(s3.kind+","+s3.number);
		System.out.println(s2.kind+","+s2.number);
		

	}

}
