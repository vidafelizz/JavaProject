package ch02;

// String은 문자열을 다루는 데이터타입
// char는 반드시 작은따옴표로 단문자만 다루는 데이터타입
public class StringEx01 {
	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		char a = '홍';
		System.out.println("당신의 성은 " + a + "입니다.");
	}
}
