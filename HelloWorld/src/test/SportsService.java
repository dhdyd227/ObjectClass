package test;

public interface SportsService {
		// 회원등록
		public void enroll(SportsCenter sport, SportsCenter[] sports);
		// 회원번호조회.
		public SportsCenter memberserarch(int memberNum,SportsCenter[] sports);
		//등록그룹별 리스트
		public SportsCenter[] enrollgroup(SportsCenter[] sports);

}
