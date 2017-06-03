package com.markey.IngredientFactory;

import com.markey.ingredient.Cheese;
import com.markey.ingredient.Clams;
import com.markey.ingredient.Dough;
import com.markey.ingredient.Pepperoni;
import com.markey.ingredient.Sauce;
import com.markey.ingredient.Veggies;
import com.markey.ingredient.impl.FreshClams;
import com.markey.ingredient.impl.Garlic;
import com.markey.ingredient.impl.MarinaraSauce;
import com.markey.ingredient.impl.Mushroom;
import com.markey.ingredient.impl.Onion;
import com.markey.ingredient.impl.Potato;
import com.markey.ingredient.impl.RedPepper;
import com.markey.ingredient.impl.ReggianoCheese;
import com.markey.ingredient.impl.SlicedPepperoni;
import com.markey.ingredient.impl.ThinCrustDough;
import com.markey.ingredient.impl.Tomato;

public class CGPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		System.out.println("拿点从Chicago的pizza原料工厂买来的薄皮面团");
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		System.out.println("拿点从Chicago的pizza原料工厂买来的海鲜酱");
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		System.out.println("拿点从Chicago的pizza原料工厂买来的巴马干酪");
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies veggies[] = {new Tomato(), new Potato(), new Mushroom()};
		System.out.println("Chicago人喜欢吃西红柿、土豆、洋葱和蘑菇");
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		System.out.println("加点Chicago的意大利香肠片");
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		// TODO Auto-generated method stub
		System.out.println("Chicago在内陆，只能加点冰冻蛤蚌啦");
		return new FreshClams();
	}
}
