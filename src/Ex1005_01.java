public class Ex1005_01 {

	public static void main(String[] args) {
		
	    // Tv��ü 5�� -> �÷�:���,������,���,�����,����
	  	//ä�� :1~5��
		//����� 
		// 1��TV �÷�:���, ��ȣ:01
		// 2��TV �÷�:������, ��ȣ:02
		// 3��TV �÷�:���, ��ȣ:03....05
		
		String[] c = {"���","������","���","�����","����"};
		Tv[] tv = new Tv[5];
	  
	   for(int i=0;i<tv.length;i++) {
		   tv[i] = new Tv();
		   tv[i].channel=i+1;
		   tv[i].color = c[i];
		   
		   System.out.printf("%02d��TV �÷�:%s\t��ȣ:%02d\n",i+1,tv[i].color,tv[i].channel);
	   }
	   
	   
	  
		
		
		
		
		
		
//		Tv t = new Tv();
//		t.channel = 7;
//		t.color="���";
//		System.out.println(t.channel);
//		System.out.println(t.color);
//		
//		Tv t2 = t;
//		System.out.println(t2);
//		System.out.println(t2.channel);
//		System.out.println(t2.color);
		
		

	}

}
