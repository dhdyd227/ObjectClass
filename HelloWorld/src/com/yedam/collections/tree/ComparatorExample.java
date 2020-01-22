package com.yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	Fruits(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

class ComparatorClass implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("dddd", 50));
		Iterator<Fruits> iter = tSet.iterator();
		while (iter.hasNext()) {
			Fruits par = iter.next();
			System.out.println(par.name + ", " + par.price);
		}

		
		
		Comparator<Fruits> clas = (o1, o2) -> {
			if (o1.price > o2.price)
				return -1;
			else if (o1.price == o2.price)
				return 0;
			else
				return 1;
		};

		TreeSet<Fruits> tSet1 = new TreeSet<>(clas);
		tSet1.add(new Fruits("aaa", 30));
		tSet1.add(new Fruits("bbbb", 25));
		tSet1.add(new Fruits("cc", 35));
		tSet1.add(new Fruits("dddd", 50));
		iter = tSet1.iterator();
		while (iter.hasNext()) {
			Fruits par = iter.next();
			System.out.println(par.name + ", " + par.price);
		}

	}
}
