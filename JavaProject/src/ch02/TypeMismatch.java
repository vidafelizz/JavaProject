package ch02;

// 데이터 타입 불일치
public class TypeMismatch {
	public static void main(String[] args) {
		byte n; // byte타입의 값은 -128~127까지만 값처리 됨
		n = 127;
		System.out.println(n);
	}
}
