
public class Triangle extends Shape {
	
//	int x;
//	int y;
	
	Point[] p;
	
	Triangle() { }; //»ý¼ºÀÚ
	
	Triangle(Point[] p){
		this.p = p;
	}

	Triangle(Point p1,Point p2,Point p3){
		p=new Point[] {p1,p2,p3};
	}
	
	
	
	
	
	
	
}
