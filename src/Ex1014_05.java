import java.util.Scanner;

public class Ex1014_05 {

	public static void main(String[] args) {
		
		// ����:90
		// ����:100
		// ����:98
		// �հ�:����ؼ� �ֱ�
		// ���:����ؼ� �ֱ�
		// ����� �غ�����. 
		//split() �Լ��� ����ؼ� ����غ�����.
		
		String subject="����,����,����";
		String score="90,100,98";
		int sum=0;
		double avg=0;
		
		String[] subject2 =subject.split(",");
		String[] score2 = score.split(",");
		
		for(int i=0;i<subject2.length;i++) {
			System.out.printf("%s:%s \n",subject2[i],score2[i]);
			sum += Integer.parseInt(score2[i]);
		}
		avg = sum/(double)(subject2.length);
		
		System.out.printf("�հ�:%d \n",sum);
		System.out.printf("���:%.2f \n",avg);
		
		
		

	}

	

}
