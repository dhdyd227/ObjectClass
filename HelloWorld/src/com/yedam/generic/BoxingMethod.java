package com.yedam.generic;

public class BoxingMethod {
	public static void main(String[] args) {
		Integer intValue = new Integer(10);
		Box<Integer> box = Util.boxing(intValue);
		System.out.println(box.getObj());
		
		Box<String>  a = Util.boxing("Hello");
		System.out.println(a.getObj());
	}

}
