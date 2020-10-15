import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1015_03 {

	public static void main(String[] args) {
		// 주문객체 : Order
		// 3개를 입력해서 출력을 해보세요.
		// ArrayList
		Date d = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String str = sdf.format(d);
		System.out.println(str);
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		String str2 = sdf.format(cal.getTime());
		System.out.println(str2);
	}

}
