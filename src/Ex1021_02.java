import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1021_02 {

	public static void main(String[] args) {
		
		Object[] arr= {"1","2","3","1","4","2","5","1","3","2"};
		HashSet set = new HashSet();
		
		set.add(arr[0]);
		set.add(arr[1]);
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		ArrayList list = new ArrayList();
//		HashSet set1 = new HashSet();
//		Collection c = list;
//		
//		c.add("1");
//		c.add("2");
//		c.add("3");
//		c.add("4");
//		c.add("5");
//		
//		Iterator it = c.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
