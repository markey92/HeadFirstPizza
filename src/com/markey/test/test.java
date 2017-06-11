package com.markey.test;

import com.markey.customer.ChicagoCustomer;
import com.markey.customer.NewYorkCustomer;
import com.markey.store.CGStylePizzaStore;
import com.markey.store.NYStylePizzaStore;
import com.markey.world.Enterprise;
import com.markey.world.HeadFirstPizzaEnterprise;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//成立HeadFirstPizza全球有限公司
		Enterprise headFirstPizzaEnterprise = HeadFirstPizzaEnterprise.getInstance();
		//迅速开了一下NewYork分店-》使用观察者模式，会注册到HeadFirstPizza全球有限公司旗下
		NYStylePizzaStore nyPizzaStore = new NYStylePizzaStore(headFirstPizzaEnterprise, "NewYork", "NewYorkHFpizza");
		//这时候来了一个NewYork顾客jack
		NewYorkCustomer jack = new NewYorkCustomer("jack", headFirstPizzaEnterprise);
		//jack点了一个芝士披萨
		jack.bookPizza("cheese");
		//boss来到Chicago，发现这里居然没有pizza店，决定开一家
		CGStylePizzaStore cgPizzaStore = new CGStylePizzaStore(headFirstPizzaEnterprise, "Chicago", "ChicagoHFpizza");
		//在Chicago有一位marlin同志
		ChicagoCustomer marlin = new ChicagoCustomer("marlin", "Chicago", headFirstPizzaEnterprise);
		marlin.bookPizza("pepperoni");
		marlin.bookPizza("Clam");
	}

}
