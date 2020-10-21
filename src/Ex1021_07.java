import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ex1021_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String id="",pw="";
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("admin", "1234");
		map.put("bbb", "123");
		map.put("ccc", "12");
		
		while(true) {
			System.out.println("아이디를 입력하세요.>>");
			id=scan.nextLine().trim();
			System.out.println("패스워드를 입력하세요.>>");
			pw=scan.nextLine().trim();
			
			//아이디 체크
			if(map.containsKey(id)) {
				System.out.println("ID가 존재합니다.");
				//패스워드 체크
				if(map.get(id).equals(pw)) {
					System.out.println("패스워드도 일치합니다.!");
					break;
				}else {
					System.out.println("패스워드가 일치하지 않습니다.다시입력하세요.!");
					continue;
				}
			}else {
				System.out.println("ID가 존재하지 않습니다. 다시입력하세요.!");
				continue;
			}
		}//while
		
		//전체출력
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry) it.next();
			System.out.println(e.getKey()+","+e.getValue());
			
		}
		
		

	}

}
