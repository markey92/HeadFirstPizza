package com.markey.ingredient;
/*
 * 面团
 */
public abstract class Dough {

	String name;

	public Dough(String name) {
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
