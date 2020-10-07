
public class Ex1005_03 {

	public static void main(String[] args) {
		Card[] card = new Card[52];
		
		String[] c = {"1","2","3","4","5","6","7","8",
				"9","10","J","Q","K"};
		String[] k = {"Clover","Heart","Diamond","spade"};
		
		for(int i = 0;i<card.length;i++) {
			card[i] = new Card();
//			card[i].number = c[(i%13)];  
//			
//			if(i<((i/13)+i+1)) {
//				card[i].kind = k[(i/13)];
//			}
//		    System.out.printf("카드번호 : %s\t 카드종류 : %s \n",card[i].number,card[i].kind);
		}
		

	}

}
