
public class Unit1 {
	int hitPoint;
	final int MAX_HP;
	int att_q;
	
	Unit1(int hp){ //������
		MAX_HP = hp;
	}
	
	void beAttack(int att_q) {
		hitPoint -= att_q;
		System.out.println("���� ü�� :"+hitPoint);
	}

}
