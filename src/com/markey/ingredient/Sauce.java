package com.markey.ingredient;
/*
 * 酱料
 */
public abstract class Sauce {
	String name;

	public Sauce(String name) {
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
