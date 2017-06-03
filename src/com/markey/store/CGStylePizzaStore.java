package com.markey.store;

import com.markey.IngredientFactory.CGPizzaIngredientFactory;
import com.markey.IngredientFactory.NYPizzaIngredientFactory;
import com.markey.IngredientFactory.PizzaIngredientFactory;
import com.markey.pizza.CheesePizza;
import com.markey.pizza.ClamPizza;
import com.markey.pizza.PepperoniPizza;
import com.markey.pizza.Pizza;
import com.markey.world.Enterprise;

public class CGStylePizzaStore extends PizzaStore{

	public CGStylePizzaStore(Enterprise enterprise, String location, String name) {
		super(enterprise, location, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new CGPizzaIngredientFactory();
		if (type.equalsIgnoreCase("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}else if (type.equalsIgnoreCase("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		}else if (type.equalsIgnoreCase("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style pepperoni Pizza");
		}
		return pizza;
	}

}
