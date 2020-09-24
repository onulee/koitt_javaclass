import java.util.Scanner;

public class Ex0924_04 {

	public static void main(String[] args) {
		// 1.1을 5개만 입력을 해서 랜덤으로 배열넣기
		int[] in_arr = new int[25];
		int[][] arr1 = new int[5][5];
		String[][] arr2 = new String[5][5];
		int temp = 0;
		int random_num = 0;
		int[] info_num = { 0, 1, 2, 3, 4 };
		String loca_xy = "";
		int loca_x = 0;
		int loca_y = 0;
		Scanner scan = new Scanner(System.in);

		// 1을 5개 넣기
		for (int i = 0; i < 5; i++) {
			in_arr[i] = 1;
		}

		// arr2 뽑기라는 문구 넣기
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = "뽑기";
			}
		}

		// 랜덤 섞기
		for (int i = 0; i < 100; i++) {
			temp = in_arr[0];
			random_num = (int) (Math.random() * 25);
			in_arr[0] = in_arr[random_num];
			in_arr[random_num] = temp;
		}
		// 배열 랜덤숫자 넣기
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = in_arr[(5 * i) + j];
			}
		}

		// arr1 XY출력 삭제

		while (true) {
			// 입력하는 XY출력
			System.out.print("XY" + "  |" + "\t");
			for (int i = 0; i < info_num.length; i++) {
				System.out.print(info_num[i] + "\t");
			}
			System.out.println();
			System.out.println("--------------------------------------------");

			// 입력한 값의 보물표시 배열 값 출력
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(info_num[i] + "   |" + "\t");
				for (int j = 0; j < arr2[i].length; j++) {
					System.out.print(arr2[i][j] + "\t");
				}
				System.out.println();
			}

			// 좌표입력
			System.out.println("좌표를 입력하세요.(XY:02)>>");
			loca_xy = scan.next();
			loca_x = loca_xy.charAt(0) - '0'; // '0'-'0'= 0
			loca_y = loca_xy.charAt(1) - '0'; // '2'-'0'= 2
			if (arr1[loca_x][loca_y] == 1) {
				arr2[loca_x][loca_y] = "보물";
			} else {
				arr2[loca_x][loca_y] = "꽝";
			}
			
			break;
		}//while
		
		
		//정답출력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] == 1) {
					arr2[i][j] = "보물";
				} else {
					arr2[i][j] = "꽝";
				}
			}
		}
		
		

	}

}
