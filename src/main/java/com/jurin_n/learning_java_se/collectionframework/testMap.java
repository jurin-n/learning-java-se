package com.jurin_n.learning_java_se.collectionframework;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class testMap {
	public static void main(String[] args){
		HashMap<String,Object> hm = new HashMap<>();
		hm.put("name", "テスト太郎");
		hm.put("age", 30);
		hm.put("country", "じゃぱーん");
		System.out.println("\n** HashMapの結果（表示される順序は不明） **");
		for(String key:hm.keySet()){
			System.out.println(key + "=" + hm.get(key));
		}
		
		
		TreeMap<String,Object> tm = new TreeMap<>();
		tm.put("name", "テスト太郎");
		tm.put("age", 30);
		tm.put("country", "じゃぱーん");
		System.out.println("\n** TreeMapの結果（自然順序に表示される） **");
		for(String key:tm.keySet()){
			System.out.println(key + "=" + tm.get(key));
		}
		
		LinkedHashMap<String,Object> lm = new LinkedHashMap<>();
		lm.put("name", "テスト太郎");
		lm.put("age", 30);
		lm.put("country", "じゃぱーん");
		System.out.println("\n** LinkedHashMapの結果（格納順序に表示される） **");
		for(String key:lm.keySet()){
			System.out.println(key + "=" + lm.get(key));
		}	
	}
}
