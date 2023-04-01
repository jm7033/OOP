package hello;

public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //객체 생성
		
		myCar.color="red";
		myCar.changeGear(2); //객체의 메소드 호출
		myCar.speedUp(70); //객체의 메소드 호출
		System.out.println(myCar); //toString()호출

	}

}
