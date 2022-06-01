package ch07;

public class Car {
	// 멤버변수
	String color;
	int speed;
	int gear;
	
	// toString으로 출력형식 미리볼 수 있음
	// 오른쪽 마우스 클릭=> source=> Generate to String
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
}
