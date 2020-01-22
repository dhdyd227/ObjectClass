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
		
		String name = null; //�ְ� ������ ���� ���̵� ����
		int maxScore = 0;  //�ְ� ���� ����
		int totalScore = 0; //���� �հ� ����
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator(); // �ݺ��ڸ� ���� ������
		
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
		
		System.out.println("��� ����: "+totalScore/cnt);
		System.out.println("�ְ� ����: "+ maxScore);
		System.out.println("�ְ� ������ ���� ���̵�: "+name);
	}

}
