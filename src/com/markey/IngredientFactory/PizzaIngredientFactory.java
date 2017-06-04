package com.markey.IngredientFactory;

import com.markey.ingredient.Cheese;
import com.markey.ingredient.Clams;
import com.markey.ingredient.Dough;
import com.markey.ingredient.Ingredient;
import com.markey.ingredient.Pepperoni;
import com.markey.ingredient.Sauce;
import com.markey.ingredient.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();//生产面团
	public Sauce createSauce(Ingredient ingredient);//生产酱料
	public Cheese createCheese(Ingredient ingredient);//生产奶酪
	public Veggies createVeggies(Ingredient ingredient);//生产蔬菜
	public Pepperoni createPepperoni(Ingredient ingredient);//生产意大利香肠
	public Clams createClam(Ingredient ingredient);//生产蛤蚌
	
}
