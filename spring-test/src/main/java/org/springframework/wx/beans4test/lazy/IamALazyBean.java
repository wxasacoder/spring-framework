package org.springframework.wx.beans4test.lazy;

import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2023/03/03 16:19:49
 */
@Component
public class IamALazyBean {


	private String aBeanNeedAName;


	public IamALazyBean() {
		System.out.println("懒加载bean的初始化");
	}

	public String getaBeanNeedAName() {
		return aBeanNeedAName;
	}
}
