package ch06;

import java.util.Scanner;

public class HolidayEx {
	static int y; // 전역변수, 멤버변수(클래스 전체에서 사용할 수 있는변수)
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요 : ");
		y = sc.nextInt();
		sc.close();
	}
	static int holiday(int year) {
		int day = 0; // day는 지역변수(로컬변수)로 메소드 내에서만 사용 가능
		if(year <= 5) {
			day = 10;
		} else if(year <= 10) {
			day = 15;
		} else {
			day = 20;
		} return day;
	}
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수 : " + holiday(y));
	}
}