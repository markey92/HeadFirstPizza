package com.markey.ingredient;
/*
 * 酱料
 */
public abstract class Sauce extends Jardiniere {

	public Sauce(String name, Ingredient ingredient) {
		super(name, ingredient);
		this.name = name;
	}

	
}
