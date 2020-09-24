import java.util.Scanner;

public class Ex0924_03 {

	public static void main(String[] args) {
		int[] info_num = { 0, 1, 2, 3, 4 };
		String[][] arr = new String[5][5];
		int[] basic_arr=new int[25];
		int temp=0;
		int random_num=0;
		Scanner scan = new Scanner(System.in);
		String loca_xy="";  //좌표값
		int loca_x=0;
		int loca_y=0;
		
		
		
		//기본배열에 번호넣기
		for(int i=0;i<basic_arr.length;i++) {
			basic_arr[i]=i+1;
		}
		
		for(int i=0;i<100;i++) {
			temp = basic_arr[0];
			random_num = (int)(Math.random()*25);
			basic_arr[0]=basic_arr[random_num];
			basic_arr[random_num] = temp;
		}
		

		// 배열에 숫자 넣기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = basic_arr[(5 * i) + j]+"";
			}
		}

		// 반복해야 할 부분
	    while(true) {
	    	
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
	    	
	    	//좌표입력
	    	System.out.println("좌표를 입력하세요.(XY:02)>>");
	    	loca_xy = scan.next();
	    	loca_x = loca_xy.charAt(0)-'0';   // '0'-'0'= 0
	    	loca_y = loca_xy.charAt(1)-'0';   // '2'-'0'= 2
	    	arr[loca_x][loca_y] ="X";
	    }
		
	}
}
