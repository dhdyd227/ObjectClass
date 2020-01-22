package com.yedam.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if(this.age >o.age)
			return 1;
		else if ( this.age == o.age)
			return 0;
		else
			return -1;
	}
	
}

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("aaa",30));
		tSet.add(new Person("bbbb",25));
		tSet.add(new Person("cc",35));
		tSet.add(new Person("dddd",50));
		
		Iterator<Person> iter =tSet.iterator();
		
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p.name + ", "+ p.age);
		}
		
		
		
	}
	

}
