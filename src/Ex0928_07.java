import java.util.Scanner;

public class Ex0928_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student[] s = new Student[3];
		int count = 1;
		int sel_num = 0;
		String search="";
		int search_num=0;


		loop1: while (true) {
			System.out.println("-----------------");
			System.out.println(" 학생성적처리프로그램");
			System.out.println("-----------------");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.등수처리");
			System.out.println("4.성적수정");
			System.out.println("0.종료");
			System.out.println("-----------------");
			System.out.println("원하는 번호를 입력하세요>>");
			sel_num = scan.nextInt();

			switch (sel_num) {

			case 1:
				System.out.println("[[[[[ 입력창 ]]]]]");
				// 입력
				for (int i = 0; i < s.length; i++) {
					s[i] = new Student();
					System.out.println("이름을 입력하세요.>>");
					s[i].number = i + 1;
					s[i].name = scan.next();
					System.out.println("국어 데이터를 입력하세요.>>");
					s[i].kor_score = scan.nextInt();
					System.out.println("영어 데이터를 입력하세요.>>");
					s[i].eng_score = scan.nextInt();
					System.out.println("수학 데이터를 입력하세요.>>");
					s[i].math_score = scan.nextInt();
					s[i].total = s[i].kor_score + s[i].eng_score + s[i].math_score;
					s[i].avg = s[i].total / 3.0;
				}
				break;
			case 2:
				System.out.println("[[[[[ 출력창 ]]]]]");
				// 출력
				for (int i = 0; i < s.length; i++) {
					System.out.print(s[i].number + "\t");
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor_score + "\t");
					System.out.print(s[i].eng_score + "\t");
					System.out.print(s[i].math_score + "\t");
					System.out.print(s[i].total + "\t");
					System.out.print(s[i].avg + "\t");
					System.out.print(s[i].rank + "\t");
					System.out.println();
				}
				
				break;
			case 3:
				System.out.println("등수처리창");
				// 등수처리
				for (int i = 0; i < s.length; i++) {
					for (int j = 0; j < s.length; j++) {
						if (s[i].total < s[j].total) {
							count++;
						}
					}
					s[i].rank = count;
					count = 1;
				}
				
				
				break;
			case 4:
				System.out.println("[[[[[ 수정창 ]]]]]");
				System.out.println("이름을 입력하세요.>>");
				search = scan.next();
				count=0; // 같은 이름이 있으면 1, 없으면 0
				for(int i=0;i<s.length;i++) {
					if(search.equals(s[i].name)) {
						System.out.println("일치하는 데이터가 있습니다.^^");
						search_num=i; //몇번째에 같은데이터가 있는 확인
						count++;
						break;
					}
				}
				
				//데이터가 있는지 없는지 확인
				if(count==0) {
					System.out.println("데이터가 없습니다.");
					break;
				}else {
					System.out.println("어느점수를 변경하시겠습니까?");
					System.out.println("1.국어");
					System.out.println("2.영어");
					System.out.println("3.수학");
					System.out.println("0.이전화면");
					System.out.println("--------");
					System.out.println("원하는 번호를 입력하세요>>");
					sel_num = scan.nextInt();
					
					switch(sel_num) {
					case 1:
						System.out.println("국어점수 입력하세요.>>");
						s[search_num].kor_score=scan.nextInt();
						s[search_num].total = s[search_num].kor_score + s[search_num].eng_score + s[search_num].math_score;
						s[search_num].avg = s[search_num].total / 3.0;
						System.out.println("국어점수 수정이 완료되었습니다.");
						break;
                    case 2:
                    	System.out.println("영어점수 입력하세요.>>");
						s[search_num].eng_score=scan.nextInt();
						s[search_num].total = s[search_num].kor_score + s[search_num].eng_score + s[search_num].math_score;
						s[search_num].avg = s[search_num].total / 3.0;
						System.out.println("영어점수 수정이 완료되었습니다.");
						break;
                    case 3:
                    	System.out.println("수학점수 입력하세요.>>");
						s[search_num].math_score=scan.nextInt();
						s[search_num].total = s[search_num].kor_score + s[search_num].eng_score + s[search_num].math_score;
						s[search_num].avg = s[search_num].total / 3.0;
						System.out.println("수학점수 수정이 완료되었습니다.");
						break;
                    case 0:
						System.out.println("이전화면으로 이동합니다.");
						break;
					
					}
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				break;
			case 0:
				System.out.println("종료");
				break loop1;

			}

		}


		

//		for(int i=0;i<name1.length;i++) {
//			score1[i][0] = i+1;
//			System.out.println("이름을 입력하세요.>>");
//			name1[i] = scan.next(); 
//			//score0-번호,1-국어,2-영어,3-수학,4-합계,5-등수
//			for(int j=0;j<3;j++) {
//				System.out.println("데이터를 입력하세요.>>");
//				score1[i][j+1]=scan.nextInt();
//			}
//			score1[i][4] = score1[i][1]+score1[i][2]+score1[i][3];
//			avg1[i] = score1[i][4]/3.0;
//			
//		}

	}

}
