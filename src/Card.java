
public class Card {
	
	static final int CLOVER=1;
	static final int HEART=2;
	static final int DIAMOND=3;
	static final int SPADE=4;
	
	String[] kinds= {"","CLOVER","HEART","DIAMOND","SPADE"};
	String[] numbers= {"0","1","2","3","4","5",
			"6","7","8","9","10","J","Q","K"};
	
	String kind;
	String number;
	
	Card(){
		this(SPADE,7);
	}
	
	Card(int kind,int number){
		this.kind = kinds[kind];
		this.number = numbers[number];
	}

}



