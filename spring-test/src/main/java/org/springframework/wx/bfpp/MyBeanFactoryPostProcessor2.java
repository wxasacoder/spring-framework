package org.springframework.wx.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @author wuxin
 * @date 2022/07/31 23:36:21
 */
public class MyBeanFactoryPostProcessor2 implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("sencond----------------------------------");
		registry.registerBeanDefinition("wx3",new RootBeanDefinition(MyBeanFactoryPostProcessor3.class));

	}
}
