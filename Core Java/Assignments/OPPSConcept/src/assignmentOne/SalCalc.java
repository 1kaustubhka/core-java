package assignmentOne;

public class SalCalc {
	public static void main(String[] args) {
		Employee e = new Employee(101,"Kaus",31,300);
		Manager m = new Manager(102,"Kaustubh",31,300,25000);
		SalesManager sm = new SalesManager(103,"Rohan",31,300,25000,5000);
		System.out.println("Employee Salary: "+e.calculateSalary());
		System.out.println("Manager Salary: "+m.calculateSalary());
		System.out.println("SalesManager Salary: "+sm.calculateSalary());
	}
}
