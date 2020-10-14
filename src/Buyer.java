import java.util.ArrayList;

public class Buyer {
	
	int sum=0;
	private int money=1000;
	private int bonusPoint=0;
	ArrayList<Product> list = new ArrayList<Product>();
	
	Buyer(){};
	
	void summary() {
		if(list.isEmpty()) {
			System.out.println("구매목록이 없습니다.!!");
			return;
		}
		System.out.println("[ 총구매목록 ]");
		for(int i=0;i<list.size();i++) {
			Product p2 =(Product) list.get(i);
			System.out.println(p2.getPro_name());
		}
	}
	
	void Buy(Product p){
		if(money<p.getPrice()) {
			System.out.println("잔액이 부족합니다. 충전을 해주세요.!");
			return;
		}
		
		money -= p.getPrice(); 
		bonusPoint += p.getBonusPoint();
		System.out.println(p.getPro_name()+"1대를 구매했습니다.");
		list.add(p);
		
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money += money; //현재돈에서 추가해야 함.
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint += bonusPoint;
	};
	
	
	

}
