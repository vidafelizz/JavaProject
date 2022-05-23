package ch02;

//사각형의 넓이, 둘레를 구하기
public class Box {
	public static void main(String[] args) {
		double width;		// 가로
		double hight;		// 세로
		double area;		// 넓이
		double perimeter;	// 둘레
		
		
		width = 10.0;
		hight = 5.0;
		area = width * hight; // 넓이 계산
		System.out.println("사각형의 넓이 : " + area);
		
		perimeter = 2.0*(width + hight);
		System.out.println("사각형의 둘레 : " + perimeter);
	}
}
