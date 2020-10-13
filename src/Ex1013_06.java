import java.util.Scanner;

public class Ex1013_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b1 = new Buyer();
		int choice = 0;

		loop1: while (true) {
			System.out.println("[ 하이마트 쇼핑몰 ]");
			System.out.println("1.컴퓨터");
			System.out.println("2.TV");
			System.out.println("3.AUDIO");
			System.out.println("4.현금충전");
			System.out.println("5.현재구매목록");
			System.out.println("0.종료");
			System.out.println("----------------------");
			System.out.println("구매하고 싶은 상품 번호를 선택하세요.>>");
			choice = scan.nextInt();

			switch (choice) {

			case 1: //컴퓨터 구매
				b1.buy(new Computer());
				print(b1);
				break;
			case 2: //TV구매
				b1.buy(new Tv());
				print(b1);

				break;
			case 3:  // audio 구매
				b1.buy(new Audio());
				print(b1);

				break;
			case 4:
				System.out.println("현금을 얼마나 충전하시겠습니까?(1.충전함 0.취소)");
				choice = scan.nextInt();
				if(choice==0) {
					break;
				}else {
					b1.setMoney(choice);
					System.out.println(choice+"만원 금액이 충전되었습니다.");
					System.out.println("현재 총금액 : "+b1.getMoney());
				}
				break;
				
			case 5:
				System.out.println("[ 구매내역 ]");
				b1.summary();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}
		}
	}

	static void print(Buyer b1) {
		System.out.println("현재 금액 : " + b1.money);
		System.out.println("현재 보너스 포인트 : " + b1.bonusPoint);
	}

}//class
