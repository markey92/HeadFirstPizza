package com.markey.ingredient.impl;

import com.markey.ingredient.Ingredient;
import com.markey.ingredient.Sauce;
/*
 * 海鲜酱料
 */
public class MarinaraSauce extends Sauce {

	public MarinaraSauce(Ingredient ingredient) {
		super("MarinaraSauce", ingredient);
		// TODO Auto-generated constructor stub
		setPrice(1.2);
	}
}
