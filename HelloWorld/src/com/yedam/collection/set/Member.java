package com.yedam.collection.set;

public class Member {
	String name;
	int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		
//		if(obj instanceof Member) {
//			Member mem =(Member) obj;
//			return mem.name.equals(this.name) && mem.age == this.age;
//			}else
//				return false;

		if(obj instanceof Member) {
			Member mem =(Member) obj;
			return mem.age == this.age;
			}else
				return false;
		//return super.equals(obj);
	}
	@Override
	public int hashCode() { //ÁÖ¼Ò°ª
		return this.name.hashCode()+age;
			
		//return super.hashCode();
	}
	

}
