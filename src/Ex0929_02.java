
public class Ex0929_02 {

	public static void main(String[] args) {
		// Card 20개 -> heart,spade,1~10까지 각각 10개
		// 숫자와 모양을 넣어서 출력을 시켜보세요.

		Card[] card = new Card[20]; // 배열객체선언
		card[0].kind = "Heart";
		card[0].number = 1;

		for (int i = 0; i < card.length; i++) {
			card[i] = new Card(); // Card객체 선언
			if (i < 10) {
				card[i].kind = "Heart";
				card[i].number = i + 1;
			} else {
				card[i].kind = "Spade";
				card[i].number = i-10 + 1;
			}
		} // for

	}// main
}// class
