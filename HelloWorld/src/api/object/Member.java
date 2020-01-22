package api.object;

import java.util.Arrays;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] scores;
	public Car car;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	public Member(String id) {
		this.id = id;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned =(Member)clone(); //clone()메소드의 리턴  타입은 Object 이므로 Member 타입으로 캐스팅해야 함
			System.out.println("객체 복제");
		}catch(CloneNotSupportedException e) {}
		return cloned;
	}
	
	//hashCode 필드값 같은지 확인
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
			return false;
		
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복사를 해서 name,age를 복제한다.
		Member cloned =(Member) super.clone();
		//scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	
	
}
