package org.springframework.wx.beans4test.methodOveride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/08/29 16:55:11
 */
@Component
public class Student {

	/**
	 * lookup-method解决的问题是单例引用原型，他的解决方式是如果你有一个单例对象中
	 * 引用了原型的变量，那么则在实例化这个单例bean的时候，会创建的这个bean的代理对象，
	 * 当我们通过这个单例bean获取bean的时候，会通过代理调用的方法返回原型bean
	 */
	@Autowired
	private Teacher teacher;


	@Lookup  // determineCandidateConstructors 被处理
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
