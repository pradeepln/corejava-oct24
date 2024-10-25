package com.cisco.training.threads;

import java.util.concurrent.Callable;

public class PrimeCounterCallableTask implements Callable<Long> {
	
	

	long begin,end;

	public PrimeCounterCallableTask(long begin, long end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	@Override
	public Long call() {
		long count = 0;
		System.out.println("Beginning to count primes from "+begin+" to "+end+" in "+Thread.currentThread().getName());
		for(long i = begin; i <= end; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		System.out.println("Finished counting in "+Thread.currentThread().getName()+" and found "+count+" primes");
		return count;
	}
	
	public static boolean isPrime(long num) {
		if (num <= 2) {
			return true;
		}
		for (long i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
}
