
public class SCV extends GroundUnit implements Repairable {

	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		
		if(r instanceof Unit1) {
			Unit1 u = (Unit1)r;
			System.out.println("���� ü�� : "+u.hitPoint);
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println("���� ������ ü�� : "+u.hitPoint);
		}
	}
}
