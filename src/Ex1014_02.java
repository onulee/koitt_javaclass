
public class Ex1014_02 {

	public static void main(String[] args) {
		Unit[] u = new Unit[7];
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		u[3] = new Tank();
		u[4] = new Marine();
		u[5] = new Marine();
		u[6] = new Dropship();
		
		for(int i=0;i<u.length;i++) {
			u[i].move(100, 200);
			
		}
		
		

	}

}
