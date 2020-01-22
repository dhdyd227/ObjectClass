package checkquize15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() { //비교 값을 설정 동작하다가 동일 해쉬코드 만나면 equals 실행(동일객체판단)
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			return true;			
		}else {
			return false;
		}
	}
}
public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"신용권"));
		set.add(new Student(1,"조민우")); //저장안됨

		
		//System.out.println(set.size());
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum+ ":"+ student.name);
		}
	}

}
