package hello;

public class Student {
	private int StudentNum; //�л���ȣ
	private String StudentName; //�̸�
	private int StudentLen; //��������
	private int StudentEng; //��������
	private int StudentMa; //��������
	
	public Student(int studentNum, String studentName, int studentLen, int studentEng, int studentMa) {
		super();
		this.StudentNum = studentNum;
		this.StudentName = studentName;
		this.StudentLen = studentLen;
		this.StudentEng = studentEng;
		this.StudentMa = studentMa;
	}
	
	public int getStudentNum() {
		return StudentNum;
	}
	public void setStudentNum(int studentNum) {
		this.StudentNum = studentNum;
	}
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
	
	public int getStudentLen() {
		return StudentLen;
	}
	public void setStudentLen(int studentLen) {
		this.StudentLen = studentLen;
	}
	
	public int getStudentEng() {
		return StudentEng;
	}
	public void setStudentEng(int studentEng) {
		this.StudentEng = studentEng;
	}
	
	public int getStudentMa() {
		return StudentMa;
	}
	public void setStudentMa(int studentMa) {
		this.StudentMa = studentMa;
	}

	

}	
