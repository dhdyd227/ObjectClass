package com.yedam.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // (key,value) key �ߺ� x
		map.put("ȫ�浿",80);
		map.put("�̱浿",70);
		map.put("��浿",60);
		map.put("ȫ�浿",90);  // ����Ű ����� �ڿ� �Է��� ������ �ٲ�.
		
		System.out.println("Entry ����: "+map.size());
		System.out.println("���1"); //key�� set�� ��Ƽ� iterator�� ������.

		Set<String> keyset = map.keySet();  //Set<String>�� map�� Ű���� ��ڴ�.
		Iterator<String> iter = keyset.iterator(); // �ݺ��ڸ� ���� ������
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
