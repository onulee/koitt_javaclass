
public class Ex0924_02 {

	public static void main(String[] args) {
		// 1857440 - ���ú���(�������ڷ� �־��ּ���.0-9������ ����)  
		// 1987550 - �Է°� - 2�ڸ� ���ڰ� �¾ҽ��ϴ�.
		//----------------
		// oxxoxxo
		
		String[] str = {"�̸�","����","����","����","����"};
		String name="ȫ�浿";
		int[] score= {100,100,90,100};
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		System.out.print(name+"\t");
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}

	}

}
