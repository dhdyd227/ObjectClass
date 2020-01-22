package api.object;

import java.util.Objects;

import com.yedam.generic.Student;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student{
		int sno;
		String name;
		public Student(int sno, String name) {
			super();
			this.sno = sno;
			this.name = name;
		}
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);
		}
		
	}

}