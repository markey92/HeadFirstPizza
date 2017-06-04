package com.markey.pizza;

import com.markey.IngredientFactory.PizzaIngredientFactory;
import com.markey.ingredient.Ingredient;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("准备"+name+"所需原材料 ");
		Ingredient ingredient = ingredientFactory.createDough();
		ingredient = ingredientFactory.createVeggies(ingredient);
		ingredient = ingredientFactory.createCheese(ingredient);
		ingredient = ingredientFactory.createPepperoni(ingredient);
		this.ingredient = ingredient;
	}

}
