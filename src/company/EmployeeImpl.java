package company;

public class EmployeeImpl implements Employee{

	private String name;
	private int grade;

	public EmployeeImpl(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public double getSalary() {
		return grade > 5 ? 150000 : 100000; // Ternary Operators
	}

	@Override
	public String toString() {
		return "Employee name : " + name + " Grade: " + grade;
	}

}
