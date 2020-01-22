package com.mycompany.koy;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age<0)
			this.age = 0;
		else
			this.age =age;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if(height<0)
			this.height=0;
		else
			this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight<0)
			this.weight=0;
		else
			this.weight = weight;
	}

}
