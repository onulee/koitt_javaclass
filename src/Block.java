
public class Block {
	
	String name;
	static int number;
	static int[] arr=new int[10];
	
	static { //클래스 초기화 블럭
	   	number=5;
	   	for(int i=0;i<arr.length;i++) {
	   		arr[i]=i+1;
	   	}
	}
	
	{ // 인스턴스 초기화 블럭
		number=5;
		for(int i=0;i<arr.length;i++) {
	   		arr[i]=i+1;
	   	}
	   	
		name="홍길동";
	}
	

}
