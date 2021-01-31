package assignmentOne;

public class Manager extends Employee{
	int allowance;

	public Manager(int id, String name, int days, int wage, int allowance) {
		super(id, name, days, wage);
		this.allowance = allowance;
	}

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	@Override
	int calculateSalary()
	{
		return getDays()*getWage()+getAllowance();
		
	}
	

}
