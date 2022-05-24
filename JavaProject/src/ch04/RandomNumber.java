package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		// 난수를 발생시키는 랜덤 객체 생성
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("난수의 개수 : ");
		int count = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for(int i=0; i<count; i++) {
			int number = generator.nextInt(100); // 0~99 사이의 난수 발생
			System.out.println("생성된 난수 : " + number);
			sum += number;
		}
		System.out.println("난수 " + count + "개의 합 : " + sum);
	}
}