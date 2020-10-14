
public class Tank1 extends GroundUnit implements Repairable {

	int att_q=0; //°ø°Ý·®
	
	Tank1() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "TANK";
	}

}
