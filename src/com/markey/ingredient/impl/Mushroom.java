package com.markey.ingredient.impl;

import com.markey.ingredient.Dough;
import com.markey.ingredient.Ingredient;
import com.markey.ingredient.Veggies;
/*
 * 蘑菇
 */
public class Mushroom extends Veggies {

	public Mushroom(Ingredient ingredient) {
		super("Mushroom", ingredient);
		// TODO Auto-generated constructor stub
		this.setPrice(0.3);
	}
}
