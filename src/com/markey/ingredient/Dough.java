package com.markey.ingredient;
/*
 * 面团的超类
 */
public abstract class Dough extends Ingredient{
	
	public Dough(String name) {
		this.name = name;
		this.description = "SimpleDough";
	}
}
