
public class Ex0924_04 {

	public static void main(String[] args) {
		// 1.1을 5개만 입력을 해서 랜덤으로 배열넣기
		
        int[] in_arr=new int[25];
		int[][] arr1 = new int[5][5];
		String[][] arr2 = new String[5][5];
		int temp=0;
		int random_num=0;
		int[] info_num= {0,1,2,3,4};
		
		//1을 5개 넣기
		for(int i=0;i<5;i++) {
			in_arr[i]=1;
		}
		//랜덤 섞기
		for(int i=0;i<100;i++) {
			temp = in_arr[0];
			random_num = (int)(Math.random()*25);
			in_arr[0]=in_arr[random_num];
			in_arr[random_num] = temp;
		}
		// 배열 랜덤숫자 넣기
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j] = in_arr[(5*i)+j];
			}
		}
		
		// 1,0 XY 출력
    	System.out.print("XY" + "  |" + "\t");
    	for (int i = 0; i < info_num.length; i++) {
    		System.out.print(info_num[i] + "\t");
    	}
    	System.out.println();
    	System.out.println("--------------------------------------------");
    	
    	// 1,0 XY 배열 값 출력
    	for (int i = 0; i < arr1.length; i++) {
    		System.out.print(info_num[i] + "   |" + "\t");
    		for (int j = 0; j < arr1[i].length; j++) {
    			System.out.print(arr1[i][j] + "\t");
    		}
    		System.out.println();
    	}
		

	}

}
