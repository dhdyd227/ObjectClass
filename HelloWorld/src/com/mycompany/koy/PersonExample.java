package com.mycompany.koy;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("hong");
		p1.setAge(-1);
		p1.setHeight(-1);
		p1.setWeight(-1);

		System.out.println(
				"�̸� : " + p1.getName() + " ����: " + p1.getAge() + " Ű : " + p1.getHeight() + " ������ : " + p1.getWeight());
	}

}
