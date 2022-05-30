package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요 : ");
		int m = sc.nextInt();
		int n = 3;
		int[][] score = new int[m][n];
		System.out.println("국 영 수 점수를 각각 입력하세요 : ");
		
		for(int i=0; i<m; i++) {
			System.out.println((i+1) + "번 학생의 점수 : ");
			for(int j=0; j<n; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		System.out.println(("번호\t국어\t영어\t수학\t총점\t평균\t등급\t"));
		for(int i=0; i<score.length; i++) {
			int sum=0;
			float avg=0.0f;
			char grade = ' ';
			
			System.out.printf("%d\t", i+1); // 번호 출력
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			}
			avg = sum/(float)score[i].length;
			
			switch((int)(avg/10)) {
			case 10: 
			case 9: 
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';			
			}
			// 총점, 평균, 등급 출력
			System.out.printf("%d\t %.1f\t %s%n", sum, avg, grade);		
		}
	}
}