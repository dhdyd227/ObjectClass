package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
	
		long startTime=0,endTime=0;
		
		startTime = System.nanoTime();
		System.out.println("ArrayList");
		for(int i=0;i<1000000;i++) {
			list1.add(0,String.valueOf(i));
			//			list1.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		System.out.println("걸린시간은: "+(endTime-startTime));
		
		startTime=0;
		endTime=0;
		
		startTime = System.nanoTime();
		System.out.println("LinkedList");
		for(int i=0;i<1000000;i++) {
			list2.add(0,String.valueOf(i));
			//			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간은: "+(endTime-startTime));

	}

}
