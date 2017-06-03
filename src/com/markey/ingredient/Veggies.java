package com.markey.ingredient;
/*
 * 蔬菜
 */
public abstract class Veggies {

	String name;

	public Veggies(String name) {
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
