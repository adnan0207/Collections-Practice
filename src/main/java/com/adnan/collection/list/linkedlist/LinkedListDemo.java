package com.adnan.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add("Adnan");
		ll.add(23);
		ll.add(null);
		ll.add("Adnan");
		ll.add(new String("Hello"));

		System.out.println(ll);

		ll.set(3, "Khan");

		System.out.println(ll);

		ll.set(3, 156);

		System.out.println(ll);

		ll.removeLast();

		System.out.println(ll);

		ll.addFirst(115494);

		System.out.println(ll);

		ll.add(3, "JAVA");

		System.out.println(ll);

	}

}
