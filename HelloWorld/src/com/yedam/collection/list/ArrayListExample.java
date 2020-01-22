package com.yedam.collection.list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//List 인터페이스를 구현하는 ArrayList 클래스.
		List<String> list = new ArrayList<>(); //new String[10]; 멀티 스레드에서 작업하는 ArrayList
		list.add("Hello");
		list.add("World");
		list.add("Nice");
		list.add("Java");
		list.add(2,"Insert");
	
		int size = list.size();
		System.out.println("객체수는 "+size);
		
		for(int i = 0;i < list.size(); i++) {
			System.out.println("index["+i+"]>> "+list.get(i));
		}
		
		String returnVal = list.remove(2);
		System.out.println("return: "+returnVal);
		
		for(int i = 0;i < list.size(); i++) {
				System.out.println(list.get(i));
		}
		
	}
}
