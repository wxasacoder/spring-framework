package org.springframework.wx.beans4test.facBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/08/10 10:32:03
 */
@Component
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
