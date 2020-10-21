
public class Buyer {
	
	private int c_id; //20201021 1001  //회원번호
	private int c_pw;
	private String name;
	private int money;
	private int bonusPoint;
	private String rank; // 
	private double rank_radio;
	
	Buyer(){
		this.money=1000;
		this.rank="silver";
		this.bonusPoint=0;
		this.rank_radio=0.01;
	};
	
	Buyer(int c_id,int c_pw,String name,int money,String rank){
		this.c_id=c_id;
		this.c_pw=c_pw;
		this.name=name;
		this.money=money;
		this.rank=rank;
		this.bonusPoint=0;
		if(rank.equals("VIP")) {
			this.rank_radio=0.05;
		}else if(rank.equals("GOLD")) {
			this.rank_radio=0.03;
		}else {
			this.rank_radio=0.01;
		}
	};
	

}
