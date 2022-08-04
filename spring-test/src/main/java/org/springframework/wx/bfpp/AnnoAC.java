package org.springframework.wx.bfpp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuxin
 * @date 2022/08/01 09:47:14
 */
public class AnnoAC {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AnnoAC.class);

		System.out.println(annotationConfigApplicationContext.getBean("user"));

	}


}
