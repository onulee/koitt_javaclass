import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex1021_05 {

	public static void main(String[] args) {
		// id,password 5개
		// id String password int
		// aaa 1234 
		// 출력해보세요.
		
		HashMap map = new HashMap();
		map.put("aaa",1234);
		map.put("bbb",2345);
		map.put("ccc",3456);
		map.put("ddd",4567);
		map.put("eee",5678);
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey()+","+e.getValue());
		}
		

	}

}
