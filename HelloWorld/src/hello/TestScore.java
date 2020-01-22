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
			System.out.println("1.학생성적등록 2.전체리스트 3.학생번호조회  4.전체통계(반전체 점수/평균) 5.총점기준정렬(오름차순정렬) 6.종료");
			System.out.println("------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) { // 1.학생성적등록
				createStudent();
				studentcheck++;
			} else if (menu == 2) {// 2.전체 리스트
				getStudentList();
			} else if (menu == 3) {// 3.학생 번호 조회
				studentnumSearch();
			} else if (menu == 4) { //4. 전체통계(반전체 점수/평균)
				studentTotal();
			} else if (menu == 5) { //5. 총점기준정렬(오름차순정렬)
				totalSort(studentcheck);
			}else if (menu == 6) { //6. 종료
				run=false;
			}
			
		}
	}

	// 1. 학생 인스턴스를 만드는 메소드.
	public static void createStudent() {
		System.out.println("학생 번호 입력: ");
		int StudentNum = sc.nextInt();
		sc.nextLine();

		System.out.println("이름입력: ");
		String StudentName = sc.nextLine();

		System.out.println("국어점수입력:  ");
		int StudentLen = sc.nextInt();
		sc.nextLine();

		System.out.println("영어점수입력:  ");
		int StudentEng = sc.nextInt();
		sc.nextLine();

		System.out.println("수학점수입력:  ");
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

	// 2. 전체리스트 조회 학생번호/이름/국어/영어/수학/총점/평균
	public static void getStudentList() {
		for (Student a : StudentArray) {
			if (a != null) {
				System.out.println("학생번호: " + a.getStudentNum() + ", 이름: " + a.getStudentName() + ", 국어: "
						+ a.getStudentLen() + ", 영어: " + a.getStudentEng() + ", 수학: " + a.getStudentMa());

			}
		}
	}

	// 3. 학생번호조회
	public static void studentnumSearch() {
		System.out.println("학생번호 입력: ");
		int studentSearchNum = sc.nextInt();
		sc.nextLine();

		for (Student stu : StudentArray) {
			if (stu != null && (stu.getStudentNum() == studentSearchNum)) {
				int total = (stu.getStudentLen() + stu.getStudentEng() + stu.getStudentMa());
		
				System.out.println("학생번호: " + stu.getStudentNum() + ", 이름: " + stu.getStudentName() + ", 국어: "
						+ stu.getStudentLen() + ", 영어: " + stu.getStudentEng() + ", 수학: " 
						+ stu.getStudentMa() + ", 총점: " + total + ", 평균: " + total / 3);
			}
		}

	}
	
	//4. 전체통계(반전체 점수/평균)
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
		System.out.println("전체 통계  반전체점수/평균(인원수) : " + total +" / "+ (total/count) +"( "+count+" )");
	}

	//5. 총점기준정렬(오름차순)
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
				System.out.println("학생번호: " + StudentArray[total[i][1]].getStudentNum() + ", "
						+ "이름: " + StudentArray[total[i][1]].getStudentName() + ", 총점: " +total[i][0]);
			}
		
		
		
	}
	

	
}
