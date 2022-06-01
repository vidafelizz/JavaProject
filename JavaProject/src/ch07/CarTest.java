package ch07;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar.toString());
		myCar.color = "white";
		myCar.speedUp();
		myCar.changeGear(1);
		System.out.println(myCar);
	}
}