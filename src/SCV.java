
public class SCV extends GroundUnit implements Repairable {

	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		
		if(r instanceof Unit1) {
			Unit1 u = (Unit1)r;
			System.out.println("현재 체력 : "+u.hitPoint);
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println("현재 충전된 체력 : "+u.hitPoint);
		}
	}
}
