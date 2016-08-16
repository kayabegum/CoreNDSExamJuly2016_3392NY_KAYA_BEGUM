package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> customers = new LinkedList<String>();


		customers.add("sofia");
		customers.add("lamisa");
		customers.add("fattah");
		customers.add("sofia");
		customers.add("anisha");
		System.out.print(customers + " ");

		customers.remove("fattah");
		System.out.print(customers + " ");
		System.out.print(customers.peek() + " ");
		System.out.print(customers.peekFirst() + " ");
		System.out.print(customers.peekLast() + " ");

		Iterator<String> list = customers.listIterator();
		System.out.println();
		System.out.println("retrieving data with while loop");
		System.out.println();
		while (list.hasNext()) {
			System.out.print(list.next() + " ");
		}
		System.out.println();
		System.out.println("usuing a for loop with an iterator");
		for (Iterator list2 = customers.iterator(); list2.hasNext(); ) {
			System.out.print(list2.next() + " ");
		}
		System.out.println();
		System.out.println("retrieving data without using loops");
		System.out.println();
		System.out.println(customers);
		System.out.println();
		System.out.println("retrieving data using loops without iterator  ");
		for (String p : customers) {
			System.out.print(p + " ");


		}

	}
}
