package ch04;

public class ContinueEx2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2==0) continue;
			System.out.println("홀수 값: " + i);		
		}
	}
}