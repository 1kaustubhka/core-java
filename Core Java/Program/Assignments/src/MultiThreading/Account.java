package MultiThreading;

public class Account {
	int accountno;
	int money;
	
	public Account(int accountno, int money) {
		super();
		this.accountno = accountno;
		this.money = money;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", money=" + money + "]";
	}
	
	public synchronized String withdraw(int amm)
	{
		System.out.println(Thread.currentThread().getId()+"has ammount"+this.money);
		if(this.money-amm>0)
		{
		this.money=this.money-amm;
		return "Transaction Successful by "+Thread.currentThread().getId();
		}
		else
		{
			return "Not Sufficient Funds in "+Thread.currentThread().getId();
		}
	}
		
	
}
