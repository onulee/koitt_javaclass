
public class Ex0929_02 {

	public static void main(String[] args) {
		// Card 20�� -> heart,spade,1~10���� ���� 10��
		// ���ڿ� ����� �־ ����� ���Ѻ�����.

		Card[] card = new Card[20]; // �迭��ü����
		card[0].kind = "Heart";
		card[0].number = 1;

		for (int i = 0; i < card.length; i++) {
			card[i] = new Card(); // Card��ü ����
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
