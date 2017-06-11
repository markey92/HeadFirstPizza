package com.markey.pizza;

import com.markey.ingredient.Cheese;
import com.markey.ingredient.Clams;
import com.markey.ingredient.Dough;
import com.markey.ingredient.Ingredient;
import com.markey.ingredient.Pepperoni;
import com.markey.ingredient.Sauce;
import com.markey.ingredient.Veggies;

public abstract class Pizza {
	String name;
	Double price;
	Ingredient ingredient;
	//准备，收集原材料
	public abstract void prepare();
	//烘烤
	public void bake(){
		System.out.println("将pizza在350°下烘烤35min");
	}
	//切披萨
	public void cut(){
		System.out.println("将pizza按照对角线切成小块");
	}
	//打包披萨
	public void box(){
		System.out.println("将pizza打包进pizza盒子");
	}
	//标价
	public void cost(){
		price = ingredient.cost();
		System.out.println("pizza价格：$" + price);
	}
	//附上配料表
	public void descript(){
		System.out.println("pizza配料：" + ingredient.getDescription());
	}
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "this is a "+getName();
	}
}
