package com.markey.test;

import com.markey.world.HeadFirstPizzaEnterprise;
/*
 * 实现runna接口，模拟多线程调度
 */
public class UseHeadFirstPizzaEnterprise implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		HeadFirstPizzaEnterprise headFirstPizzaEnterprise = HeadFirstPizzaEnterprise.getInstance();
	}

}
