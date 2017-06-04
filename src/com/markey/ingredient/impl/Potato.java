package com.markey.ingredient.impl;

import com.markey.ingredient.Dough;
import com.markey.ingredient.Ingredient;
import com.markey.ingredient.Veggies;
/*
 * 土豆
 */
public class Potato extends Veggies{

	public Potato(Ingredient ingredient) {
		super("potato", ingredient);
		// TODO Auto-generated constructor stub
		this.setPrice(0.4);
	}
	
}
