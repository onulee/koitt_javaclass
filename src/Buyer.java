import java.util.ArrayList;

public class Buyer {
	//변수선언
	int money = 1000;
	int bonusPoint=0;
	int count=0;
	// Product[] cart = new Product[10];  //computer,Tv,audio
	ArrayList list = new ArrayList();

	
	//메소드선언
	void setMoney(int money) {
		this.money += money;
	}
	
	int getMoney() {
		return money;
	}
	
	void summary() { //computer,Tv,audio
		int sum=0;
		if(list.isEmpty()) {
			System.out.println("구매상품이 없습니다.");
			return;
		}
		System.out.print("총구매목록 : ");
		for(int i=0;i<list.size();i++) {
			Product p2 = (Product)list.get(i);
			System.out.print(p2.p_name+"\t");
			sum += p2.price;
		}
		System.out.println();
		System.out.printf("총구매 금액 : %d \n",sum);
		
	}
	
	
	void buy(Product p) {  //200,20
		
		if(money<p.price) {
			System.out.println("잔액이 부족합니다. 상품을 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		if(p instanceof Computer) {
			System.out.println("컴퓨터 1대를 구매했습니다.");
		}else if(p instanceof Tv) {
			System.out.println("TV 1대를 구매했습니다.");
		}else if(p instanceof Audio) {
			System.out.println("Audio 1대를 구매했습니다.");
		}
//		cart[count++] = p;
		
		list.add(p);
		
	}
	

}
