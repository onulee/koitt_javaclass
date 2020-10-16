
public class Card {
	
	// 기본생성자 -> SPADE,1
	// 2개 매개변수를 받는 생성자 카드모양,번호 받는 생성자
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);
	}
	
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : "+kind+" number : "+number;
	}
	
	

}
