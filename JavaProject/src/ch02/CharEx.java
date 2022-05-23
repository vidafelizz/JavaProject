package ch02;

// 유니코드 사이트: https://huskdoll.tistory.com/39
public class CharEx {
	public static void main(String[] args) {
		char aValue = '\uD64D';
		System.out.println("char형('\uD64D'): " + aValue);
		
		char bValue = '\uD64D';
		System.out.println("char형(\'\\uD64D'): " + bValue);
	}
}
