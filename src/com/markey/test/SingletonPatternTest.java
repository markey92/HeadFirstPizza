package com.markey.test;
/*
 * 创建多个进程来获取单例
 */
public class SingletonPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++){
			System.out.println(i);
			UseHeadFirstPizzaEnterprise useHeadFirstPizzaEnterprise = new UseHeadFirstPizzaEnterprise();
			Thread thread = new Thread(useHeadFirstPizzaEnterprise);
			thread.start();
		}
	}

}
