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
			System.out.println("���̵� �Է��ϼ���.>>");
			id=scan.nextLine().trim();
			System.out.println("�н����带 �Է��ϼ���.>>");
			pw=scan.nextLine().trim();
			
			//���̵� üũ
			if(map.containsKey(id)) {
				System.out.println("ID�� �����մϴ�.");
				//�н����� üũ
				if(map.get(id).equals(pw)) {
					System.out.println("�н����嵵 ��ġ�մϴ�.!");
					break;
				}else {
					System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.�ٽ��Է��ϼ���.!");
					continue;
				}
			}else {
				System.out.println("ID�� �������� �ʽ��ϴ�. �ٽ��Է��ϼ���.!");
				continue;
			}
		}//while
		
		//��ü���
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry) it.next();
			System.out.println(e.getKey()+","+e.getValue());
			
		}
		
		

	}

}
