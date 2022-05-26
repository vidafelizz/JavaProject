package ch04;

public class ContinueEx1 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			// 조건식 코드 무시하고 다음 단계로 넘어간다
			if(i%5==0) continue; // 5의 배수 무시
			System.out.println(i);
		}
	}
}