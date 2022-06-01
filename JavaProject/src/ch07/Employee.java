package ch07;

public class Employee {
	private String name;
	private String part; 		// 부서
	private String position;    // 직위
	private int basic;		    // 기본급
	private int bonus; 		    // 보너스(기본급의 300%)
	private int total; 		    // 총액(기본급+보너스)
	private int tax; 		    // 세액(총액의 3.3%)
	private int salary;		    // 실수령액(총액-세액)

	public void input(String name, String part, String position, int basic) {
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;
	}
	public void calc() {
		bonus =basic*3;
		total = basic + bonus;
		tax = (int)(total*0.333);
		salary = total-tax;
	}
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액\t(단위:만원)");
		System.out.println("==============================================================");
		System.out.println(name+"\t"+part+"\t"+position+"\t"
		+basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}
}