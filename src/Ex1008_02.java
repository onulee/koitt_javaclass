
public class Ex1008_02 {

	public static void main(String[] args) {
		Deck d = new Deck();  //모양,숫자가 들어가 있는 52장 카드 생성
		//출력
		System.out.println("- 카드 생성후 첫번째 카드 출력 -");
		for(int i=0;i<d.c.length;i++) {
			System.out.print("Card ["+d.c[i].kind+",");
			System.out.println(d.c[i].number+"]");
		}
		System.out.println("-------------------------");
		
		d.shuffle(); //카드 섞기
		System.out.println("- 카드 섞기 후 출력 -");
		for(int i=0;i<d.c.length;i++) {
			System.out.print("Card ["+d.c[i].kind+",");
			System.out.println(d.c[i].number+"]");
		}
		System.out.println("-------------------------");
		Card c_pick = d.pick();
		Card c_pick2 = d.pick();
		
		System.out.println("1번째 카드 : ["+c_pick.kind+","+c_pick.number+"]");
		System.out.println("2번째 카드 : ["+c_pick2.kind+","+c_pick2.number+"]");
		

	}

}
