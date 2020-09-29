
public class Ex0929_04 {

	public static void main(String[] args) {
		
		// MyMath 에서 add,sub,multi,div
		// main에서 10,5값을 매개변수로 입력하여
		// add,sub,multi,div 메소드 호출해서 값을 출력을 해보세요.
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
//		System.out.println("result 값 :"+mm.add(result, 5L));

	}

}
