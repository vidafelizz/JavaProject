package ch07;

// 우리가 만든 클래스는 (객체형)데이터타입이 될 수 있다.
public class BoxTest {
	public static void main(String[] args) {
		Box b = new Box();
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 " 
				+ b.width + ", "+ b.length + ", " + b.height + "입니다.");
	}
}