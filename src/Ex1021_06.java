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
		
		System.out.println("���̵� �Է��ϼ���.>>");
		String id = scan.nextLine().trim();
		System.out.println("�н����带 �Է��ϼ���.>>");
		String pw = scan.nextLine().trim();
		
		if(map.containsKey(id)) {
			System.out.println("�Է��� ID�� �����մϴ�.");
			if((map.get(id)).equals(pw)) {
				System.out.println("�н����尡 ��ġ�մϴ�.");
			}else {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("�Է��� ID�� �������� �ʽ��ϴ�.");
		}
		
		
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey()+","+e.getValue());
		}
		

	}

}
