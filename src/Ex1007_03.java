
public class Ex1007_03 {

	public static void main(String[] args) {
		
		// TV,냉장고,세탁기,냉장고,스마트폰, 스마트폰,세탁기,TV,세탁기
		// 스마트폰,냉장고,냉장고,스마트폰,세탁기
		// 일련번호  제품번호 이름 screen frozen motor cpu
		
		Electronic tv1 = new Electronic("TV", 1);
		System.out.printf("%d\t%d\t%s\t%d\n",tv1.serialNo,tv1.tvNo,tv1.name,tv1.screen);
		Electronic ref1 = new Electronic("냉장고", 1.0);
		System.out.printf("%d\t%d\t%s\t%f\n",ref1.serialNo,ref1.refrigeratorNo,ref1.name,ref1.frozen);
		Electronic wash1 = new Electronic("세탁기", true);
		Electronic ref2 = new Electronic("냉장고", 1.0);
		System.out.printf("%d\t%d\t%s\t%f\n",ref2.serialNo,ref2.refrigeratorNo,ref2.name,ref2.frozen);
		Electronic smart1 = new Electronic("스마트폰", "퀄컴");
		Electronic smart2 = new Electronic("스마트폰", "삼성cpu");
		Electronic wash2 = new Electronic("세탁기", true);

		Electronic tv2 = new Electronic("TV", 1);
		System.out.printf("%d\t%d\t%s\t%d\n",tv2.serialNo,tv2.tvNo,tv2.name,tv2.screen);
		Electronic wash3 = new Electronic("세탁기", true);
		Electronic smart3 = new Electronic("스마트폰", "퀄컴");
		Electronic ref3 = new Electronic("냉장고", 1.0);
		System.out.printf("%d\t%d\t%s\t%f\n",ref3.serialNo,ref3.refrigeratorNo,ref3.name,ref3.frozen);
		Electronic ref4 = new Electronic("냉장고", 1.0);
		System.out.printf("%d\t%d\t%s\t%f\n",ref4.serialNo,ref4.refrigeratorNo,ref4.name,ref4.frozen);
		Electronic smart4 = new Electronic("스마트폰", "퀄컴");
		Electronic wash4 = new Electronic("세탁기", true);
		
		
		
		
		
		
	}

}
