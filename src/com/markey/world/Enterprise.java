package com.markey.world;

import java.util.HashMap;

import com.markey.store.PizzaStore;

public abstract class Enterprise {
	String name;
	String boss;
	HashMap<String, PizzaStore> pizzaStores;
	
	public Enterprise(String name) {
		super();
		this.name = name;
	}
	//公司旗下新开一家店
	public void addStore(String location, PizzaStore pizzaStore){
		pizzaStores.put(location, pizzaStore);
	}
	//公司旗下倒闭一家店
	public void removeStore(PizzaStore pizzaStore){
		if (pizzaStores.containsValue(pizzaStore)){
			pizzaStores.remove(pizzaStore.getLocation());
		}
	}
	//通过位置获取公司旗下的pizza店
	public abstract PizzaStore getStore(String location);

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getBoss() {
		return boss;
	}

	void setBoss(String boss) {
		this.boss = boss;
	};
	
}
