import java.util.Scanner;

public class Ex0929_06 {

	public static void main(String[] args) {
		// Grade Ŭ������ ����
		// �հ�, ��� 2���� �޼ҵ带 ����ϴ�. �Ű������� 3��
		// Student Ŭ���� 3���� �л����� ����,����,����
		// main�޼ҵ忡���� 3���� �����͸� �Է¹޾Ƽ�
		// �հ�ȣ��, ���ȣ���ؼ� ������� ����Ͻÿ�.
		//�����
		Scanner scan = new Scanner(System.in);
		Grade grade = new Grade();
		Student[] stu = new Student[3];
		String[] index = { "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		int count=1;
		
		// Student��ü����
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
		}

		// Student��ü ������ �Է�
		for(int i=0;i<stu.length;i++) {
			stu[i].number = i+1;
			System.out.println("�̸��� �Է��ϼ���>>");
			stu[i].name = scan.next();
			System.out.println("�������� �Է��ϼ���.>>");
			stu[i].kor_score = scan.nextInt();
			System.out.println("�������� �Է��ϼ���.>>");
			stu[i].eng_score = scan.nextInt();
			System.out.println("�������� �Է��ϼ���.>>");
			stu[i].math_score = scan.nextInt();
			stu[i].total = grade.total(stu[i].kor_score, stu[i].eng_score, stu[i].math_score);
			stu[i].avg = grade.avg(stu[i].kor_score, stu[i].eng_score, stu[i].math_score);
		}
		
		//���ó��
		for (int i = 0; i < stu.length; i++) {
			for(int j=0;j<stu.length;j++) {
				if(stu[i].total<stu[j].total) {
					count++;
				}
			}
			stu[i].rank=count;
			count=1;
		}
		
		//���
		System.out.println("[ ����ó�� ���α׷� ]");
		for(int i=0;i<index.length;i++) {
			System.out.print(index[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].number+"\t");
			System.out.print(stu[i].name+"\t");
			System.out.print(stu[i].kor_score+"\t");
			System.out.print(stu[i].eng_score+"\t");
			System.out.print(stu[i].math_score+"\t");
			System.out.print(stu[i].total+"\t");
			System.out.print(stu[i].avg+"\t");
			System.out.print(stu[i].rank+"\t");
		    System.out.println();
		}


	}

}
