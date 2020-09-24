
public class Ex0924_03 {

	public static void main(String[] args) {
		int[] info_num = { 0, 1, 2, 3, 4 };
		int[][] arr = new int[5][5];

		// 배열에 숫자 넣기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (5 * i) + j + 1;
			}
		}

		// XY표시 출력
		System.out.print("XY" + "  |" + "\t");
		for (int i = 0; i < info_num.length; i++) {
			System.out.print(info_num[i] + "\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------");

		// 배열 값 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(info_num[i] + "   |" + "\t");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
