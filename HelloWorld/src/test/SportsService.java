package test;

public interface SportsService {
		// ȸ�����
		public void enroll(SportsCenter sport, SportsCenter[] sports);
		// ȸ����ȣ��ȸ.
		public SportsCenter memberserarch(int memberNum,SportsCenter[] sports);
		//��ϱ׷캰 ����Ʈ
		public SportsCenter[] enrollgroup(SportsCenter[] sports);

}
