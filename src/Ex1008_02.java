
public class Ex1008_02 {

	public static void main(String[] args) {
		Deck d = new Deck();  //���,���ڰ� �� �ִ� 52�� ī�� ����
		//���
		System.out.println("- ī�� ������ ù��° ī�� ��� -");
		for(int i=0;i<d.c.length;i++) {
			System.out.print("Card ["+d.c[i].kind+",");
			System.out.println(d.c[i].number+"]");
		}
		System.out.println("-------------------------");
		
		d.shuffle(); //ī�� ����
		System.out.println("- ī�� ���� �� ��� -");
		for(int i=0;i<d.c.length;i++) {
			System.out.print("Card ["+d.c[i].kind+",");
			System.out.println(d.c[i].number+"]");
		}
		System.out.println("-------------------------");
		Card c_pick = d.pick();
		Card c_pick2 = d.pick();
		
		System.out.println("1��° ī�� : ["+c_pick.kind+","+c_pick.number+"]");
		System.out.println("2��° ī�� : ["+c_pick2.kind+","+c_pick2.number+"]");
		

	}

}
