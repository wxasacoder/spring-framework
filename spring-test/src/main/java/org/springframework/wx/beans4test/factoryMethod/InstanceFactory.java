package org.springframework.wx.beans4test.factoryMethod;

/**
 * @author wuxin
 * @date 2022/08/26 11:59:37
 */
public class InstanceFactory {

	public Apple getApple(){
		Apple apple = new Apple();
		return apple;
	}

	public static Apple getAppleStatic(){
		Apple apple = new Apple();
		return apple;
	}

}
