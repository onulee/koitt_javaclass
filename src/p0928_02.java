

import java.util.Scanner;

public class p0928_02 {

	public static void main(String[] args) {
		// 학생성적입력 프로그램
		// 1. 성적입력 - 번호,학생이름,국어,영어,수학 -> 합계,평균,등수 0.이전페이지로 이동
		// 2. 성적출력 - 성적이 출력이 되고 -> 다시출력 1, 0.이전페이지 이동
		// 3. 등수처리 - 등수입력되고 -> 다시입력 1, 0.이전페이지 이동
		// 4. 성적수정 - 1번 출력되고 번호를 입력하면 1.국어,2.영어,3.수학 -> 점수입력하세요.>> 계속수정하시겠습니까?1, 0.이전페이지
		// 이동
		// 0. 종료
		
		//1. 성적입력 - 학생이름(string),평균(double),번호,국,영,수,합계,등수(int)
		Scanner scan = new Scanner(System.in);
		String[] index= {"번호","이름","국어","영어","수학","합계","평균","등수"};
		String[] name = new String[3];
		double[] avg = new double[3];
		int[][] score = new int[3][6];
		int i=0;
		int j=0;
		
		// 3명 ->번호(0),이름(0),국어(1),영어(2),수학(3),합계(4),평균(0),등수(5)
		
		for(i=0;i<score.length;i++) {
		    System.out.println("번호를 입력해주세요.>>");
			score[i][0]=scan.nextInt(); //번호
			System.out.println("이름을 입력하세요.>>");
			name[i]=scan.next();
			
			for(j=0;j<3;j++) {
				System.out.println(index[j+2]+"데이터를 입력해주세요.>>");
				score[i][j+1]=scan.nextInt();
			}
			score[i][4]=score[i][1]+score[i][2]+score[i][3];
			avg[i] = score[i][4]/3.0;
			j=1;
		}
		
		
		
		
		
		
		
		
//		while(i<3) {
//			score[i][0] = i+1; // 번호 자동부여
//			System.out.println("이름을 입력하세요.");
//			name[i]=scan.next();
//			while(j<3) {
//				System.out.println(index[j+2]+"데이터를 입력하세요.>>");
//				score[i][j+1] = scan.nextInt();
//				j++;
//			}
//			score[i][4]=score[i][1]+score[i][2]+score[i][3];
//			avg[i]=score[i][4]/3.0;
//			j=0;
//			i++;
//		}
		
		System.out.println("출력");
		for(i=0;i<name.length;i++) {
			for(j=0;j<score[i].length;j++) {
				if(j==1) {
					System.out.print(name[i]+"\t"); //이름
				}	
				if(j==5) {
					System.out.print(avg[i]+"\t"); //평균
				}
				System.out.print(score[i][j]+"\t");//번호,국어,수학,영어,합계,등수
			}
		    System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
