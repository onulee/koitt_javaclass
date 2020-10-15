import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1015_04 {

	public static void main(String[] args) {
		
		//Date °´Ã¼
		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		String num = sdf1.format(d);
		
		//Calendar °´Ã¼
		//Calendar c = new Calendar();
		Calendar c1 = Calendar.getInstance();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(c1.getTime()));
		
		int count=1000;
		
		String orderNum = num+(count+1);
		System.out.println(orderNum);
		
		//201803121001 -> 20201015+

	}

}
