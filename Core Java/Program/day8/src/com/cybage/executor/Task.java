package com.cybage.executor;

public class Task extends Thread{
	long sum=0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId()+" Adding numbers till 10000000 "+Thread.currentThread().getName());
		for(long i=0;i<10000000;i++)
		{
			sum+=i;
		}
		System.out.println(Thread.currentThread().getId()+" has performed Sum: "+sum);
	}

}
