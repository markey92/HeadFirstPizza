package com.markey.ingredient;
/*
 * 蔬菜
 */
public abstract class Veggies extends Jardiniere{


	public Veggies(String name, Ingredient ingredient) {
		super(name, ingredient);
		this.name = name;
	}

}
