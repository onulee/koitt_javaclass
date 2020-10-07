
public class Circle extends Shape {
//	String color="blue";
//	void draw() {
//		System.out.println(color+"의 색상을 칠합니다.");
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
