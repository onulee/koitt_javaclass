import java.util.Scanner;

public class Ex1005_04 {

	
//	public static void main(String[] args) {
//		System.out.println("두수의 더하기(3+5) : "+add(3,5));
//		System.out.println("두수의 빼기(3-5) : "+sub(3,5));
//		System.out.println("두수의 곱하기(3*5) : "+multi(3,5));
//		System.out.printf("두수의 나누기(3/5) : %.2f \n",div(3,5));
//	}
//	
//	static int add(int a,int b) {
//		return a+b;
//	}
//	
//	static int sub(int a,int b) {
//		return a-b;
//	}
//	
//	static int multi(int a,int b) {
//		int result = a*b;
//		return result;
//	}
//	static double div(int a,int b) {
//		return a/(double)b;
//	}
	
	
	public static void main(String[] args) {
		Number num = new Number();
		Scanner scan = new Scanner(System.in);
		Ex1005_04.max(10,3,num);
		System.out.printf("큰수 :%d, 작은수 :%d",num.max_num,num.min_num);
	}
	
	static void max(int a,int b,Number num) {
		if(a>b) {
			num.max_num = a;
			num.min_num = b;
		}else {
			num.max_num = b;
			num.min_num = a;
		}
		
	}
	

}
