package app;

import lab04.Employees;

/**
 * Driver Class
 * Runs the Employees list and sort
 * @author Francisco Igor
 *
 */
public class Driver {

	/**
	 * Main application
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		
		Employees list=new Employees();
		System.out.println("Original List:");
		System.out.println("**************");
		list.print();
		System.out.println("Sorting...");
		System.out.println("**************");
		list.sort();
		System.out.println("Sorted list...");
		System.out.println("**************");
		list.print();
	}

}
