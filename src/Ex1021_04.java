import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex1021_04 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "ȫ�浿");
		map.put(2, "������");
		map.put(3, "�̼���");
		map.put(4, "������");
		map.put(5, "�豸");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry) it.next();
			System.out.println(e.getKey()+","+e.getValue());
		}
		
		System.out.println(set);
		

	}

}
