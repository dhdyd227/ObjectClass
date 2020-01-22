package api.object;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
		//원본 객체 생성 얕은 복제
		Member original = new Member("blue","홍길동","12345",25,true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+cloned.age);
		System.out.println("adult: "+cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("age: "+original.age);
		System.out.println("adult: "+original.adult);
		
		System.out.println(cloned.hashCode());
		System.out.println(original.hashCode());
		if(cloned == original)
		{
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//깊은 복제
		//원본 객체 생성
		Member original2 = new Member("홍길동",25,new int[] {90,90},new Car("소나타"));
		//복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member cloned2 = original.getMember();
		cloned.scores[0]=100;
		cloned.car.model="그랜저";
		
		System.out.println("복제 객체의 필드값");
		System.out.println("name: "+cloned2.name);
		System.out.println("age: "+cloned2.age);

	}

}
