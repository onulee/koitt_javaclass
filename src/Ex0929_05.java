import java.util.Scanner;

public class Ex0929_05 {

	public static void main(String[] args) {
		// Grade Ŭ������ ����
		// �հ�, ��� 2���� �޼ҵ带 ����ϴ�. �Ű������� 3��
		
		//main�޼ҵ忡���� 3���� �����͸� �Է¹޾Ƽ�
		// �հ�ȣ��, ���ȣ���ؼ� ������� ����Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		Grade grade = new Grade();
		Student[] stu = new Student[3];
		
		
		
		
		String[] index = {"��ȣ","�̸�","����","����","����","�հ�","���","���"};
		
		int num = 1;
		System.out.println("�̸��� �Է��ϼ���>>");
		String name=scan.next();
		System.out.println("�������� �Է��ϼ���.>>");
		int kor_score = scan.nextInt();
		System.out.println("�������� �Է��ϼ���.>>");
		int eng_score = scan.nextInt();
		System.out.println("�������� �Է��ϼ���.>>");
		int math_score = scan.nextInt();
		int total = grade.total(kor_score,eng_score,math_score);
		double avg=grade.avg(kor_score, eng_score, math_score);
		
		System.out.println("[ ����ó�� ���α׷� ]");
		for(int i=0;i<index.length;i++) {
			System.out.print(index[i]+"\t");
		}
		System.out.println();
		
		System.out.print(num+"\t");
		System.out.print(name+"\t");
		System.out.print(kor_score+"\t");
		System.out.print(eng_score+"\t");
		System.out.print(math_score+"\t");
		System.out.print(total+"\t");
		System.out.print(avg+"\t");
		
		
		
		

	}

}
