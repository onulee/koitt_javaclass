
public class Ex0929_03 {

	public static void main(String[] args) {
		// 40�� �迭��ü ����
		// 40�� ��ü����-> ������ �Է� (1~10,Diamond,spade,Heart,clover)
		Card[] card = new Card[40]; //�迭��ü����
		String[] kind2 = {"Diamond","Spade","Heart","Clover"};
		System.out.println("[ ��ü ī�� ��� ]");
		for(int i=0;i<card.length;i++) {
			card[i] = new Card(); //��ü����
			card[i].number=(i%10)+1;  //0->0,1->1
			card[i].kind = kind2[i/10]; //0,1,2,3
			System.out.print(card[i].kind + " | ");
			System.out.println(card[i].number+" | ");
//			if(((i+1)%10)==0) {
//				System.out.println();
//			}
		}
		
		
		

	}

}
