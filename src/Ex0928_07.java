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
			System.out.println(" �л�����ó�����α׷�");
			System.out.println("-----------------");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.���ó��");
			System.out.println("4.��������");
			System.out.println("0.����");
			System.out.println("-----------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>");
			sel_num = scan.nextInt();

			switch (sel_num) {

			case 1:
				System.out.println("[[[[[ �Է�â ]]]]]");
				// �Է�
				for (int i = 0; i < s.length; i++) {
					s[i] = new Student();
					System.out.println("�̸��� �Է��ϼ���.>>");
					s[i].number = i + 1;
					s[i].name = scan.next();
					System.out.println("���� �����͸� �Է��ϼ���.>>");
					s[i].kor_score = scan.nextInt();
					System.out.println("���� �����͸� �Է��ϼ���.>>");
					s[i].eng_score = scan.nextInt();
					System.out.println("���� �����͸� �Է��ϼ���.>>");
					s[i].math_score = scan.nextInt();
					s[i].total = s[i].kor_score + s[i].eng_score + s[i].math_score;
					s[i].avg = s[i].total / 3.0;
				}
				break;
			case 2:
				System.out.println("[[[[[ ���â ]]]]]");
				// ���
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
				System.out.println("���ó��â");
				// ���ó��
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
				System.out.println("[[[[[ ����â ]]]]]");
				System.out.println("�̸��� �Է��ϼ���.>>");
				search = scan.next();
				count=0; // ���� �̸��� ������ 1, ������ 0
				for(int i=0;i<s.length;i++) {
					if(search.equals(s[i].name)) {
						System.out.println("��ġ�ϴ� �����Ͱ� �ֽ��ϴ�.^^");
						search_num=i; //���°�� ���������Ͱ� �ִ� Ȯ��
						count++;
						break;
					}
				}
				
				//�����Ͱ� �ִ��� ������ Ȯ��
				if(count==0) {
					System.out.println("�����Ͱ� �����ϴ�.");
					break;
				}else {
					System.out.println("��������� �����Ͻðڽ��ϱ�?");
					System.out.println("1.����");
					System.out.println("2.����");
					System.out.println("3.����");
					System.out.println("0.����ȭ��");
					System.out.println("--------");
					System.out.println("���ϴ� ��ȣ�� �Է��ϼ���>>");
					sel_num = scan.nextInt();
					
					switch(sel_num) {
					case 1:
						System.out.println("�������� �Է��ϼ���.>>");
						s[search_num].kor_score=scan.nextInt();
						s[search_num].total = s[search_num].kor_score + s[search_num].eng_score + s[search_num].math_score;
						s[search_num].avg = s[search_num].total / 3.0;
						System.out.println("�������� ������ �Ϸ�Ǿ����ϴ�.");
						break;
                    case 2:
                    	System.out.println("�������� �Է��ϼ���.>>");
						s[search_num].eng_score=scan.nextInt();
						s[search_num].total = s[search_num].kor_score + s[search_num].eng_score + s[search_num].math_score;
						s[search_num].avg = s[search_num].total / 3.0;
						System.out.println("�������� ������ �Ϸ�Ǿ����ϴ�.");
						break;
                    case 3:
                    	System.out.println("�������� �Է��ϼ���.>>");
						s[search_num].math_score=scan.nextInt();
						s[search_num].total = s[search_num].kor_score + s[search_num].eng_score + s[search_num].math_score;
						s[search_num].avg = s[search_num].total / 3.0;
						System.out.println("�������� ������ �Ϸ�Ǿ����ϴ�.");
						break;
                    case 0:
						System.out.println("����ȭ������ �̵��մϴ�.");
						break;
					
					}
					
					
					
					
				}
				
				
				
				
				
				
				
				
				
				
				break;
			case 0:
				System.out.println("����");
				break loop1;

			}

		}


		

//		for(int i=0;i<name1.length;i++) {
//			score1[i][0] = i+1;
//			System.out.println("�̸��� �Է��ϼ���.>>");
//			name1[i] = scan.next(); 
//			//score0-��ȣ,1-����,2-����,3-����,4-�հ�,5-���
//			for(int j=0;j<3;j++) {
//				System.out.println("�����͸� �Է��ϼ���.>>");
//				score1[i][j+1]=scan.nextInt();
//			}
//			score1[i][4] = score1[i][1]+score1[i][2]+score1[i][3];
//			avg1[i] = score1[i][4]/3.0;
//			
//		}

	}

}
