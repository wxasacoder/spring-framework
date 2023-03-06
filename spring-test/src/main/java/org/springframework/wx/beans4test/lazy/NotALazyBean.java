package org.springframework.wx.beans4test.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2023/03/03 16:21:39
 */
@Component
public class NotALazyBean {

	@Autowired
	@Lazy
	private IamALazyBean iamALazyBean;

	public NotALazyBean() {
		System.out.println("非懒bean的初始化");
	}


	public IamALazyBean getIamALazyBean() {
		return iamALazyBean;
	}
}
