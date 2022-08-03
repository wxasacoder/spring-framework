package org.springframework.wx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuxin
 * @date 2022/08/01 21:52:42
 */
public class AnnoAC {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx");
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		Object user = annotationConfigApplicationContext.getBean("bean2TestCondition");
	}
}
