
public class Ex1013_05 {

	public static void main(String[] args) {
		// Electronic Ŭ���� 1�� - power,socket 220 
		// Refrigerator, Computer, Washer, Tv
		// cold-boolean /  monitor,keyboard,mouse / wash / channel, caption
		
		// ����� 1�� ��ü����
		// ���� 1�� ��ü����
		// ����2 1�� ���������� ����
		// ��ǻ�� ���������� ����
		// ��Ź�� 1�� ��ü����
		// ��ǻ��2 1�� ��ü����
		Refrigerator ref1 = new Refrigerator();
		Electronic e1 = new Electronic();
		Electronic e2=null;
		Computer c1 = null;

		Washer w1 = new Washer();
		Computer c2 = new Computer();
		// ����� �������� ���ڿ� ��ȯ
		// �����2 ��ü ����
		// ������ �������� �����2�� ��ȯ
		// �����2���� �õ���� ���
		e2 = ref1; //e2 = new Refrigerator();
		
		if(w1 instanceof Electronic) {
			e2 = w1;
		}
		
		if(e2 instanceof Refrigerator) {
			System.out.println("����� ��ü�� e2�� �� �ֽ��ϴ�.");
		}
		
		if(e2 instanceof Washer) {
			System.out.println("��Ź�� ��ü�� e2�� �� �ֽ��ϴ�");
		}
		
		if(e2 instanceof Electronic) {
			System.out.println("���� ��ü�� e2�� �� �ֽ��ϴ�.");
		}
		
		
		
		Refrigerator ref2 = new Refrigerator();
		
//		ref2 =(Refrigerator) e1;
//		System.out.println(ref2.cold);
		
//		ref2=(Refrigerator)e2;
//		System.out.println(ref2.cold);
		
		

	}

}
