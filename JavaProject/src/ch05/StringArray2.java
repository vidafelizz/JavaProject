package ch05;

//for each문(향상된 for문)
// for(데이터타입 개별값 저장 변수 : 집합변수)
// ++ 가 내부적으로 작동되는 매카니즘
public class StringArray2 {
	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "Spring"};
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		for(String ss : str) {
			System.out.print(ss + " ");
		}
	}
}