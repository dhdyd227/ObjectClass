package com.yedam.generic;

public class Util {
	
	public static <T> Box<T> boxing(T t) { //static ���� T�� ���׷�Ÿ������ �˷���
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;
	}
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;	

	}
	
	public static <K,V> boolean compareValue(Pair<K,V> p1, Pair<K,V> p2) {
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool2;	

	}
	
	public static <T extends Number> int compare(T t1,T t2) { //T ���׸��Լ��� ���ڷ� �Ѱ踦��
		double d1 = t1.doubleValue();
		double d2 = t1.doubleValue();
		
		return Double.compare(d1, d2);
	}

	

}
