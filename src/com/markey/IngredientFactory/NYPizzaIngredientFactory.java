package com.markey.IngredientFactory;

import java.util.concurrent.locks.ReentrantLock;

import com.markey.ingredient.Cheese;
import com.markey.ingredient.Clams;
import com.markey.ingredient.Dough;
import com.markey.ingredient.Ingredient;
import com.markey.ingredient.Pepperoni;
import com.markey.ingredient.Sauce;
import com.markey.ingredient.Veggies;
import com.markey.ingredient.impl.FreshClams;
import com.markey.ingredient.impl.Garlic;
import com.markey.ingredient.impl.MarinaraSauce;
import com.markey.ingredient.impl.Mushroom;
import com.markey.ingredient.impl.Onion;
import com.markey.ingredient.impl.RedPepper;
import com.markey.ingredient.impl.ReggianoCheese;
import com.markey.ingredient.impl.SlicedPepperoni;
import com.markey.ingredient.impl.ThinCrustDough;
/*
 * the Ingredient factory of NewYork
 * use ThinCrustDough, MarinaraSauce, ReggianoCheese, Garlic and so on
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		System.out.println("拿点从NewYork的pizza原料工厂买来的薄皮面团");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce(Ingredient ingredient) {
		// TODO Auto-generated method stub
		System.out.println("拿点从NewYork的pizza原料工厂买来的海鲜酱");
		return new MarinaraSauce(ingredient);
	}

	@Override
	public Cheese createCheese(Ingredient ingredient) {
		// TODO Auto-generated method stub
		System.out.println("拿点从NewYork的pizza原料工厂买来的巴马干酪");
		return new ReggianoCheese(ingredient);
	}

	@Override
	public Veggies createVeggies(Ingredient ingredient) {
		// TODO Auto-generated method stub
		System.out.println("来点蔬菜，蒜头，洋葱，蘑菇，红辣椒");
		Veggies veggies = new Garlic(ingredient);
		veggies = new Onion(veggies);
		veggies = new Mushroom(veggies);
		veggies = new RedPepper(veggies);
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni(Ingredient ingredient) {
		// TODO Auto-generated method stub
		System.out.println("加点意大利香肠片");
		return new SlicedPepperoni(ingredient);
	}

	@Override
	public Clams createClam(Ingredient ingredient) {
		// TODO Auto-generated method stub
		System.out.println("加点新鲜蛤蚌");
		return new FreshClams(ingredient);
	}

}
