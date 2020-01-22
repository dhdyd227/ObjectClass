package com.mycompany.koy;

public class CircleExample {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setRadiuse(-10);
		System.out.println("반지름: " +  c1.getRadius()+"의 넓이는"+ c1.getArea());
	}

}
