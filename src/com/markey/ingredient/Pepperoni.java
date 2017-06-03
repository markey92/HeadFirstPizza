package com.markey.ingredient;
/*
 * 意大利辣香肠
 */
public abstract class Pepperoni {

	String name;

	public Pepperoni(String name) {
		super();
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	
}
