package ch03;

// 자료형변환
public class CastEx {
	public static void main(String[] args) {
		float f = 1.6f; // 4바이트로 저장
		System.out.println(f);
		
		// 자동형(확장형) 변환
		// int형인 100이라는 정수값을 float형인 f가 자동으로 100.0으로 만든다.
		f = 100; 
		System.out.println(f);
		
		// 강제형변환
		// 큰값에서 작은값으로 변환할때는 강제형 변환을 개발자가 명시적으로 함
		f = 100.5f;
		int i = (int)f; 
		System.out.println(i);
	}
}
