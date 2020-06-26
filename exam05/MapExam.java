package com.jremind.exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("국어", 90);
		map.put("영어", 85);
		map.put("수학", 95);
		map.put("과학", 100);
		
		System.out.println("총 Entry수: " + map.size());
		System.out.println("국어점수: " + map.get("국어") + '\n');
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.remove("국어");
		System.out.println("총 Entry수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry수: " + map.size());
		

	}

}
