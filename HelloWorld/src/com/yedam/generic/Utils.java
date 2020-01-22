package com.yedam.generic;

public class Utils {
	public static <K,V> V getValue(Pair<K,V> p1, K p2) {
		
		boolean bool = p1.getKey().equals(p2);
		if(bool)
			return p1.getValue();
		else
			return null;

	}

}
