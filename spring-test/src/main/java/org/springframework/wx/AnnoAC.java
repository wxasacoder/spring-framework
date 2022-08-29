package org.springframework.wx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuxin
 * @date 2022/08/01 21:52:42
 */
public class AnnoAC {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx");
//		User wx = (User) annotationConfigApplicationContext.getBean("wx");
//		System.out.println(wx);

//		Teacher myFactoryBean = (Teacher) annotationConfigApplicationContext.getBean("myFactoryBean");
//		Object bean = annotationConfigApplicationContext.getBean("&myFactoryBean");

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.factoryMethod");

		annotationConfigApplicationContext.getBean("user");



	}
}
