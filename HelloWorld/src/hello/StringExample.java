package hello;

public class StringExample {
	public static void main(String[] args) {
		String str1= "Nice";
		String str2= "Nice";
		
		if(str1 == str2) {
			System.out.println("������ ������");
		}
		else {
			System.out.println("�ٸ� ������.");
		}
		
		String str3 = new String("Nice");
		String str4 = new String("Nice");
		if(str3 == str4) { //�ּҰ����� ��
			System.out.println("������ ������");
		}
		else {
			System.out.println("�ٸ� ������.");
		}
		
		if(str3.equals(str4)) { //���� ��(equals)
			System.out.println("������ ������");
		}
		else {
			System.out.println("�ٸ� ������.");
		}
	}
	
}
