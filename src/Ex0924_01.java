import java.util.Scanner;

public class Ex0924_01 {

	public static void main(String[] args) {
		// 1-100���� �������� ���߱� ����
		
		
		// 1.1-100���� �������� -> ���ѹݺ� -> �����Է� 
		// 0�� ������ ���� -> ũ��,�۴�,���� -> ������ ���� -> ���
		//��������
		int sel_num = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		int in_num=0;
		String in_str="";
		char in_ch=' ';
		int[] save_num = new int[10];
		int i=0;
		
		while(true) {
			// �����Է�
			System.out.println("���ڸ� �Է��ϼ���(����:0)>>");
//			in_str = scan.nextLine();
//			in_num = Integer.parseInt(scan.nextLine());
			
			in_ch = scan.next().charAt(0);
			in_num = in_ch - '0';
			
			save_num[i] = in_num; 
			// 0�� ������ ����
			if(in_num==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			// ũ��,�۴�,����
			if(in_num==sel_num) {
				System.out.println("�����Դϴ�.");
				break;
			}else if(in_num>sel_num) {
				System.out.println("���� ���� �Է��ϼ���.");
			}else {
				System.out.println("ū���� �Է��ϼ���.");
			}
			i++;
		}
		
		//���
		System.out.println("���� : "+sel_num);
		System.out.println("�ѽõ� Ƚ�� :"+ (i+1));
		System.out.print("�õ��ߴ� ���� : ");
		for(int j=0;j<=i;j++) {
			System.out.print(save_num[j]+" ");
		}
		System.out.println();
		

	}

}
