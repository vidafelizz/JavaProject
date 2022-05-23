package ch03;

public class InCrease {
	public static void main(String[] args) {
		int i=5;
		int j=0;
		j = i++; // i의 값을 식을 계산한 후 1씩 증가
		System.out.println(i + "," + j);
		
		i=5;
		j=++i;	// i의 값을 1씩 먼저 증가한 후 계산
		System.out.println(i + "," + j);
	}
}
