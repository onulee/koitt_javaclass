

import java.util.Scanner;

public class p0928_02 {

	public static void main(String[] args) {
		// �л������Է� ���α׷�
		// 1. �����Է� - ��ȣ,�л��̸�,����,����,���� -> �հ�,���,��� 0.������������ �̵�
		// 2. ������� - ������ ����� �ǰ� -> �ٽ���� 1, 0.���������� �̵�
		// 3. ���ó�� - ����Էµǰ� -> �ٽ��Է� 1, 0.���������� �̵�
		// 4. �������� - 1�� ��µǰ� ��ȣ�� �Է��ϸ� 1.����,2.����,3.���� -> �����Է��ϼ���.>> ��Ӽ����Ͻðڽ��ϱ�?1, 0.����������
		// �̵�
		// 0. ����
		
		//1. �����Է� - �л��̸�(string),���(double),��ȣ,��,��,��,�հ�,���(int)
		Scanner scan = new Scanner(System.in);
		String[] index= {"��ȣ","�̸�","����","����","����","�հ�","���","���"};
		String[] name = new String[3];
		double[] avg = new double[3];
		int[][] score = new int[3][6];
		int i=0;
		int j=0;
		
		// 3�� ->��ȣ(0),�̸�(0),����(1),����(2),����(3),�հ�(4),���(0),���(5)
		
		for(i=0;i<score.length;i++) {
		    System.out.println("��ȣ�� �Է����ּ���.>>");
			score[i][0]=scan.nextInt(); //��ȣ
			System.out.println("�̸��� �Է��ϼ���.>>");
			name[i]=scan.next();
			
			for(j=0;j<3;j++) {
				System.out.println(index[j+2]+"�����͸� �Է����ּ���.>>");
				score[i][j+1]=scan.nextInt();
			}
			score[i][4]=score[i][1]+score[i][2]+score[i][3];
			avg[i] = score[i][4]/3.0;
			j=1;
		}
		
		
		
		
		
		
		
		
//		while(i<3) {
//			score[i][0] = i+1; // ��ȣ �ڵ��ο�
//			System.out.println("�̸��� �Է��ϼ���.");
//			name[i]=scan.next();
//			while(j<3) {
//				System.out.println(index[j+2]+"�����͸� �Է��ϼ���.>>");
//				score[i][j+1] = scan.nextInt();
//				j++;
//			}
//			score[i][4]=score[i][1]+score[i][2]+score[i][3];
//			avg[i]=score[i][4]/3.0;
//			j=0;
//			i++;
//		}
		
		System.out.println("���");
		for(i=0;i<name.length;i++) {
			for(j=0;j<score[i].length;j++) {
				if(j==1) {
					System.out.print(name[i]+"\t"); //�̸�
				}	
				if(j==5) {
					System.out.print(avg[i]+"\t"); //���
				}
				System.out.print(score[i][j]+"\t");//��ȣ,����,����,����,�հ�,���
			}
		    System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
