package com.markey.world;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;

import com.markey.store.PizzaStore;
/*
 * HeadFirstPizza企业
 * 旗下有很多pizza店
 * 使用观察者模式、单例模式
 */
public class HeadFirstPizzaEnterprise extends Enterprise{

	//二:类定义中含有一个该类的静态私有对象
	private static volatile HeadFirstPizzaEnterprise headFirstPizzaEnterprise;

	//一:单例模式的类只提供私有的构造函数
	private HeadFirstPizzaEnterprise() {
		super("HeadFirstPizza集团有限公司");
		this.pizzaStores = new HashMap<>();
		System.out.println("Congratulations, 今天,我们成立了"+name);
	}
	//三:该类提供了一个静态的公有的函数用于创建或获取它本身的静态私有对象
	public static HeadFirstPizzaEnterprise getInstance() {
		if (headFirstPizzaEnterprise == null){
			synchronized (HeadFirstPizzaEnterprise.class) {
				if (headFirstPizzaEnterprise == null){
					headFirstPizzaEnterprise = new HeadFirstPizzaEnterprise();
				}
			}
		}
		return headFirstPizzaEnterprise;
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
