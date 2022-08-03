package org.springframework.wx.beans4test.condition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuxin
 * @date 2022/08/02 10:09:02
 */
@Configuration
@Conditional(MyOwnConditionTrue.class)
public class Bean2TestCondition {

	@Value("wx")
	private String wx;

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}
}
