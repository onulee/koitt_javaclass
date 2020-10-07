
public class Product {
	static int count; //클래스변수
	int serialNo;     //인스턴스변수
	String p_name;
	int bar;
	boolean s_lens;
	
	{
		++count;
		serialNo = count;
	}//인스턴스 초기화블럭
	
	Product(){  //샘플폰
		
	}  //생성자
	
	Product(String p_name,int bar){  //노트20 생성자
		this.p_name = p_name;
		this.bar = bar;
	}
	
	Product(String p_name,boolean s_lens){  //S20 생성자
		this.p_name=p_name;
		this.s_lens = s_lens;
	}
	
	Product(String p_name,int bar,boolean s_lens){ //갤럭시
		this.p_name = p_name;
		this.bar = bar;
		this.s_lens = s_lens;
	}

	
	
	
}
