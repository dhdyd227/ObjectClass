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
			cloned =(Member)clone(); //clone()�޼ҵ��� ����  Ÿ���� Object �̹Ƿ� Member Ÿ������ ĳ�����ؾ� ��
			System.out.println("��ü ����");
		}catch(CloneNotSupportedException e) {}
		return cloned;
	}
	
	//hashCode �ʵ尪 ������ Ȯ��
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
		//���� ���� ���縦 �ؼ� name,age�� �����Ѵ�.
		Member cloned =(Member) super.clone();
		//scores�� ���� �����Ѵ�.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�.
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}

	
	
}
