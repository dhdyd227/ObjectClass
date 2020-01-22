package test;

import com.board.model.Board;

public class SportsServiceImpl implements SportsService{

	@Override
	public void enroll(SportsCenter sport, SportsCenter[] sports) {
		for(int i = 0; i<sports.length;i++) {
			if(sports[i] ==null) {
				sports[i]=sport;
				break;
			}
		}
	}

	@Override
	public SportsCenter memberserarch(int memberNum, SportsCenter[] sports) {
		SportsCenter sport = null;
		for(int i=0;i<sports.length;i++){
			if(sports[i] !=null && sports[i].getMemberNum() == memberNum) {
				sport=sports[i];
			}
		}
		return sport;
	}

	@Override
	public SportsCenter[] enrollgroup(SportsCenter[] sports) {
		SportsCenter[] sportsAry = new SportsCenter[sports.length];
		
		SportsCenter[][] sportsAry2 = new SportsCenter[3][];
		int s=0;
		int t=0;
		int b=0;
		for(int i=0;i<sports.length;i++) {
			if(sports[i].enrollment.equals("수영"))
				sportsAry2[0][s++]= sports[i];
			else if(sports[i].enrollment.equals("테니스"))
				sportsAry2[1][t++]= sports[i];
			else if(sports[i].enrollment.equals("베드민턴"))
				sportsAry2[2][b++]= sports[i];
				
			sportsAry[i]=sports[i];
		}
		for(int i=0;i<s;i++) {
			System.out.println(sportsAry2[0][i]);
		}
		for(int i=0;i<t;i++) {
			System.out.println(sportsAry2[0][i]);
		}
		for(int i=0;i<b;i++) {
			System.out.println(sportsAry2[0][i]);
		}
					
		return sportsAry;
	}


}
