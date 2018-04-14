package app;

import lab04.Employees;

public class Driver {

	/**
	 * @param args
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
