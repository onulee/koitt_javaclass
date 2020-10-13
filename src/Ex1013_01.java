import p1013_01.Time2;

public class Ex1013_01 {

	public static void main(String[] args) {
		Time t1 = new Time(12,30,33);
		
		System.out.println("입력된 시간");
		System.out.println(t1.getHour()+":"+t1.getMinute()+":"+t1.getSecond());
		
		Time2 t2 = new Time2();
		t2.setHour(1);
		
		

	}

}
