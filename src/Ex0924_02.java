import java.util.Scanner;

public class Ex0924_02 {

	public static void main(String[] args) {
		// 1조857440 - 주택복권(랜덤숫자로 넣어주세요.0-9까지의 숫자)
		// 1조987550 - 입력값 - 2자리 숫자가 맞았습니다.
		// ----------------
		// oxxoxxo

		// 1. 랜덤숫자 0-9까지의 숫자 생성, 문자열 변환
		// 2. 문자열 입력
		// 3. 문자열 비교
		// 4. 출력

		// 변수선언
		String win_str = "";
		String in_str = "";
		int count = 0;
		String[] win_show = new String[8];
		Scanner scan = new Scanner(System.in);

		// 숫자를 문자열로 변환-> 문자열 ex)9조246596
		for (int i = 0; i < 8; i++) {
			if (i == 1) {
				win_str += "조";
				continue;
			}
			win_str += (int) (Math.random() * 10);
		}

		// 문자열 입력
		while (true) {
			System.out.println("주택복권 번호를 넣으세요(ex:1조123456)>>");
			in_str = scan.next();

			if (in_str.length() != 8) {
				System.out.println("8자리가 아닙니다. 다시 입력하세요.");
			} else {
				break;
			}
		}
		// 1조857440 - 문자열
		// 1조987550 - 문자열

		// 문자열 비교
		for (int i = 0; i < win_str.length(); i++) {
			if (win_str.charAt(i) == in_str.charAt(i)) {
				win_show[i] = "O";
				count++;
			} else {
				win_show[i] = "X";
			}
		}

		// 출력
		System.out.print("내    용" + "\t");
		for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------");

		System.out.print("당첨번호 :" + "\t");
		for (int i = 0; i < win_str.length(); i++) {
			System.out.print(win_str.charAt(i) + "\t");
		}
		System.out.println();

		System.out.print("입력번호 :" + "\t");
		for (int i = 0; i < in_str.length(); i++) {
			System.out.print(in_str.charAt(i) + "\t");
		}
		System.out.println();

		System.out.print("당첨표시 :" + "\t");
		for (int i = 0; i < win_show.length; i++) {
			System.out.print(win_show[i] + "\t");
		}
		System.out.println();

	}

}
