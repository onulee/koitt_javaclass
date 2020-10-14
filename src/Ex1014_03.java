
public class Ex1014_03 {

	public static void main(String[] args) {
		Tank1 t1 = new Tank1();
		Marine1 m1 = new Marine1();
		SCV s1 = new SCV();
		Tank1 t2= new Tank1();
		Marine1 m2 = new Marine1();
		System.out.println(t1);
		t1.beAttack(30);
		System.out.println(t2);
		t2.beAttack(50);
		System.out.println(t1);
		t1.beAttack(10);
		
		s1.repair(t1);
		

	}

}
