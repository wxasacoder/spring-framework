package org.springframework.wx.beans4test.facBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/08/10 10:32:03
 * FactoryBean的实现
 * 在容器的启动的时候，只是会先将factoryBean的实现进行实例化，在注入的时候，则判断当前的bean是否是factorybean的
 * 子类如果是factoryBean的子类，则判断是否有$如果有$则返回factoryBean的实现类
 * 如果是不是则反射调用getObject方法，创建bean，那么创建的bean会被单独加到factoryBean单独的缓存map中下次则不需要在创建
 *
 *下面的案例 说明factoryBean返回的值是否单例是依据于factoryBean是否单例，如果factoryBean单例则teacher单例
 * 但是如果factoryBean 是原型则teacher也是原型
 * teacher不能被单独设置为单例的bean
 *
 *
 *
 */
@Component
@Scope("prototype")
public class MyFactoryBean implements FactoryBean<Teacher> {


	@Override
	public Teacher getObject() throws Exception {
		return new Teacher();
	}

	@Override
	public Class<?> getObjectType() {
		return Teacher.class;
	}
}
