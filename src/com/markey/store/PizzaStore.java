package com.markey.store;

import com.markey.pizza.Pizza;
import com.markey.world.Enterprise;
import com.markey.world.HeadFirstPizzaEnterprise;

public abstract class PizzaStore {

	Enterprise enterprise;
	String location;
	String name;
	public PizzaStore(Enterprise enterprise, String location, String name) {
		this.name = name;
		this.enterprise = enterprise;
		enterprise.addStore(location, this);
	}
	public Pizza orderPizza(String type) {
		System.out.println("披萨店（"+name+"）接到一个订单，有人订了一个"+type+"披萨");
		System.out.println("开始制作pizza");
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		pizza.descript();
		pizza.cost();
		
		return pizza;
	}
	abstract Pizza createPizza(String type);
	void close(){
		enterprise.removeStore(this);
		System.out.println("因为经营不善，一家名为"+name+"的披萨店倒闭了");
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
}
