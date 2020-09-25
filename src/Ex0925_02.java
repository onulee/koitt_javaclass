public class Ex0925_02 {

	public static void main(String[] args) {
		// arr1[5][5] -> 1~25���� ���������� ���� �迭
		// arr2[5][5] -> 1~25���� �ұ�Ģ������ ���� �迭�� ����� ������.
		// arr3[5][5] -> 1~25���� ���������� ���� �迭
		// arr4[5][5] -> 0���� ���� �迭
		// arr5[7][7] -> 0���� ���� �迭

		int[][] arr1 = new int[5][5];
		int[][] arr2 = new int[5][5];
		int[][] arr3 = new int[5][5];
		int[][] arr4 = new int[5][5];
		int[][] arr5 = new int[7][7];
		

		// arr1 �迭�� �� �Է�
		arr_input(arr1,1);
		arr_print(arr1);

		// arr2 �迭�Է�
		arr_input(arr2,2);
		// arr2 �迭���
		arr_print(arr2);
		
		// arr3 �Է�
		arr_input(arr3,1);
		arr_print(arr3);
		
		// arr4�Է�
		arr_input(arr4,0);
		arr_print(arr4);
		
		// arr5 �Է�
		arr_input(arr5,0);
		arr_print(arr5);
		
	}//main
	
	//�迭�Է� �޼ҵ� arr_input
	static void arr_input(int[][] m_arr,int select_num) {
		switch(select_num) {
		
		case 0:
			for (int i = 0; i < m_arr.length; i++) {
				for (int j = 0; j < m_arr[i].length; j++) {
					m_arr[i][j] = 0;
				}
			}
			break;
		case 1:
			for (int i = 0; i < m_arr.length; i++) {
				for (int j = 0; j < m_arr[i].length; j++) {
					m_arr[i][j] = (i * 5) + j + 1;
				}
			}
			break;
		case 2:
			int[] temp_arr = new int[25];
			int temp = 0;
			int random_num = 0;
			
			// arr2 �迭����
			for (int i = 0; i < temp_arr.length; i++) {
				temp_arr[i] = i + 1;
			}
			for (int i = 0; i < (temp_arr.length) * 4; i++) {
				temp = temp_arr[0];
				random_num = (int) (Math.random() * 25);
				temp_arr[0] = temp_arr[random_num];
				temp_arr[random_num] = temp;
			}

			// arr2 �迭�� �� �Է�
			for (int i = 0; i < m_arr.length; i++) {
				for (int j = 0; j < m_arr[i].length; j++) {
					m_arr[i][j] = temp_arr[(m_arr.length * i) + j];
				}
			}
			
			
			break;
		default:
			System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
			break;
		}
	}
	
	// �迭��� �޼ҵ� arr_print
	static void arr_print(int[][] m_arr) {
		for (int i = 0; i < m_arr.length; i++) {
			for (int j = 0; j < m_arr[i].length; j++) {
				System.out.print(m_arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
	}
	
	

}//class
