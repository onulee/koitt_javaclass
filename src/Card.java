
public class Card {
	
	String[] card=new String[52];
	String[] k = {"Clover","Heart","Diamond","spade"};
	String[] n = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

	{  // 초기화블럭
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<n.length;j++) {
				card[(i*13)+j]=k[i]+","+n[j];
			}
		}
		
	}
	
	Card(){  // 생성자
		
	}
	
	

}
