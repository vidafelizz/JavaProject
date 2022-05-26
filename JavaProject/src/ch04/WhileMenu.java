package ch04;

import java.util.Scanner;

public class WhileMenu {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1)아메리카노 (2)카페라떼 (3)에스프레소");
			System.out.println("원하는 메뉴(1~3)을 선택하세요.(종료:0)");
			String tmp = sc.next(); // 문자처리
			menu = Integer.parseInt(tmp); // 입력받은 문자를 숫자로 변환
			
			if(menu ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(menu<1 || menu>3) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
			System.out.println();
		}
		sc.close();
	}
}