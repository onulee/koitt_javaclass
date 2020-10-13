
public class Ex1013_03 {

	public static void main(String[] args) {
		Tv t1 = new Tv();  //t1 -> tv
		t1.channel=7;
		t1.channelUp();
		
		CaptionTv c3;
		c3=(CaptionTv)t1;  // CaptionTv c3 = new Tv();
		
		c3.text="자막 보기";
		

	}

}
