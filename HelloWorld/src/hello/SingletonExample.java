package hello;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");		
	}

}
