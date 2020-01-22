package testhome;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		for(int i=0;i<sports.length;i++) {
			sportsAry[i]=sports[i];
		}

		return sportsAry;
	}
	
	//map 이용하기
	@Override
	public void enroll2(SportsCenter sport, Map<Integer, SportsCenter> sports) {
		sports.put(sport.getMemberNum(), sport);
	}

	@Override
	public SportsCenter memberserarch2(int memberNum, Map<Integer, SportsCenter> sports) {
		SportsCenter search=sports.get(memberNum);
		return search;
	}

	@Override
	public SportsCenter[] enrollgroup2(Map<Integer, SportsCenter> sports) {
		Set<Integer> keyset = sports.keySet();
		Iterator<Integer> iter = keyset.iterator();
		
		System.out.println("------------------수영------------------");
		while(iter.hasNext()) {
			Integer key =iter.next();
			if(sports.get(key).getEnrollment().equals("수영"))
				System.out.println(sports.get(key));
		}System.out.println();System.out.println();

		System.out.println("------------------테니스------------------");
		Iterator<Integer> iter2 = keyset.iterator();
		while(iter2.hasNext()) {
			Integer key =iter2.next();
			if(sports.get(key).getEnrollment().equals("테니스"))
				System.out.println(sports.get(key));
		}System.out.println();System.out.println();
		
		System.out.println("------------------배드민턴------------------");
		Iterator<Integer> iter3 = keyset.iterator();
		while(iter3.hasNext()) {
			Integer key =iter3.next();
			if(sports.get(key).getEnrollment().equals("배드민턴"))
				System.out.println(sports.get(key));
		}System.out.println();System.out.println();

		return null;
	}


}
