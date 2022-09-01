package org.springframework.wx.beans4test.postConstrutAndDestory;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/08/29 23:01:22
 */
@Component
public class CCP {

	/**
	 * CommonAnnotationBeanPostProcessor 也是被此处理，并将 解析得到得信息存放到mergeBeanDefinition中的externallyManagedConfigMembers集合中
	 */
	@Resource
	private ABean4TestResourse aBean4TestResourse;

	public CCP() {
		System.out.println("construct...................");
	}

	/**
	 * 在bean初始化时，调用构造器完时调用此方法
	 */
	@PostConstruct
	public void init(){
		System.out.println("corrupt...................");
	}

	/**
	 * 在bean 销毁前调用此方法
	 */
	@PreDestroy
	public void destroy(){
		System.out.println("celebrate..................");
	}

	public ABean4TestResourse getaBean4TestResourse() {
		return aBean4TestResourse;
	}

	public void setaBean4TestResourse(ABean4TestResourse aBean4TestResourse) {
		this.aBean4TestResourse = aBean4TestResourse;
	}
}
