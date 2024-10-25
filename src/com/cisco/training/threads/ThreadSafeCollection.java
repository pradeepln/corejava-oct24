package com.cisco.training.threads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollection {

	public static void main(String[] args) {
		
		Map<String,Integer> runs = Collections.synchronizedMap(new HashMap<>());
		
		
		Map<String,Integer> highPerfRuns = new ConcurrentHashMap<>();
		

	}

}
