
public class Circle extends Shape {
//	String color="blue";
//	void draw() {
//		System.out.println(color+"�� ������ ĥ�մϴ�.");
//	}
	
	Point center;
	int r;
	
	Circle(){
		this(new Point(),100);
	}
	
	Circle(Point center,int r){
		this.center = center;
		this.r = r;
	}
	
	

}
