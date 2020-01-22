package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>();
		
		Member mem = new Member("1",1);
		System.out.println("hashCode: "+ mem.hashCode());
		
		memSet.add(new Member("ȫ�浿",30));
		memSet.add(new Member("ȫ�浿",30));
		
		System.out.println("memSet�� ��ü��: " + memSet.size());
		for(Member m : memSet) {
			System.out.println(m.name + "/" + m.age);
		}
		
		Set<String> set = new HashSet<>(); //�ߺ��� ���� ��� x 
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");
		
		System.out.println("��ü��: "+set.size());
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {   //hasNext() ���� ���ִ� �� Ȯ��
			System.out.println(iter.next()); //next() ���� �о��
		}
		
		System.out.println("�ݺ��� ���� ��: ");
		iter = set.iterator();       //�ٽ� ���� ����
		while(iter.hasNext()) {   //hasNext() ���� ���ִ� �� Ȯ��
			System.out.println(iter.next()); //next() ���� �о��
		}
		
		set.remove("Nice");
		System.out.println("Ȯ�� for:");
		for(String str: set)
			System.out.println(str);
	}

}
