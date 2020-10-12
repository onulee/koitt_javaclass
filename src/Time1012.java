
public class Time1012 {
	private int hour;
	private int minute;
	private int second;
	
	Time1012(){};
	Time1012(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour>=0 && hour<24) {
			this.hour = hour;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute>=0 && minute<60)
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void setSecond() {
		if(second>=0 && second<60) {
			this.second = second;
		}
	}
	
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	

}
