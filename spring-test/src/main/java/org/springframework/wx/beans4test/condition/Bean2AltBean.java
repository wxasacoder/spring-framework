package org.springframework.wx.beans4test.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuxin
 * @date 2022/08/02 23:59:38
 * Conditional 的生效依赖于Component
 * 当在进行Component的解析的时候会先判断类上的conditional注解是否满足
 * 如果是满足则进一步处理诸如@import @Bean,@PropertySource,@Import,@ComponentScan等等注解
 * 在将@Bean 处理完毕之后会将BeanMethod存入ConfigurationClass中,
 * 再loadBeanDefinition的时候会根据method上所具有的conditional条件判断是否该把
 * 改bean信息注册到DefinitionMap中
 * 上述的注解都是 ConfigurationClassPostProcessor 在这个bfpp中进行执行  并将解析的结果放入至beanDefinantionMap中  等待后续的实例化
 *
 */
@Configuration
@Conditional(MyOwnConditionTrue.class) //判断这个类的所有注解是否要处理
public class Bean2AltBean {


	@Bean
	public String bean1(){
		return "i am bean 1";

	}

	@Bean
	@Conditional(MyOwnConditionFalse.class) // 判断该bean 是否会被加入beanDefinitionMap
	public String bean2(){
		return "i am bean 2";
	}
}
