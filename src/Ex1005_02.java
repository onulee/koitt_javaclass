import java.util.Scanner;

public class Ex1005_02 {

	public static void main(String[] args) {
		// �л� 5���� ������ �� �Է�
		// 1,2,3,4,5
		// �������� 95,96,97..100
		// �������� ����
		// ��հ� �հ� �ڵ� ��� �Է�
		// ���
		// ��ȣ  �̸�   ����  ����    ���        �հ�
		// 01  ȫ�浿  95  95  95.00  190
		// 02  ������  96  96  96.00  192
		
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[5];
		String[] n = {"ȫ�浿","������","�̼���","�豸","������"};
		
		for(int i=0;i<stu.length;i++) {
			stu[i] = new Student();
			System.out.println("��ȣ�� �Է��ϼ���.>>");
			stu[i].number = scan.nextInt();
			System.out.println("�̸��� �Է��ϼ���.>>");
			stu[i].name = scan.next();
			System.out.println("���������� �Է��ϼ���.>>");
			stu[i].kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.>>");
			stu[i].eng = scan.nextInt();
			stu[i].total = stu[i].kor + stu[i].eng;
			stu[i].avg = stu[i].total/2.0;
			
		}
		
		for(int i=0;i<stu.length;i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %.2f \n",stu[i].number,stu[i].name,stu[i].kor,stu[i].eng,stu[i].total,stu[i].avg);
		}
		
		
		
		
		

	}

}
