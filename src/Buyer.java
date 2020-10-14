import java.util.ArrayList;

public class Buyer {
	
	int sum=0;
	private int money=1000;
	private int bonusPoint=0;
	ArrayList<Product> list = new ArrayList<Product>();
	
	Buyer(){};
	
	void summary() {
		if(list.isEmpty()) {
			System.out.println("���Ÿ���� �����ϴ�.!!");
			return;
		}
		System.out.println("[ �ѱ��Ÿ�� ]");
		for(int i=0;i<list.size();i++) {
			Product p2 =(Product) list.get(i);
			System.out.println(p2.getPro_name());
		}
	}
	
	void Buy(Product p){
		if(money<p.getPrice()) {
			System.out.println("�ܾ��� �����մϴ�. ������ ���ּ���.!");
			return;
		}
		
		money -= p.getPrice(); 
		bonusPoint += p.getBonusPoint();
		System.out.println(p.getPro_name()+"1�븦 �����߽��ϴ�.");
		list.add(p);
		
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money; //���絷���� �߰��ؾ� ��.
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint += bonusPoint;
	};
	
	
	

}
