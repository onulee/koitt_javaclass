import java.util.Scanner;

public class Ex1006_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Car[] c = new Car[5];
		String color="";
		String gearType="";
		int door=0;
		
		Car c1=new Car("핑크","오토",5);
		Car c2=new Car(c1);
		
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		
		
		
		String[] col= {"흰색","블루","레드","오렌지","브론즈"};
		for(int i=0;i<c.length;i++) {
			System.out.println("차량색상을 입력하세요.>>");
			color = scan.next();
			System.out.println("기어타입을 입력하세요.>>");
			gearType = scan.next();
			System.out.println("차량문 개수를 입력하세요.>>");
			door = scan.nextInt();
			c[i]=new Car(color,gearType,door);
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("차량-색상 : %s, 기어타입 :%s, 차량문개수 : %d \n",c[i].color,c[i].gearType,c[i].door);
		}
		
		
		
//		Car c1 = new Car();
//		c1.color = "흰색";
//	    c1.gearType="오토";
//	    c1.door=4;
//	    Car c2 = new Car();
//	    c2.color="블루";
//	    c2.gearType="오토";
//	    c2.door=4;
//	    
//	    String[] col = {"흰색","블루","오렌지","레드","브론즈"}; 
//	    Car[] c = new Car[5];
//	    
//	    for(int i=0;i<c.length;i++) {
//	    	c[i]=new Car();
//	    	c[i].color=col[i];
//	    	c[i].gearType="오토";
//	    	c[i].door=4;
//	    }
	    
	    
	    
	    

	}

}
