package assignmentOne;

public class SalesManager extends Manager{
	int commission;
	public SalesManager(int id, String name, int days, int wage, int allowance, int commission) {
		super(id, name, days, wage, allowance);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}

	@Override
	int calculateSalary()
	{
		return getDays()*getWage()+getAllowance()+getCommission();
		
	}
	
	
}
