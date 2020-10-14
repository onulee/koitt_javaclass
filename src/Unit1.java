
public class Unit1 {
	int hitPoint;
	final int MAX_HP;
	int att_q;
	
	Unit1(int hp){ //생성자
		MAX_HP = hp;
	}
	
	void beAttack(int att_q) {
		hitPoint -= att_q;
		System.out.println("현재 체력 :"+hitPoint);
	}

}
