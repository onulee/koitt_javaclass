
public class Tank1 extends GroundUnit implements Repairable {

	int att_q=0; //���ݷ�
	
	Tank1() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "TANK";
	}

}
