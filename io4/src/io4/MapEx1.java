package io4;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) throws Exception{

		Map<String, Job> map = new HashMap<>();

		map.put("A", new AJob());
		map.put("B", new BJob());

		Job target = map.get("A");
		target.doJob();
		
		
//		System.out.println(map);
//		
//		map.keySet().forEach(key -> System.out.println(key));
//		map.values().forEach(value -> System.out.println(value));
//		if(map.get("Z")==null) {
//			System.out.println("NOT EXIST");
	}
}
