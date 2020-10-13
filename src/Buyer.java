import java.util.ArrayList;

public class Buyer {
	//��������
	int money = 1000;
	int bonusPoint=0;
	int count=0;
	// Product[] cart = new Product[10];  //computer,Tv,audio
	ArrayList list = new ArrayList();

	
	//�޼ҵ弱��
	void setMoney(int money) {
		this.money += money;
	}
	
	int getMoney() {
		return money;
	}
	
	void summary() { //computer,Tv,audio
		int sum=0;
		if(list.isEmpty()) {
			System.out.println("���Ż�ǰ�� �����ϴ�.");
			return;
		}
		System.out.print("�ѱ��Ÿ�� : ");
		for(int i=0;i<list.size();i++) {
			Product p2 = (Product)list.get(i);
			System.out.print(p2.p_name+"\t");
			sum += p2.price;
		}
		System.out.println();
		System.out.printf("�ѱ��� �ݾ� : %d \n",sum);
		
	}
	
	
	void buy(Product p) {  //200,20
		
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�. ��ǰ�� ������ �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		if(p instanceof Computer) {
			System.out.println("��ǻ�� 1�븦 �����߽��ϴ�.");
		}else if(p instanceof Tv) {
			System.out.println("TV 1�븦 �����߽��ϴ�.");
		}else if(p instanceof Audio) {
			System.out.println("Audio 1�븦 �����߽��ϴ�.");
		}
//		cart[count++] = p;
		
		list.add(p);
		
	}
	

}
