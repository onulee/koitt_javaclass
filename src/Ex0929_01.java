public class Ex0929_01 {
	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1 :"+c1.kind+", "+c1.number);
		System.out.println("c1.width : "+c1.width);
		System.out.println("c1.height : "+c1.height);
		System.out.println("c2 :"+c2.kind+", "+c2.number);
		System.out.println("c2.width : "+c2.width);
		System.out.println("c2.height : "+c2.height);
		System.out.println("------------------------");
		c1.width=50;
		c1.height=80;
		System.out.println("c1.width : "+c1.width);
		System.out.println("c1.height : "+c1.height);
		System.out.println("c2.width : "+c2.width);
		System.out.println("c2.height : "+c2.height);

	}
	

}
