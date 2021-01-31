package assignmentThree;

public class BankApplication {
	Customer c[] = new Customer[10];
	static int count = 0;
	static void increaseCount()
	{
		count++;
	}
	void addCustomer(String name, String address,int type)
	{
		if(type == 1)
		{
			c[count]=new Customer(name,address,new FixedDepositAcc(10000+count,1000,1000,"FixedDeposit"));	
		}
		else if(type ==2)
		{
			c[count]=new Customer(name,address,new FixedDepositAcc(10000+count,1000,1000,"FixedDeposit"));
		}
		BankApplication.increaseCount();
	}
	
	void display()
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(c[i].getName());
		}
	}
	
	void withdrawMoney(int an,int am)
	{
		c[an-100000].getAcc().withdraw(am);
	}
}