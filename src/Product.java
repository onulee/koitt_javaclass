
public class Product {
	static int count; //Ŭ��������
	int serialNo;     //�ν��Ͻ�����
	String p_name;
	int bar;
	boolean s_lens;
	
	{
		++count;
		serialNo = count;
	}//�ν��Ͻ� �ʱ�ȭ��
	
	Product(){  //������
		
	}  //������
	
	Product(String p_name,int bar){  //��Ʈ20 ������
		this.p_name = p_name;
		this.bar = bar;
	}
	
	Product(String p_name,boolean s_lens){  //S20 ������
		this.p_name=p_name;
		this.s_lens = s_lens;
	}
	
	Product(String p_name,int bar,boolean s_lens){ //������
		this.p_name = p_name;
		this.bar = bar;
		this.s_lens = s_lens;
	}

	
	
	
}
