package com.markey.ingredient;

public abstract class Jardiniere extends Ingredient {

	Ingredient ingredient;
	
	public Jardiniere(String name, Ingredient ingredient) {
		super();
		this.name = name;
		this.ingredient = ingredient;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ingredient.cost() + this.price;
	}
	@Override
	public String getDescription(){
		return ingredient.getDescription() + ", " + this.name;
	};
	@Override
	public void setPrice(Double price) {
		this.price = price;
	}
}
