package com.markey.customer;

import com.markey.pizza.Pizza;
import com.markey.store.PizzaStore;
import com.markey.world.Enterprise;
import com.markey.world.HeadFirstPizzaEnterprise;

public class Customer implements BookPizza{

	String name;
	String location;
	PizzaStore pizzaStore;
	
	public Customer(String name, String location, Enterprise enterprise) {
		super();
		this.name = name;
		this.location = location;
		System.out.println("这时候有一个来自"+location+"的顾客"+name);
		pizzaStore = enterprise.getStore(location);
		System.out.println(name+"比较喜欢"+enterprise.getName());
		System.out.println("所以"+name+"只会到"+enterprise.getName()+"旗下的pizza店订外卖");
	}

	@Override
	public Pizza bookPizza(String type) {
		// TODO Auto-generated method stub
		System.out.println("又到了每天的午餐时间");
		System.out.println(name+"在pizza店("+pizzaStore.getName()+")订一个外卖pizza");
		return pizzaStore.orderPizza(type);
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

	PizzaStore getPizzaStore() {
		return pizzaStore;
	}

	public void setPizzaStore(PizzaStore pizzaStore) {
		this.pizzaStore = pizzaStore;
	}
	
}
