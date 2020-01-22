package com.mycompany.koy;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("hong");
		p1.setAge(-1);
		p1.setHeight(-1);
		p1.setWeight(-1);

		System.out.println(
				"이름 : " + p1.getName() + " 나이: " + p1.getAge() + " 키 : " + p1.getHeight() + " 몸무게 : " + p1.getWeight());
	}

}
