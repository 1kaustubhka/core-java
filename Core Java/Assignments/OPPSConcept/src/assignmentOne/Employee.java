package assignmentOne;

public class Employee {
	private int id;
	private String name;
	protected int days;
	protected int wage;
	
	
	public Employee(int id, String name, int days, int wage) {
		super();
		this.id = id;
		this.name = name;
		this.days = days;
		this.wage = wage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	int calculateSalary()
	{
		return getDays()*getWage();
		
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
}
