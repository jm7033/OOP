package hello;

public class Car {
	String color; //색상
	int speed; //속도
	int gear; //기어
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear=g;
	}
	

	void speedUp(int s) {
		speed = s+10;
	}
	
	void speedDown(int s) {
		speed=s-10;
	}

}


