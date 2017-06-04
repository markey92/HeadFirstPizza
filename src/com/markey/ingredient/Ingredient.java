package com.markey.ingredient;
/*
 * 原材料的超类
 */
public abstract class Ingredient {
	protected String name = "Unknown ingredient";
	protected String description = "Unknown ingredient";
	protected Double price = 0.0;
	String getName() {
		return name;
	}
	public abstract double cost();
	public String getDescription(){
		return description;
	}
	void setPrice(Double price) {
		this.price = price;
	};
}
