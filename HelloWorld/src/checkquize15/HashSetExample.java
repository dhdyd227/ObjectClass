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
	public int hashCode() { //�� ���� ���� �����ϴٰ� ���� �ؽ��ڵ� ������ equals ����(���ϰ�ü�Ǵ�)
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
		
		set.add(new Student(1,"ȫ�浿"));
		set.add(new Student(2,"�ſ��"));
		set.add(new Student(1,"���ο�")); //����ȵ�

		
		//System.out.println(set.size());
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum+ ":"+ student.name);
		}
	}

}
