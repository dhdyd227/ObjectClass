package classes;

public class Student {
	//�ʵ�
	String name;
	String major;
	int studentNo;
	
	//������
	Student(){
		
	}
	Student(String name){
		this.name=name;
	}
	
	Student(String name,String major){
		this.name=name;
		this.major=major;
	}
	
	//�޼ҵ�
	void study()
	{
		System.out.println("�����մϴ�.");
	}
	
	void goToSchool()
	{
		System.out.println("�б����ϴ�.");
	}
}
