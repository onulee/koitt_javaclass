
public class Electronic {

	static int serialNo,tvCount,refCount,washCount,smartcount;
	int count;
	int tvNo,refrigeratorNo,washerNo,smartNo;
	
	String name;
	int screen;
	double frozen;
	boolean motor;
	String cpu;
	
	{
		++serialNo;  //�Ϸù�ȣ�߰�
	}
	
	//1.TV�� ������
	Electronic(String name,int screen){  
		++tvCount;
		tvNo = tvCount;
		this.name = name;
		this.screen = screen;
	}
	
	//2.refrigerator �� ������
	Electronic(String name,double frozen){  
			++refCount;
			refrigeratorNo = refCount;
			this.name = name;
			this.frozen = frozen;
	}
	
	//3.washer �� ������
	Electronic(String name,boolean motor){  
		++washCount;
		washerNo = washCount;
		this.name = name;
		this.motor = motor;
	}
		
	//4. smart �� ������
	Electronic(String name,String cpu){  
		++smartcount;
		smartNo = smartcount;
		this.name = name;
		this.cpu = cpu;
	}
	
	
	
	

}
