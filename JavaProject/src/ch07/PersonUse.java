package ch07;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김철호");
		p1.setAge(20);
		p1.setHeight(180);
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		System.out.println("키 : " + p1.getHeight());
	}
}