import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex1021_04 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "홍길동");
		map.put(2, "유관순");
		map.put(3, "이순신");
		map.put(4, "강감찬");
		map.put(5, "김구");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e =(Map.Entry) it.next();
			System.out.println(e.getKey()+","+e.getValue());
		}
		
		System.out.println(set);
		

	}

}
