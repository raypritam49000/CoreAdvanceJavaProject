package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<String, List<String>>();

		List<String> phone = new ArrayList<String>();
		phone.add("7696708539");
		phone.add("8699535682");

		map.put("phone", phone);
		
		System.out.println(map);
		
		Map<String, List<String>> mobile = Map.of("mobile",List.of("7696708539","8699535682"));
		System.out.println(mobile);

		
	}
}
