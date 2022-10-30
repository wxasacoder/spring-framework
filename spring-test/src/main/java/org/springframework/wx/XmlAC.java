package org.springframework.wx;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.wx.aop.RandomService;
import org.springframework.wx.beans4test.circularReference.A;
import org.springframework.wx.beans4test.circularReference.B;
import org.springframework.wx.tx.StudentService;

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

//		ClassPathXmlApplicationContext annotationConfigApplicationContext = new ClassPathXmlApplicationContext("spring-circular.xml");
//
//		A a = (A) annotationConfigApplicationContext.getBean("a");
//		B b = (B) annotationConfigApplicationContext.getBean("b");
//		System.out.println(a.b);
//		a.saySomething();
//		System.out.println(a.getB());


		// aop 相关的测试
		// 将aspectJ生成的的类生成到磁盘
//		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"D:\\Idea_Work_Space\\spring-framework\\spring-test\\src\\main\\java\\org\\springframework\\wx\\aop");
//
//		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
//
//		RandomService randomService = (RandomService) classPathXmlApplicationContext.getBean("randomService");
//
//		randomService.doSomethingElse();
//
//		randomService.doSomething();

		// 事物测试
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-tx.xml");
//		JdbcTemplate jdbcTemplate = (JdbcTemplate)applicationContext.getBean("jdbcTemplate");
//		String sql = "INSERT INTO student(name,age,gender) values ('锤子',12,1)";
//		jdbcTemplate.update(sql);
//		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
//		studentService.insertStudentBatch();
	}


}
