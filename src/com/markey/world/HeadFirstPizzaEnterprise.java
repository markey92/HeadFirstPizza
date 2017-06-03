package com.markey.world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import com.markey.store.PizzaStore;
/*
 * HeadFirstPizza企业
 * 旗下有很多pizza店
 * 使用观察者模式
 */
public class HeadFirstPizzaEnterprise extends Enterprise{


	public HeadFirstPizzaEnterprise() {
		super("HeadFirstPizza集团有限公司");
		this.pizzaStores = new HashMap<>();
		System.out.println("Congratulations, 今天,我们成立了"+name);
	}

	//根据区域搜索公司旗下的披萨店
	public PizzaStore getStore(String location) {
		PizzaStore pizzaStore = null;
		if (pizzaStores.containsKey(location)){
			pizzaStore = pizzaStores.get(location);
		}else{
			pizzaStore = null;
		}
		return pizzaStore;
	}
}
