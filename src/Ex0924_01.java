import java.util.Scanner;

public class Ex0924_01 {

	public static void main(String[] args) {
		// 1-100까지 랜덤숫자 맞추기 게임
		
		
		// 1.1-100까지 랜덤숫자 -> 무한반복 -> 숫자입력 
		// 0번 누르면 종료 -> 크다,작다,같다 -> 같을때 종료 -> 출력
		//변수선언
		int sel_num = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		int in_num=0;
		String in_str="";
		char in_ch=' ';
		int[] save_num = new int[10];
		int i=0;
		
		while(true) {
			// 숫자입력
			System.out.println("숫자를 입력하세요(종료:0)>>");
//			in_str = scan.nextLine();
//			in_num = Integer.parseInt(scan.nextLine());
			
			in_ch = scan.next().charAt(0);
			in_num = in_ch - '0';
			
			save_num[i] = in_num; 
			// 0번 누르면 종료
			if(in_num==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 크다,작다,같다
			if(in_num==sel_num) {
				System.out.println("정답입니다.");
				break;
			}else if(in_num>sel_num) {
				System.out.println("작은 수를 입력하세요.");
			}else {
				System.out.println("큰수를 입력하세요.");
			}
			i++;
		}
		
		//출력
		System.out.println("정답 : "+sel_num);
		System.out.println("총시도 횟수 :"+ (i+1));
		System.out.print("시도했던 숫자 : ");
		for(int j=0;j<=i;j++) {
			System.out.print(save_num[j]+" ");
		}
		System.out.println();
		

	}

}
