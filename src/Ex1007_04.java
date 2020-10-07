
public class Ex1007_04 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		//c1 -> x,y,r
		System.out.println("원의 반지름 : "+c1.r);
		System.out.printf("원의 좌표 : [%d,%d] \n",c1.center.x,c1.center.y);
		System.out.println("원의 색상 : "+c1.color);
		c1.draw();
		
		System.out.println("------------------------");
		
		Circle c2 = new Circle(new Point(150,150),50);
		System.out.println("원의 반지름 :"+c2.r);
		System.out.printf("원의 좌표 : [%d,%d] \n",c2.center.x,c2.center.y);
		System.out.println("원의 색상 : "+c2.color);
		c2.draw();
		
		int[] a = {1,2,3};
		Point p1 = new Point(100,100);
		Point[] p= {p1,new Point(2,7),new Point(25,35)};
		Triangle t1 = new Triangle(p);
		System.out.println("1번째 X좌표 :"+t1.p[0].x);
		System.out.println("1번째 Y좌표 :"+t1.p[0].y);
		
	}

}
