package org.springframework.wx;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.wx.beans4test.User;

/**
 * @author wuxin
 * @date 2022/07/19 21:48:28
 */
public class XmlAC {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-${username}.xml");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-WUXIN.xml");
//		User person = (User) context.getBean("person");
//		System.out.println(person);


	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-factory-bean.xml");
	Object apple = context.getBean("apple");


	}


}
