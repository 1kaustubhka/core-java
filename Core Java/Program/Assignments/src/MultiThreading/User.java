package MultiThreading;

public class User extends Thread{
	Account a1;
	public User(Account acc)
	{
		this.a1=acc;
	}
	@Override
	public void run() {
		int i = 0;
		while(i<5)
		{
			System.out.println("money in account: "+a1.getMoney());
		System.out.println(a1.withdraw(500));
		i++;
		}
	}
}
