package com.markey.ingredient.impl;

import com.markey.ingredient.Cheese;
import com.markey.ingredient.Dough;
import com.markey.ingredient.Ingredient;
/*
 * 巴马干酪
 */
public class ReggianoCheese extends Cheese {

	public ReggianoCheese(Ingredient ingredient) {
		super("ReggianoCheese", ingredient);
		// TODO Auto-generated constructor stub
		this.setPrice(1.4);
	}

}
