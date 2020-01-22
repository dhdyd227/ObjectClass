package hello;

import java.util.Arrays;
import java.util.Scanner;

public class TestScore {
	private static Student[] StudentArray = new Student[100];
	private static Scanner sc = new Scanner(System.in);
	static int studentcheck=0;
	int  studenttotalcheck=0;
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			
			System.out.println("------------------------");
			System.out.println("1.�л�������� 2.��ü����Ʈ 3.�л���ȣ��ȸ  4.��ü���(����ü ����/���) 5.������������(������������) 6.����");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) { // 1.�л��������
				createStudent();
				studentcheck++;
			} else if (menu == 2) {// 2.��ü ����Ʈ
				getStudentList();
			} else if (menu == 3) {// 3.�л� ��ȣ ��ȸ
				studentnumSearch();
			} else if (menu == 4) { //4. ��ü���(����ü ����/���)
				studentTotal();
			} else if (menu == 5) { //5. ������������(������������)
				totalSort(studentcheck);
			}else if (menu == 6) { //6. ����
				run=false;
			}
			
		}
	}

	// 1. �л� �ν��Ͻ��� ����� �޼ҵ�.
	public static void createStudent() {
		System.out.println("�л� ��ȣ �Է�: ");
		int StudentNum = sc.nextInt();
		sc.nextLine();

		System.out.println("�̸��Է�: ");
		String StudentName = sc.nextLine();

		System.out.println("���������Է�:  ");
		int StudentLen = sc.nextInt();
		sc.nextLine();

		System.out.println("���������Է�:  ");
		int StudentEng = sc.nextInt();
		sc.nextLine();

		System.out.println("���������Է�:  ");
		int StudentMa = sc.nextInt();
		sc.nextLine();

		Student stu = new Student(StudentNum, StudentName, StudentLen, StudentEng, StudentMa);
		for (int i = 0; i < StudentArray.length; i++) {
			if (StudentArray[i] == null) {
				StudentArray[i] = stu;
				break;
			}

		}

	}

	// 2. ��ü����Ʈ ��ȸ �л���ȣ/�̸�/����/����/����/����/���
	public static void getStudentList() {
		for (Student a : StudentArray) {
			if (a != null) {
				System.out.println("�л���ȣ: " + a.getStudentNum() + ", �̸�: " + a.getStudentName() + ", ����: "
						+ a.getStudentLen() + ", ����: " + a.getStudentEng() + ", ����: " + a.getStudentMa());

			}
		}
	}

	// 3. �л���ȣ��ȸ
	public static void studentnumSearch() {
		System.out.println("�л���ȣ �Է�: ");
		int studentSearchNum = sc.nextInt();
		sc.nextLine();

		for (Student stu : StudentArray) {
			if (stu != null && (stu.getStudentNum() == studentSearchNum)) {
				int total = (stu.getStudentLen() + stu.getStudentEng() + stu.getStudentMa());
		
				System.out.println("�л���ȣ: " + stu.getStudentNum() + ", �̸�: " + stu.getStudentName() + ", ����: "
						+ stu.getStudentLen() + ", ����: " + stu.getStudentEng() + ", ����: " 
						+ stu.getStudentMa() + ", ����: " + total + ", ���: " + total / 3);
			}
		}

	}
	
	//4. ��ü���(����ü ����/���)
	public static void studentTotal(){
		int Lentotal = 0; 
		int Engtotal =0;
		int Matotal = 0;
		int count =0;
		for (Student stu : StudentArray) {
			if (stu != null) {
				Lentotal += stu.getStudentLen();
				Engtotal += stu.getStudentEng();
				Matotal += stu.getStudentMa();
				count += 1;
			}
		}
		int total = (Lentotal + Engtotal + Matotal);
		System.out.println("��ü ���  ����ü����/���(�ο���) : " + total +" / "+ (total/count) +"( "+count+" )");
	}

	//5. ������������(��������)
	public static void totalSort(int studentcheck){
		
		int[][] total = new int[studentcheck][2];
		
		//Student stu = new Student(StudentNum, StudentName, StudentLen, StudentEng, StudentMa);
		
		int count =0;
		int count2=0;
		for (Student stu : StudentArray) {
			if (stu != null && total != null) {
				total[count][0]=stu.getStudentLen()+stu.getStudentEng()+stu.getStudentMa();
				total[count++][1]=count2++;
			}
		}
		int max=0;
		int change1=0;
		int change2=0;
		for(int i=0;i<total.length;i++)
		{
			for(int j=i+1; j<total.length;j++) {
				if(total[i][0]<total[j][0]) {
					change1=total[i][0];
					change2=total[i][1];
					total[i][0] = total[j][0];
					total[i][1] = total[j][1];
					total[j][0]=change1;
					total[j][1]=change2;
				}
			}
				
			
		}
		//StudentArray
		for (int i=0;i<total.length;i++) {
				System.out.println("�л���ȣ: " + StudentArray[total[i][1]].getStudentNum() + ", "
						+ "�̸�: " + StudentArray[total[i][1]].getStudentName() + ", ����: " +total[i][0]);
			}
		
		
		
	}
	

	
}
