package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ArrayList<Object> names= new ArrayList<Object>();
		names.add("kaya");
		names.add("mysha");
		names.add("anisha");
		names.add("lamisa");
		names.add("sofia");


		System.out.print(names+" ");
        System.out.println();
		names.remove("mysha");
		System.out.println("after removing");
		System.out.print(names+" ");
		System.out.println();
		System.out.println("adding an element");
		names.add("mysha");

		System.out.println("using iterator with a while loop");
Iterator<Object> list=names.listIterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("usuing a for loop with an iterator");
	for(Iterator LN=names.iterator();LN.hasNext();){
		System.out.print(LN.next()+" ");
	}
		System.out.println();
		System.out.println("retrieving data without using loops");
		System.out.println();
		for(Object nam:names){
			System.out.print(nam+" " );
		}

	}

}
