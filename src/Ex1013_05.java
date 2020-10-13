
public class Ex1013_05 {

	public static void main(String[] args) {
		// Electronic 클래스 1개 - power,socket 220 
		// Refrigerator, Computer, Washer, Tv
		// cold-boolean /  monitor,keyboard,mouse / wash / channel, caption
		
		// 냉장고 1개 객체생성
		// 전자 1개 객체생성
		// 전자2 1개 참조변수만 생성
		// 컴퓨터 참조변수만 생성
		// 세탁기 1개 객체생성
		// 컴퓨터2 1개 객체생성
		Refrigerator ref1 = new Refrigerator();
		Electronic e1 = new Electronic();
		Electronic e2=null;
		Computer c1 = null;

		Washer w1 = new Washer();
		Computer c2 = new Computer();
		// 냉장고 참조변수 전자에 변환
		// 냉장고2 객체 생성
		// 전자의 참조변수 냉장고2에 변환
		// 냉장고2에서 냉동기능 출력
		e2 = ref1; //e2 = new Refrigerator();
		
		if(w1 instanceof Electronic) {
			e2 = w1;
		}
		
		if(e2 instanceof Refrigerator) {
			System.out.println("냉장고 객체가 e2에 들어가 있습니다.");
		}
		
		if(e2 instanceof Washer) {
			System.out.println("세탁기 객체가 e2에 들어가 있습니다");
		}
		
		if(e2 instanceof Electronic) {
			System.out.println("전자 객체가 e2에 들어가 있습니다.");
		}
		
		
		
		Refrigerator ref2 = new Refrigerator();
		
//		ref2 =(Refrigerator) e1;
//		System.out.println(ref2.cold);
		
//		ref2=(Refrigerator)e2;
//		System.out.println(ref2.cold);
		
		

	}

}
