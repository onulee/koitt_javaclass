import java.util.Scanner;

public class Ex1006_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Car[] c = new Car[5];
		String color="";
		String gearType="";
		int door=0;
		
		Car c1=new Car("��ũ","����",5);
		Car c2=new Car(c1);
		
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		
		
		
		String[] col= {"���","���","����","������","�����"};
		for(int i=0;i<c.length;i++) {
			System.out.println("���������� �Է��ϼ���.>>");
			color = scan.next();
			System.out.println("���Ÿ���� �Է��ϼ���.>>");
			gearType = scan.next();
			System.out.println("������ ������ �Է��ϼ���.>>");
			door = scan.nextInt();
			c[i]=new Car(color,gearType,door);
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("����-���� : %s, ���Ÿ�� :%s, ���������� : %d \n",c[i].color,c[i].gearType,c[i].door);
		}
		
		
		
//		Car c1 = new Car();
//		c1.color = "���";
//	    c1.gearType="����";
//	    c1.door=4;
//	    Car c2 = new Car();
//	    c2.color="���";
//	    c2.gearType="����";
//	    c2.door=4;
//	    
//	    String[] col = {"���","���","������","����","�����"}; 
//	    Car[] c = new Car[5];
//	    
//	    for(int i=0;i<c.length;i++) {
//	    	c[i]=new Car();
//	    	c[i].color=col[i];
//	    	c[i].gearType="����";
//	    	c[i].door=4;
//	    }
	    
	    
	    
	    

	}

}
