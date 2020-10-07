
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
		++serialNo;  //일련번호추가
	}
	
	//1.TV의 생성자
	Electronic(String name,int screen){  
		++tvCount;
		tvNo = tvCount;
		this.name = name;
		this.screen = screen;
	}
	
	//2.refrigerator 의 생성자
	Electronic(String name,double frozen){  
			++refCount;
			refrigeratorNo = refCount;
			this.name = name;
			this.frozen = frozen;
	}
	
	//3.washer 의 생성자
	Electronic(String name,boolean motor){  
		++washCount;
		washerNo = washCount;
		this.name = name;
		this.motor = motor;
	}
		
	//4. smart 의 생성자
	Electronic(String name,String cpu){  
		++smartcount;
		smartNo = smartcount;
		this.name = name;
		this.cpu = cpu;
	}
	
	
	
	

}
