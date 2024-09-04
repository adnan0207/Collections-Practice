package com.adnan.collection.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(156);
		hs.add("Adnan");
		hs.add('m');
		hs.add(new String("Khan"));
		hs.add(65);
		hs.add(null);

		System.out.println(hs);
		
		boolean b = hs.add("Khan");
		
		System.out.println(b);

		System.out.println(hs);
		
		
	}

}
