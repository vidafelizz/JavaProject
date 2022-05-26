package ch04;

import java.util.Scanner;

public class BreakAVG {
	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하세요(종료:음수) : ");
			int score = sc.nextInt();
			if(score < 0) break; // 음수 입력해야 종료
			total += score;
			count++;
		}
		System.out.println("평균은 " + total/count);
		sc.close();
	}
}