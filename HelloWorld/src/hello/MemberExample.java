package hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1= new Member();
		m1.setName("OhYongKwon");
		m1.setAge(26);
		m1.setId("koy");
		m1.setPassword("koy123");
		
		Member m2= new Member();
		m2.setName("Admin");
		m2.setAge(0);
		m2.setId("admin");
		m2.setPassword("admin123");
		
		Member m3= new Member("�����1","user1","user123",10);
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȸ�� ID �Է�:");
		String check=sc.nextLine();
		
		Member[] memberAray=new Member[] {m1,m2,m3};
		for(Member test:  memberAray)
		{
			if(test.getId().equals(check))
				System.out.println( test.getName()+"  "+test.getAge()+"  "+test.getId()+"  "+test.getPassword());
		}
		
	}

}
