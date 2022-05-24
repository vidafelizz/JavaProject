package ch04;

import java.util.Scanner;

// 팩토리얼 ex) 3! = 1x2x3
public class Factorial {
	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			fact *= i; 
		}
		System.out.printf("%d!은 %d 입니다.", n, fact);
	}
}