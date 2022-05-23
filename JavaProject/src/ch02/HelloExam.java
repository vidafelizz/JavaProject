package ch02;

//클래스의 이름은 반드시 대문자로 시작
//메소드의 이름은 반드시 소문자로 시작
//변수이름도 소문자로 시작
public class HelloExam {
	public static int sum(int n, int m) {
		return n+m; // return은 결과값을 호출한 쪽으로 반환한다.
	}
	public static void main(String[] args) {
		int i=200;
		int s;
		char a;
		
		s = sum(i,10);
		a = '?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
