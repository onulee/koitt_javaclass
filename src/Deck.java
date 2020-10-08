
public class Deck {
	Card[] c = new Card[52]; // 아무것도 없는 52장의 카드 생성 
	
	Deck() {  //생성자
		for(int i=0;i<4;i++) { //카드의 종류
			for(int j=0;j<13;j++) {
				c[((i)*13)+(j)]=new Card(i+1,j+1);
			}
		}
	}
	
	//메소드
	Card pick(int x) {
		return c[x];
	}
	
	Card pick() {
		return c[(int)(Math.random()*52)];
	}
	
	
	//메소드
	void shuffle() {
		Card temp=null;
		int temp_num=0;
		
		for(int i=0;i<2000;i++) {
			temp=c[0]; //0번방의 값 -> temp에 넣기
			temp_num = (int)(Math.random()*52);//0~51사이의 난수
			c[0]=c[temp_num];  //c난수배열을 0번방에 넣기 
			c[temp_num]=temp;  //temp에 있는 값 c난수배열에 넣기
		}
		
	}

}
