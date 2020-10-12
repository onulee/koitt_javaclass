
public class Ex1012_02 {

	public static void main(String[] args) {
		// 2명
		Card[] userCard1 = new Card[7];
		Card[] userCard2 = new Card[7];
		
		Deck d = new Deck();  //52장의 카드 생성
		d.shuffle();
		
		for(int i=0;i<5;i++) {
			userCard1[i] = d.pick(i);
			userCard2[i] = d.pick(i+5);
		}
		
		for(int i=5;i<7;i++) {
			userCard1[i] = d.pick(i+5);
			userCard2[i] = d.pick(i+7);
		}
		
		for(int i=0;i<userCard1.length;i++) {
			System.out.println((i+1)+"번째 카드 : "+userCard1[i]);
		}
		
		System.out.println("------------------");
		
		for(int i=0;i<userCard2.length;i++) {
			System.out.println((i+1)+"번째 카드 : "+userCard2[i]);
		}
		
		
		
		

	}

}
