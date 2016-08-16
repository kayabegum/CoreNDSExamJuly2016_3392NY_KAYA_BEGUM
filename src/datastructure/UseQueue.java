package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

        Queue<Object> pen=new LinkedList<>();
        pen.add("mysha's pen");
        pen.add("anisha's pen");
        pen.add("sofia's pen");
        pen.add("lamisa's pen");
        pen.add("fattah's pen");
		//peek is showing which object is on the top
		System.out.println(pen.peek());
		System.out.println(pen);
		//poll shows which object is on the top and then removes it
		System.out.println(pen.poll());
		System.out.println(pen);
		System.out.println(pen.peek());
		pen.offer("mysha's pen");
		System.out.println(pen.element());

		///size of the queue
		System.out.println("the size of the queue is"+pen.size());

		pen.remove("anisha");
		System.out.println(pen);

		Iterator<Object> list=pen.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("usuing a for loop with an iterator");
		for(Iterator pens=pen.iterator();pens.hasNext();){
			System.out.print(pens.next()+" ");
		}
		System.out.println();
		System.out.println("retrieving data without using loops");
		System.out.println();
		for(Object p:pen){
			System.out.print(p+" " );
		}




	}

}
