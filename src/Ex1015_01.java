import java.io.IOException;
import java.util.Scanner;

public class Ex1015_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[���θ�]");
			System.out.println("1.��ǻ��");
			System.out.println("2.TV");
			System.out.println("3.�����");
			
			
			try {
				System.out.println("�����ͺ��̽��� ���� ������ ���α׷� ����");
				System.out.println(0/0);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			
			System.out.println("4.��Ź��");
			System.out.println("-------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
			int num = scan.nextInt();
		}
		
		

	}

}
