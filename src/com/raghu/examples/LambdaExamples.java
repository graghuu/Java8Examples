/**
 *  This class will have the lambdas expressions usage in Java 8 with 
 *  examples
 */
package com.raghu.examples;

/**
 * @author Raghu
 *
 */
public class LambdaExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Old way of creating thread class
		new Thread(new Runnable() {
			public void run() {
				System.out.println("inside run method, without lambda");
			}
		}).start();
		// using lambda expression
		new Thread(() -> System.out.println("inside run method, using lambda")).start();
	}

}
