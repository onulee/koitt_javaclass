
public class Ex0929_03 {

	public static void main(String[] args) {
		// 40개 배열객체 선언
		// 40개 객체선언-> 데이터 입력 (1~10,Diamond,spade,Heart,clover)
		Card[] card = new Card[40]; //배열객체선언
		String[] kind2 = {"Diamond","Spade","Heart","Clover"};
		System.out.println("[ 전체 카드 출력 ]");
		for(int i=0;i<card.length;i++) {
			card[i] = new Card(); //객체선언
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
