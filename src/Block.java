
public class Block {
	
	String name;
	static int number;
	static int[] arr=new int[10];
	
	static { //Ŭ���� �ʱ�ȭ ��
	   	number=5;
	   	for(int i=0;i<arr.length;i++) {
	   		arr[i]=i+1;
	   	}
	}
	
	{ // �ν��Ͻ� �ʱ�ȭ ��
		number=5;
		for(int i=0;i<arr.length;i++) {
	   		arr[i]=i+1;
	   	}
	   	
		name="ȫ�浿";
	}
	

}
