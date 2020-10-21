import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex1021_06 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("admin", "a1234");
		map.put("user_id", "aaa");
		map.put("koitt", "1234");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.>>");
		String id = scan.nextLine().trim();
		System.out.println("패스워드를 입력하세요.>>");
		String pw = scan.nextLine().trim();
		
		if(map.containsKey(id)) {
			System.out.println("입력한 ID가 존재합니다.");
			if((map.get(id)).equals(pw)) {
				System.out.println("패스워드가 일치합니다.");
			}else {
				System.out.println("패스워드가 일치하지 않습니다.");
			}
		}else {
			System.out.println("입력한 ID가 존재하지 않습니다.");
		}
		
		
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey()+","+e.getValue());
		}
		

	}

}
