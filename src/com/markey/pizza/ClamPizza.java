package com.markey.pizza;

import com.markey.IngredientFactory.PizzaIngredientFactory;

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
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		clam = pizzaIngredientFactory.createClam();
	}

}
