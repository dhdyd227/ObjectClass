package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>();
		
		Member mem = new Member("1",1);
		System.out.println("hashCode: "+ mem.hashCode());
		
		memSet.add(new Member("홍길동",30));
		memSet.add(new Member("홍길동",30));
		
		System.out.println("memSet의 객체수: " + memSet.size());
		for(Member m : memSet) {
			System.out.println(m.name + "/" + m.age);
		}
		
		Set<String> set = new HashSet<>(); //중복된 값은 허용 x 
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");
		
		System.out.println("객체수: "+set.size());
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {   //hasNext() 값이 더있는 지 확인
			System.out.println(iter.next()); //next() 값을 읽어옴
		}
		
		System.out.println("반복자 소진 후: ");
		iter = set.iterator();       //다시 값을 세팅
		while(iter.hasNext()) {   //hasNext() 값이 더있는 지 확인
			System.out.println(iter.next()); //next() 값을 읽어옴
		}
		
		set.remove("Nice");
		System.out.println("확장 for:");
		for(String str: set)
			System.out.println(str);
	}

}
