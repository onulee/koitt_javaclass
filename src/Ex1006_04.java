import java.util.Scanner;

public class Ex1006_04 {
	static int count=0;

	public static void main(String[] args) {
		add(5,3);
		System.out.println(count);

	}
	
	static void add(int x,int y) {
		count = x+y;
		
	}

}
