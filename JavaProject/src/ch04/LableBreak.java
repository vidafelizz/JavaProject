package ch04;

public class LableBreak {
	public static void main(String[] args) {
		exit_for : // 레이블
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==3) break exit_for;
				System.out.println(i + "," + j);
			}
		}
	}
}