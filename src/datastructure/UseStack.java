package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<Object> pic=new Stack<>();
        pic.push("mysha's pic");
        pic.push("anisha's pic");
        pic.push("sofia's pic");
		///usuing add to insert elements
        pic.add("lamisa's pic");
        pic.add("fattah's pic");


		///peek shows which object is on the top
        System.out.println(pic.peek());
		System.out.println(pic);
		//shows the object on the top then removes it
        System.out.println(pic.pop());
		System.out.println(pic);
        System.out.println(pic.peek());
		System.out.println(pic);
		///removing the item
		pic.remove("fattah's pic");
		System.out.println(pic);
		//usuing push to add items to the stack
		pic.push("faitha's pic");
		System.out.println(pic);
		/// searching for elements
		System.out.println(pic.search("anisha"));
		///size of the stack
		System.out.println("the size of the stack is "+ pic.size());




		Iterator<Object> list=pic.iterator();
		while(list.hasNext()){
			System.out.print(list.next()+" ");
		}
		System.out.println();
		System.out.println("usuing a for loop with an iterator");
		for(Iterator pic1=pic.iterator();pic1.hasNext();){
			System.out.print(pic1.next()+" ");
		}
		System.out.println();
		System.out.println("retrieving data without using loops");
		System.out.println(" retreiving data without an  iterator");
		System.out.print(pic+" ");
		System.out.println("usuing a for loop without an iterator to retieve data");
		for(Object p:pic){
			System.out.print(p+" " );
		}

	}

}
