package com.cybage.ipc;

public class Account {
	private int bal = 25000;
	
	public synchronized void withdraw(int amount)
	{
		if(this.bal<amount)
		{
			try {
				System.out.println("Low Account bal");
				wait();
			} catch (InterruptedException e) {
				System.err.println(e.getLocalizedMessage());
			}
		}
		this.bal-=amount;
		System.out.println("Money Withdrew: "+this.bal);
	}
	public synchronized void deposit(int amount)
	{
		this.bal+=amount;
		notify();
		System.out.println("Money Deposited: "+this.bal);
	}
}
