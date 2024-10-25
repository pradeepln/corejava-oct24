package com.cisco.training.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		//bySubClassingThread();
		
		//byImplementRunnable();
		
		//byImplementRunnableAndPool();
		
		//byImplementCallableAndPool();

		byCallableLambdaAndPool();
	}

	
	private static void byCallableLambdaAndPool() throws Exception {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		long startTime = System.currentTimeMillis();
		System.out.println("Starting in "+Thread.currentThread().getName());
		
		
		
		Future<Long> f1 =  threadPool.submit(() -> PrimeUtil.countPrimes(1, 130_000));
		Future<Long> f2 = threadPool.submit(() -> PrimeUtil.countPrimes(130_001, 200_000));
		
		
		System.out.println("Total Count = "+ (f1.get()+f2.get()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
		
		threadPool.shutdown();
	}

	
	
	private static void byImplementCallableAndPool() throws Exception {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		long startTime = System.currentTimeMillis();
		System.out.println("Starting in "+Thread.currentThread().getName());
		
		PrimeCounterCallableTask task1 = new PrimeCounterCallableTask(1, 130_000);
		PrimeCounterCallableTask task2 = new PrimeCounterCallableTask(130_001, 200_000);
		
		Future<Long> f1 =  threadPool.submit(task1);
		Future<Long> f2 = threadPool.submit(task2);
		
		
		System.out.println("Total Count = "+ (f1.get()+f2.get()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
		
		threadPool.shutdown();
	}
	
	
	private static void byImplementRunnableAndPool() throws Exception {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		long startTime = System.currentTimeMillis();
		System.out.println("Starting in "+Thread.currentThread().getName());
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 130_000);
		PrimeCounterTask task2 = new PrimeCounterTask(130_001, 200_000);
		
		threadPool.execute(task1);
		threadPool.execute(task2);
		
		threadPool.shutdown();
		threadPool.awaitTermination(50, TimeUnit.SECONDS);
		
		System.out.println("Total Count = "+ (task1.getCount()+task2.getCount()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
	}

	private static void byImplementRunnable() throws Exception {
		long startTime = System.currentTimeMillis();
		System.out.println("Starting in "+Thread.currentThread().getName());
		
		PrimeCounterTask task1 = new PrimeCounterTask(1, 130_000);
		PrimeCounterTask task2 = new PrimeCounterTask(130_001, 200_000);
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Total Count = "+ (task1.getCount()+task2.getCount()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
	}

	private static void bySubClassingThread() throws Exception {
		
		long startTime = System.currentTimeMillis();
		System.out.println("Starting in "+Thread.currentThread().getName());
		
		PrimeCounterThread t1 = new PrimeCounterThread(1, 130_000);
		PrimeCounterThread t2 = new PrimeCounterThread(130_001, 200_000);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Total Count = "+ (t1.getCount()+t2.getCount()));
		
		long stopTime = System.currentTimeMillis();
		System.out.println("Took "+(stopTime - startTime)+" ms.");
	}

}
