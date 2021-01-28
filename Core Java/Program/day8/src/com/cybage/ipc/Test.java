package com.cybage.ipc;

public class Test {
	public static void main(String[] args){
	Account acc = new Account();
	new Thread() {
		public void run()
		{
			acc.withdraw(30000);
		};
	}.start();
	
	new Thread() {
		public void run()
		{
			acc.deposit(6000);
		};
	}.start();
}
}
