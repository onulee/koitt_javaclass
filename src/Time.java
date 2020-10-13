public class Time {
	
	private int hour;
	private int minute;
	private int second;
	int day;
	
	Time(){};
	Time(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			return;
		}else {
			this.hour = hour;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			return;
		}else {
			this.minute = minute;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second<0 || second>59) {
			return;
		}else {
			this.second = second;
		}
	}
	
	

}
