import java.io.IOException;
import java.util.Scanner;

public class Ex1015_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[쇼핑몰]");
			System.out.println("1.컴퓨터");
			System.out.println("2.TV");
			System.out.println("3.오디오");
			
			
			try {
				System.out.println("데이터베이스와 이제 연결할 프로그램 구현");
				System.out.println(0/0);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			
			System.out.println("4.세탁기");
			System.out.println("-------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int num = scan.nextInt();
		}
		
		

	}

}
