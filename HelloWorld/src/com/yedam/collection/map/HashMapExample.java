package com.yedam.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // (key,value) key 중복 x
		map.put("홍길동",80);
		map.put("이길동",70);
		map.put("김길동",60);
		map.put("홍길동",90);  // 동일키 존재시 뒤에 입력한 값으로 바뀜.
		
		System.out.println("Entry 갯수: "+map.size());
		System.out.println("방법1"); //key를 set에 담아서 iterator로 가져옴.

		Set<String> keyset = map.keySet();  //Set<String>에 map의 키값을 담겠다.
		Iterator<String> iter = keyset.iterator(); // 반복자를 통해 가져옴
		while(iter.hasNext()) {
			String key =iter.next();
			System.out.println("key: "+key+",value: "+map.get(key));
		}
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> mapIter = entrySet.iterator();
		while(mapIter.hasNext()){
			Map.Entry<String, Integer> ent = mapIter.next();
			System.out.println("key : "+ent.getKey() +", value: "+ent.getValue());
		}
		for(Map.Entry<String, Integer> mapEnt : entrySet) {
			System.out.println("key : "+mapEnt.getKey() +", value: "+mapEnt.getValue());	
		}
//		for(Enty<Stirng,Interger> ent : map) {
//			
//		}
	}

}
