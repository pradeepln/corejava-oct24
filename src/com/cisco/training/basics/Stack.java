package com.cisco.training.basics;

public interface Stack {
	
	void push(Object anElement);
	Object pop();
	
	default int size() {
		return -1;
	}
}
