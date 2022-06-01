package ch06;

public class PointEx {
	// 전역변수(멤버변수)
	static String[] name = {"홍길동", "이몽룡", "이순신", "차두리", "박지성"};
	static int[] kor = {80,90,100,60,70};
	static int[] eng = {90,70,80,60,77};
	static int[] mat = {83,66,87,90,70};
	static int[] tot = {0,0,0,0,0};
	static double[] avg = {0.0,0.0,0.0,0.0,0.0};

	static void getTot() {
		for(int i=0; i<name.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
		}
	}
	static void getAvg() {
		for(int i=0; i<name.length; i++) {
			avg[i] = tot[i]/3.0;
		}
	}
	static void print() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	public static void main(String[] args) {
		getTot(); // 총점계산
		getAvg(); // 평균계산
		print();  // 출력
	}
}