package com.markey.pizza;

import com.markey.IngredientFactory.PizzaIngredientFactory;
import com.markey.ingredient.Ingredient;

public class ClamPizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.pizzaIngredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备"+name+"所需原材料 ");
		Ingredient ingredient = pizzaIngredientFactory.createDough();
		ingredient = pizzaIngredientFactory.createSauce(ingredient);
		ingredient = pizzaIngredientFactory.createCheese(ingredient);
		ingredient = pizzaIngredientFactory.createClam(ingredient);
		this.ingredient = ingredient;
	}

}
