package com.markey.store;

import com.markey.IngredientFactory.NYPizzaIngredientFactory;
import com.markey.IngredientFactory.PizzaIngredientFactory;
import com.markey.pizza.CheesePizza;
import com.markey.pizza.ClamPizza;
import com.markey.pizza.Pizza;
import com.markey.world.Enterprise;
import com.markey.world.HeadFirstPizzaEnterprise;

public class NYStylePizzaStore extends PizzaStore {

	public NYStylePizzaStore(Enterprise enterprise, String location, String name) {
		super(enterprise, location, name);
		System.out.println(enterprise.getName()+"发现"+location+"这个地方有商机");
		System.out.println("于是在"+location+"迅速占领市场，成立了一家pizza店："+name);
		// TODO Auto-generated constructor stub
	}

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if (type.equalsIgnoreCase("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if (type.equalsIgnoreCase("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		return pizza;
	}

}
