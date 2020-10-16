public class Student {
	
	String stu_id; //202010001
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	String date; //2020-10-16
	
	Student(){};
	Student(String stu_id,String name,int kor,int eng,int math,int total,double avg,int rank){
		this.stu_id = stu_id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
	
	public String toString() {
		return stu_id+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+rank+"\n";
	}
	
	
	public boolean equals(Object obj) {
		boolean check=false;
		if(obj!=null && obj instanceof Student) {
			if(stu_id == ((Student)obj).stu_id) {
				check=true;
			}else {
				check=false;
			}
		}
		return check;
	}
	
	

}
