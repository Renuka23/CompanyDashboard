package company;

import java.util.ArrayList;

public class DepartmentImpl implements Department {

	private String departmentName;
	
	ArrayList<EmployeeImpl> employees;

	public DepartmentImpl(String departmentName, ArrayList<EmployeeImpl> employees) {
		super();
		this.departmentName =departmentName;
		this.employees = employees;
	}

	@Override
	public double totalSalaryPayments() {
		double sum = 0;
		for (EmployeeImpl employee : employees) {
		 sum = sum + employee.getSalary();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuffer name = new StringBuffer("DepartmentName: "+ departmentName);
		for (EmployeeImpl employee: employees) {
			name.append("\n" + employee );
		}
		return name.toString();
	}
	
}
