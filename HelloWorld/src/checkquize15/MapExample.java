package checkquize15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0;  //최고 점수 저장
		int totalScore = 0; //점수 합계 저장
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator(); // 반복자를 통해 가져옴
		
		int cnt = 0;
		while(iter.hasNext()) {
			String key =iter.next();
			//System.out.println("key: "+key+",value: "+map.get(key));
			if(maxScore<map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}
			totalScore += map.get(key);
			cnt ++;
		}
		
		System.out.println("평균 점수: "+totalScore/cnt);
		System.out.println("최고 점수: "+ maxScore);
		System.out.println("최고 점수를 받은 아이디: "+name);
	}

}
