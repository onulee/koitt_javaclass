
public class Ex0929_04 {

	public static void main(String[] args) {
		
		// MyMath ���� add,sub,multi,div
		// main���� 10,5���� �Ű������� �Է��Ͽ�
		// add,sub,multi,div �޼ҵ� ȣ���ؼ� ���� ����� �غ�����.
		long a=10L;
		long b=5L;
		MyMath mm = new MyMath();
		long result1 =mm.add(a, b);
		long result2 =mm.sub(a, b);
		long result3 =mm.multi(a, b);
		long result4 =mm.div(a, b);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		
//		MyMath mm = new MyMath();
//		long result = mm.add(1L, 2L);
//		System.out.println("result �� :"+mm.add(result, 5L));

	}

}
