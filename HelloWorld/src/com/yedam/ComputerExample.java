package com.yedam;
class Calculator {
	
	double areaCirecle(double r) {
		return 3.14*r*r;
	}
	
}

class Computer extends Calculator{
	@Override
	double areaCirecle(double r) {
		return Math.PI * r * r;
	}

	double araCircle2(double r) {
		return super.areaCirecle(r);
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer ();
		System.out.println("°á°ú°ª: "+com.areaCirecle(10));

	}
}
