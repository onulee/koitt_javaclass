import java.util.HashSet;
import java.util.Iterator;

public class Ex1021_03 {

	public static void main(String[] args) {
		// 25자리 배열 -> 25개 랜덤으로 값을 넣기(1-25)
		// set -> 25개 랜덤 값을 넣기
		// 2개다 출력
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)((Math.random()*25)+1);
		}
		for(int i=0;i<num.length;i++) {
			System.out.print((i+1)+"번째 : ");
			System.out.println(num[i]);
		}
		
		HashSet set = new HashSet();
		for(int i=0;i<num.length;i++) {
			set.add((int)(Math.random()*25+1));
		}
		
		Iterator it = set.iterator();
		int i=1;
		while(it.hasNext()) {
			System.out.print(i+"번째 : ");
			System.out.println(it.next());
			i++;
		}
		
		System.out.println(set);

	}

}
