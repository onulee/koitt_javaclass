import java.util.Scanner;

public class Ex1008_01 {
	
	public static void main(String[] args) {
		
		// Point ��ǥ�� 2���� �Է¹޾Ƽ� ���̸� ���� ���ؼ� ����� ������.
		int[][] point = new int[3][2];
		
		Scanner scan = new Scanner(System.in);
		double[] length=new double[3]; //���� �����ϴ� �迭
		Point[] p = new Point[3];  //point�� �����Ҽ� �ִ� ��ü�迭
		p[0] = new Point();  //0,0

		int x=0,y=0;
		
		for(int i=1;i<p.length;i++) {
			System.out.println("X��ǥ���� �Է��ϼ���>>");
			x=scan.nextInt();
			System.out.println("Y��ǥ���� �Է��ϼ���.>>");
			y=scan.nextInt();
			p[i] = new Point(x,y);  //100,50
			
		}
		
		
		for(int i=1;i<p.length;i++) {
			length[i] = Math.sqrt(Math.pow(p[i].x,2)+Math.pow(p[i].y, 2));
			System.out.printf("[0,0]���� [%d,%d]���� ���� : %f \n",p[i].x,p[i].y,length[i]);
			
		}
		
		
		
		
		
	}

}
