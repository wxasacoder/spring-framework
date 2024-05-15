package org.springframework.wx;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.wx.aop.RandomService;
import org.springframework.wx.beans4test.circularReference.A;
import org.springframework.wx.beans4test.lazy.NotALazyBean;
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
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.facBean");
//		System.out.println(annotationConfigApplicationContext.getBean("myFactoryBean"));
//		System.out.println(annotationConfigApplicationContext.getBean("myFactoryBean"));
//		Object bean = annotationConfigApplicationContext.getBean("&myFactoryBean");
//		Object bean1 = annotationConfigApplicationContext.getBean("&myFactoryBean");
//		System.out.println(bean);
//		System.out.println(bean1);

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

//		/**
//		 * 注入一个系统环境变量 Autowird 注入的探究
//		 */
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.populateBean");
//		annotationConfigApplicationContext.getBean("autowriedAMap");

//		/**
//		 * configuration 被代理的测试 包括@Bean的原理
//		 */
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.configurationProxyed");

		// 测试springEL(spring 提供的工具类)
//		StandardEvaluationContext ctx = new StandardEvaluationContext();
//		User user = new User();
//		user.setName("jsjjs");
//		ctx.setVariable("userDTO",user);
//		SpelExpressionParser parser = new SpelExpressionParser();
//		Expression expression = parser.parseExpression("#userDTO.name");
//		String value = expression.getValue(ctx,String.class);
//		System.out.println(value);

		// 测试importSelector
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("org.springframework.wx.importSelector");
//		annotationConfigApplicationContext.getBean("personL");
		// 实现懒加载bean
//		AnnotationConfigApplicationContext context4LazyTest = new AnnotationConfigApplicationContext("org.springframework.wx.beans4test.lazy");
//		((NotALazyBean)context4LazyTest.getBean("notALazyBean")).getIamALazyBean().getaBeanNeedAName();

		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/home/wx/Documents/personal_java/spring-framework/spring-test/src/main/java/org/springframework/wx/aop");
		AnnotationConfigApplicationContext applicationContext =
		new AnnotationConfigApplicationContext("org.springframework.wx.aop");
		RandomService bean = applicationContext.getBean(RandomService.class);
		bean.doSomething();

	}

//	public static class User{
//
//		private String name;
//
//		public void setName(String name){
//			this.name = name;
//		}
//
//		public String getName(){
//			return this.name;
//		}
//
//	}

}
