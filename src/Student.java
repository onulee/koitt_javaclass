
public class Student {
	
	Student(){};  //�⺻������
	// �Ű����� 5�� �޴� ������
	Student(int number,String name,int kor,int eng,int math){
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	int number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

}
