package org.springframework.wx;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.wx.beans.Person;

/**
 * @author wuxin
 * @date 2022/03/07 21:37:15
 */
public class SpringTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("org/springframework/wx/spring-wx.xml");
		Person person = (Person) classPathXmlApplicationContext.getBean("Person");
		System.out.println(person);
	}

}
