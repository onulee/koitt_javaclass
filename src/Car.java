
public class Car {
	
	Car(){ 
		this("»Úªˆ","ø¿≈‰",4);
	};
	
	Car(String c,String gearType,int door){
		this.color=color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car i){
		this(i.color,i.gearType,i.door);
	}
	
	String color;
	String gearType;
	int door;
	
	

}
