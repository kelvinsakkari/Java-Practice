package com.test;

import com.queues.queueInJava;

public class queueTest {
	/**
	 *  @author Kelvin
	 */
	public static void main(String args[]) {
		queueInJava Queue = queueInJava.getStreamInstance();
 
		Queue.add("Crunchify");
		Queue.add("Google");
		Queue.add("Yahoo");
		Queue.add("Facebook");
		System.out.println("Initial Queue: " + Queue.get());
 
		Queue.remove("Google");
		System.out.println("After removing Google: " + Queue.get());
 
		System.out.println("totalSize: " + Queue.getTotalSize());
		System.out.println("isEmpty(): " + Queue.isEmpty());
 
		System.out.println("poll(): " + Queue.poll());
		System.out.println("After Polling: " + Queue.get());
	}

}
