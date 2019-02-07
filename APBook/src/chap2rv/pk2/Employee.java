package chap2rv.pk2;

public class Employee {
	private String name;
	private static int employeeCount = 0;

	public Employee(String name) {
		this.name = name;
		employeeCount++;
	}
}
