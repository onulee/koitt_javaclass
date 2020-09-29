
public class Grade {

	int total(int a,int b,int c) {
		int result = a+b+c;
		return result;
	}
	
	double avg(int a,int b,int c) {
		double result=(a+b+c)/3.0;
		return result;
	}
	// rank 등수처리
	Student[] rank(Student[] stu) {
		int score1 = stu[0].total;
		System.out.println(stu[0].total);
		int score2 = stu[1].total;
		int score3 = stu[2].total;
		
		return stu;
		
	}
	
	
}
