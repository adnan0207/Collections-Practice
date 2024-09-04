package com.adnan.collection.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class InstanceOfCheck {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();

		System.out.println(al instanceof Serializable);
		System.out.println(ll instanceof Cloneable);

		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);

	}

}
