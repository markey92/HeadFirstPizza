package com.markey.pizza;

import com.markey.IngredientFactory.PizzaIngredientFactory;
import com.markey.ingredient.Ingredient;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备"+name+"所需原材料 ");
		Ingredient ingredient = ingredientFactory.createDough();
		ingredient = ingredientFactory.createSauce(ingredient);
		ingredient = ingredientFactory.createCheese(ingredient);
		this.ingredient = ingredient;
	}

}
