
public class Ex1013_04 {

	public static void main(String[] args) {
		Car car=null;
		FireEngine fe = new FireEngine();
		fe.water();
		car = fe; //fe���� water����� ������
		// car.water();  // car���� water��ɾ�� ��� �Ұ���

		FireEngine fe2=null;
		fe2 =(FireEngine) car;
		// FireEngine fe2 = new FireEngine();
		fe2.water();
	}

}
