package ch08;

public class Person {
	private String name;
	private int height;
	private int weight;
	
	public Person() {
		this("김철호",170,60);
	}
	
	public Person(String name) {
		this(name,190,100);
	}
	public Person(String name, int height) {
		this(name, height, 70);
	}
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("===신상정보===");
		System.out.println("이름 : " + name );
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
		System.out.println();
	}
}