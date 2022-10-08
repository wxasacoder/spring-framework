package org.springframework.wx;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.wx.aop.RandomService;
import org.springframework.wx.beans4test.circularReference.A;

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


//	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-factory-bean.xml");
//	Object apple = context.getBean("apple");

//	/**
//	 * 测试@autowired 和 @value的解析
//	 */
//		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("spring-value.xml");
//		context1.getBean("plate");

//		/**
//		 * 循环依赖的测试
//		 */
//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\Idea_Work_Space\\spring-framework\\spring-test\\src\\main\\java\\org\\springframework\\wx\\beans4test\\circularReference");
//
//		ClassPathXmlApplicationContext annotationConfigApplicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
//
//
//
//		A a = (A) annotationConfigApplicationContext.getBean("a");
//
//		a.saySomething();
////		System.out.println(a.getB());
//		a.saySomething();

		// aop 相关的测试
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");

		RandomService randomService = (RandomService) classPathXmlApplicationContext.getBean("randomService");

		randomService.doSomething();


	}


}
