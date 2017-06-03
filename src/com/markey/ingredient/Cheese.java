package com.markey.ingredient;
/*
 * 奶酪
 */
public abstract class Cheese {

	String name;

	public Cheese(String name) {
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
