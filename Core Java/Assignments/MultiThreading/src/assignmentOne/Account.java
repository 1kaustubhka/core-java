package assignmentOne;

public class Account {
	private int balance = 30000;
	
	public synchronized void withdraw(int amount) {
		
		System.out.println("performing withdrawl operation");
		
		//logic for withdrawl
		if(this.balance <= amount) {
			//need to keep withdraw in waiting state till deposit happens
			System.out.println("low account balance...");
			try {
				wait();				//waiting for other method to finish
			} catch (InterruptedException e) {
				System.err.println(e.getLocalizedMessage());
			}
		}
		this.balance -= amount;
		
		System.out.println("withdrawl operation finished. New Bal: "+balance);
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("performing deposit operation");
		
		//logic for deposit		
		this.balance += amount;
		notify();	//i have finished.. so waiting thread can resume execution
		
		System.out.println("deposit operation finished  New Bal: "+balance);
	}

}