
public class Ex0924_02 {

	public static void main(String[] args) {
		// 1857440 - 주택복권(랜덤숫자로 넣어주세요.0-9까지의 숫자)  
		// 1987550 - 입력값 - 2자리 숫자가 맞았습니다.
		//----------------
		// oxxoxxo
		
		String[] str = {"이름","국어","영어","수학","과학"};
		String name="홍길동";
		int[] score= {100,100,90,100};
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+"\t");
		}
		System.out.println();
		System.out.print(name+"\t");
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+"\t");
		}

	}

}
