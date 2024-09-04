package com.adnan.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("Adnan");
		al.add(10);
		al.add("Khan");
		al.add(null);
		al.add(new String("HI"));

		System.out.println(al);

		al.remove(2);

		System.out.println(al);

		al.add(2, 321);
		al.add(3, "M");

		System.out.println(al);

		al.add("n");

		System.out.println(al);

	}

}
