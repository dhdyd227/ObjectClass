package testhome;

import java.util.Map;

public interface SportsService {
		// 회원등록
		public void enroll(SportsCenter sport, SportsCenter[] sports);
		
		public void enroll2(SportsCenter sport, Map<Integer,SportsCenter> sports);

		// 회원번호조회.
		public SportsCenter memberserarch(int memberNum,SportsCenter[] sports);
		public SportsCenter memberserarch2(int memberNum, Map<Integer,SportsCenter> sports);
		
		
		//등록그룹별 리스트
		public SportsCenter[] enrollgroup(SportsCenter[] sports);
		public SportsCenter[] enrollgroup2(Map<Integer,SportsCenter> sports);

}
