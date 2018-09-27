package company;

import java.util.ArrayList;

public class DepartmentDashboard {
	
	public static void main(String[] args) {
		
		ArrayList<EmployeeImpl> salesEmployees = new ArrayList<>(3);
		salesEmployees.add(new EmployeeImpl("Alex", 7));
		salesEmployees.add(new EmployeeImpl("Sarah", 4));
		salesEmployees.add(new EmployeeImpl("John", 6));

		Department sales = new DepartmentImpl("Sales", salesEmployees);

		ArrayList<EmployeeImpl> ITEmployees = new ArrayList<>(2);
		ITEmployees.add(new EmployeeImpl("Jacob", 8));
		ITEmployees.add(new EmployeeImpl("Linda", 3));

		Department IT = new DepartmentImpl("IT", ITEmployees);

		ArrayList<EmployeeImpl> AccountsEmployees = new ArrayList<>(4);
		AccountsEmployees.add(new EmployeeImpl("Patrick", 6));
		AccountsEmployees.add(new EmployeeImpl("Paul", 8));
		AccountsEmployees.add(new EmployeeImpl("Tim", 4));
		AccountsEmployees.add(new EmployeeImpl("Renuka", 2));

		Department accounts = new DepartmentImpl("Accounts", AccountsEmployees);
		
		System.out.println(sales);
		System.out.println(sales.totalSalaryPayments());
		System.out.println("*******************************");
		System.out.println(IT);
		System.out.println(IT.totalSalaryPayments());
		System.out.println("*******************************");
		System.out.println(accounts);	
		System.out.println(accounts.totalSalaryPayments());
		System.out.println("********************************");
		
		double totalSpend = sales.totalSalaryPayments() + IT.totalSalaryPayments() + 
				accounts.totalSalaryPayments();
		System.out.println("Total spend:" + totalSpend);
		
	}
}
