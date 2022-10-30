package org.springframework.wx.beans4test.configurationProxyed;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.ConfigurationClassEnhancer;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @author wuxin
 * @date 2022/10/26 09:41:00
 * 被@configuration修饰的类，都会在ConfigurationClassPostProcessor中进行增强
 * 生成代理类，放入BeanDefinition中
 * @see org.springframework.context.annotation.ConfigurationClassPostProcessor#postProcessBeanDefinitionRegistry 标记
 * @see  ConfigurationClassPostProcessor#postProcessBeanFactory(ConfigurableListableBeanFactory) 增强
 * @see ConfigurationClassPostProcessor#enhanceConfigurationClasses(ConfigurableListableBeanFactory)  增强
 *
 *
 * 关于为什么，@Configutation修饰的Bean为什么要进行代理，我的看法是，当配置类中，如果出现，getABean()中依赖getBBean（）的时候
 * 如果不先去singleTonObject中，寻找的话，是无法实现单例的。
 * 所以这个代理增强，完全是为了 实现@Bean 配置的Bean 完美单例，而这个功能正是由
 * @see  ConfigurationClassEnhancer.BeanMethodInterceptor#intercept(Object, Method, Object[], MethodProxy
 * 实现的
 *
 *
 *   但是如果我们使用 @component 搭配 @Bean 继续宁使用的话，虽然不会报错但是getABean()中依赖getBBean（）的时候 这个例子
 *   在A中直接调用getBBean拿取B的bean的时候，不会经过spring的缓存，而是直接调用getBBean再创建一次，也就是BBean就丧失了单例
 *
 *
 */

//@Configuration
	@Component
public class StudentConfig {


	/**
	 * 本质还是利用FactoryMethod实现的
	 * 在ConfigurationClassPostProcessor 执行BFRPP 的实现的时候
	 *
	 * 也就是在处理@configuration这个注解的时候，会扫描其中的@Bean的注解，将其取出解析成BeanDefinition
	 * 这个@Bean配置的ban的 BeanDefinition中 factoryBean和FactoryMethod 分别为StudentConfig 的beanName 和 getAAConfigBean（@Bean修饰的方法名）
	 * @return
	 */
	@Bean
	public AConfigBean getAAConfigBean(){
		return new AConfigBean();
	}

	@Bean
	public BConfig getBBConfig(){
		BConfig bConfig = new BConfig();
		bConfig.setId(getAAConfigBean());
		return new BConfig();
	}



	public static class AConfigBean{

		private Long id;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			AConfigBean that = (AConfigBean) o;
			return Objects.equals(id, that.id);
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
	}

	public static class BConfig{

		private AConfigBean id;

		public AConfigBean getId() {
			return id;
		}

		public void setId(AConfigBean id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			BConfig bConfig = (BConfig) o;
			return id.equals(bConfig.id);
		}

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
	}




}
