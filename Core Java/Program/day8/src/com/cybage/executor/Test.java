package com.cybage.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String args[])
	{
		ExecutorService threadpool = Executors.newFixedThreadPool(5);
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
		threadpool.execute(new Task());	
	}
}
