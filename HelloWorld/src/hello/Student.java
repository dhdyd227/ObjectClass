package hello;

public class Student {
	private int StudentNum; //학생번호
	private String StudentName; //이름
	private int StudentLen; //국어점수
	private int StudentEng; //영어점수
	private int StudentMa; //수학점수
	
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
