public class Ex1005_01 {

	public static void main(String[] args) {
		
	    // Tv객체 5개 -> 컬러:흰색,오렌지,블루,브론즈,레드
	  	//채널 :1~5번
		//출력은 
		// 1번TV 컬러:흰색, 번호:01
		// 2번TV 컬러:오렌지, 번호:02
		// 3번TV 컬러:블루, 번호:03....05
		
		String[] c = {"흰색","오렌지","블루","브론즈","레드"};
		Tv[] tv = new Tv[5];
	  
	   for(int i=0;i<tv.length;i++) {
		   tv[i] = new Tv();
		   tv[i].channel=i+1;
		   tv[i].color = c[i];
		   
		   System.out.printf("%02d번TV 컬러:%s\t번호:%02d\n",i+1,tv[i].color,tv[i].channel);
	   }
	   
	   
	  
		
		
		
		
		
		
//		Tv t = new Tv();
//		t.channel = 7;
//		t.color="흰색";
//		System.out.println(t.channel);
//		System.out.println(t.color);
//		
//		Tv t2 = t;
//		System.out.println(t2);
//		System.out.println(t2.channel);
//		System.out.println(t2.color);
		
		

	}

}
