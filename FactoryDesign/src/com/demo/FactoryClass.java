package com.demo;

public class FactoryClass {

	public OS getInstance(String obj) {
		if (obj.equals("Apple")) {
			return new Apple();
		}
		else if(obj.equals("Nokia")) {
			return new Nokia();
		}
		else if(obj.equals("Samsung")) {
			return new Samsung();
		}
		return null;
	}
}
