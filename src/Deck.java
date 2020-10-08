
public class Deck {
	Card[] c = new Card[52]; // �ƹ��͵� ���� 52���� ī�� ���� 
	
	Deck() {  //������
		for(int i=0;i<4;i++) { //ī���� ����
			for(int j=0;j<13;j++) {
				c[((i)*13)+(j)]=new Card(i+1,j+1);
			}
		}
	}
	
	//�޼ҵ�
	Card pick(int x) {
		return c[x];
	}
	
	Card pick() {
		return c[(int)(Math.random()*52)];
	}
	
	
	//�޼ҵ�
	void shuffle() {
		Card temp=null;
		int temp_num=0;
		
		for(int i=0;i<2000;i++) {
			temp=c[0]; //0������ �� -> temp�� �ֱ�
			temp_num = (int)(Math.random()*52);//0~51������ ����
			c[0]=c[temp_num];  //c�����迭�� 0���濡 �ֱ� 
			c[temp_num]=temp;  //temp�� �ִ� �� c�����迭�� �ֱ�
		}
		
	}

}
