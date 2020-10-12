import java.util.Scanner;

public class Ex1012_01 {

	public static void main(String[] args) {

		// 선언
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		int count = 0;
		Student[] stu = new Student[5];
		StuDeck d = new StuDeck();
		// 메뉴반복
		loop1: while (true) {
			d.firstPrint(count); // 메뉴출력메소드
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				count = d.inputScore(stu, count); // 학생성적 입력
				break;
			case 2:
				d.printScore(stu, count); // 학생성적 출력
				break;
			case 3:
				d.modifyScore(stu, count);
				break;
			case 4:
				d.rankScore(stu, count);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;

			}// switch

		} // while
	}// main

	

	

	// 카드 추출
	// Card,Deck,Main 클래스 구성
	// 최초 카드 5장씩 2명에게 주고, 2장의 카드를 각각 나눠주어
	// 2명의 가지고 있는 카드를 출력하시오.

}
