package datastructure;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> CitiesInUSA = new ArrayList<String>();
		CitiesInUSA.add("NY");
		CitiesInUSA.add("MI");
		CitiesInUSA.add("LA");

		List<String> CitesInBangladesh = new ArrayList<String>();
		CitesInBangladesh.add("Sylhet");
		CitesInBangladesh.add("Dhaka");
		CitesInBangladesh.add("Comilla");

		List<String> CitiesInUK = new ArrayList<String>();
		CitiesInUK.add("London");
		CitiesInUK.add("Manchester");
		CitiesInUK.add("Bristol");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("USA", CitiesInUSA);
		map.put("Bangladesh", CitesInBangladesh);
		map.put("UK", CitiesInUK);
		System.out.println("retrieving data using a for loop with iterators");

		for (Iterator it1 = map.entrySet().iterator(); it1.hasNext(); ) {
			System.out.print(it1.next() + " ");

		}
       System.out.println();


			System.out.println("retrieving data using a while loop");

			Iterator it2 = map.entrySet().iterator();
			while (it2.hasNext()) {
				System.out.print(it2.next() + " ");
			}
		System.out.println();
		System.out.println("using a regular for loop without an iterator to retreieve the data");
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
		System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
