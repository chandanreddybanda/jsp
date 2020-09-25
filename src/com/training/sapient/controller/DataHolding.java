package com.training.sapient.controller;

import java.util.HashMap;
import java.util.Map;

public class DataHolding {
	private static Map<String, Student> map = new HashMap<String, Student>();

	public DataHolding() {
	}

	public void addToMap(Student st) {
		map.put(st.getRoll(), st);
	}

	public Student searchForStudent(String roll) {
		if (map.containsKey(roll)) {
			return map.get(roll);
		}
		return null;
	}

	public int lenth() {
		return map.size();
	}
}
