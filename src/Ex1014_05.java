import java.util.Scanner;

public class Ex1014_05 {

	public static void main(String[] args) {
		
		// 국어:90
		// 영어:100
		// 수학:98
		// 합계:계산해서 넣기
		// 평균:계산해서 넣기
		// 출력을 해보세요. 
		//split() 함수를 사용해서 출력해보세요.
		
		String subject="국어,영어,수학";
		String score="90,100,98";
		int sum=0;
		double avg=0;
		
		String[] subject2 =subject.split(",");
		String[] score2 = score.split(",");
		
		for(int i=0;i<subject2.length;i++) {
			System.out.printf("%s:%s \n",subject2[i],score2[i]);
			sum += Integer.parseInt(score2[i]);
		}
		avg = sum/(double)(subject2.length);
		
		System.out.printf("합계:%d \n",sum);
		System.out.printf("평균:%.2f \n",avg);
		
		
		

	}

	

}
