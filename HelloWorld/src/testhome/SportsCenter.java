package testhome;

public class SportsCenter {
	private int memberNum;
	private	String name;
	private String enrollment;
	
	
	public SportsCenter(int memberNum, String name, String enrollment) {
		super();
		this.memberNum = memberNum;
		this.name = name;
		this.enrollment = enrollment;
	}
	public int getMemberNum() {
		return memberNum;
	}
	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	

	@Override
	public String toString() {
		return "���������� [ȸ����ȣ=" + memberNum + ", �̸�=" + name + ", "
				+ "��ϰ���=" + enrollment+"]" ;
	}
}
