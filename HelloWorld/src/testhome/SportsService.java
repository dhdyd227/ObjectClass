package testhome;

import java.util.Map;

public interface SportsService {
		// ȸ�����
		public void enroll(SportsCenter sport, SportsCenter[] sports);
		
		public void enroll2(SportsCenter sport, Map<Integer,SportsCenter> sports);

		// ȸ����ȣ��ȸ.
		public SportsCenter memberserarch(int memberNum,SportsCenter[] sports);
		public SportsCenter memberserarch2(int memberNum, Map<Integer,SportsCenter> sports);
		
		
		//��ϱ׷캰 ����Ʈ
		public SportsCenter[] enrollgroup(SportsCenter[] sports);
		public SportsCenter[] enrollgroup2(Map<Integer,SportsCenter> sports);

}
