package com.freesoft;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {

	private static Map<String, String> map = new HashMap<String, String>();

	public static void init() {

		map.put("A", "luis");
		map.put("B", "jose");
		
		Collection<String> values = map.values();
		Set<String> keySet = map.keySet();
		
		System.out.println(keySet);
		System.out.println(values);

		
	}

	public static void main(String[] args) {
		Hash.init();
	}
}
