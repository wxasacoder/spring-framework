package org.springframework.wx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.wx.beans4test.methodOveride.Student;
import org.springframework.wx.beans4test.methodOveride.Teacher;

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

		/**
		 * factoryBean 测试
		 */
//		Teacher myFactoryBean = (Teacher) annotationConfigApplicationContext.getBean("myFactoryBean");
//		Object bean = annotationConfigApplicationContext.getBean("&myFactoryBean");

//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.factoryMethod");
//
//		annotationConfigApplicationContext.getBean("user");

		/**
		 * lookup-method测试
		 */
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.methodOveride");
//		Student student = (Student) annotationConfigApplicationContext.getBean("student");
//		System.out.println(student.getTeacher());
//		System.out.println(student.getTeacher());
		/**
		 * post-construct 和 preDestroy测试 @resouse测试
		 */
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.postConstrutAndDestory");
//		annotationConfigApplicationContext.getBean("CCP");
//		annotationConfigApplicationContext.close();

	}
}
