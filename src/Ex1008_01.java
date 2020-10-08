import java.util.Scanner;

public class Ex1008_01 {
	
	public static void main(String[] args) {
		
		// Point 좌표값 2개를 입력받아서 길이를 각각 구해서 출력해 보세요.
		int[][] point = new int[3][2];
		
		Scanner scan = new Scanner(System.in);
		double[] length=new double[3]; //길이 저장하는 배열
		Point[] p = new Point[3];  //point를 저장할수 있는 객체배열
		p[0] = new Point();  //0,0

		int x=0,y=0;
		
		for(int i=1;i<p.length;i++) {
			System.out.println("X좌표값을 입력하세요>>");
			x=scan.nextInt();
			System.out.println("Y좌표값을 입력하세요.>>");
			y=scan.nextInt();
			p[i] = new Point(x,y);  //100,50
			
		}
		
		
		for(int i=1;i<p.length;i++) {
			length[i] = Math.sqrt(Math.pow(p[i].x,2)+Math.pow(p[i].y, 2));
			System.out.printf("[0,0]에서 [%d,%d]까지 길이 : %f \n",p[i].x,p[i].y,length[i]);
			
		}
		
		
		
		
		
	}

}
