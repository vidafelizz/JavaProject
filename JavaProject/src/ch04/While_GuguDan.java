package ch04;

public class While_GuguDan {
	public static void main(String[] args) {
		int dan = 2;
		int n = 1;
		while(dan<=9) {
			System.out.println();
			System.out.println("** " + dan + "단 **");
			while(n<=9) {
				System.out.println(dan + "x" + n + "=" + dan*n);
				n++;
			}
			n = 1; // n을 1로 초기화 시켜주지 않으면 2단 연산 이후의 while문이 안 돌음
			dan++;
		}
	}
}