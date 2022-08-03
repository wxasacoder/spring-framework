package org.springframework.wx.beans4test.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author wuxin
 * @date 2022/08/02 10:07:29
 */
public class MyOwnConditionTrue implements Condition {

	@Override
	public boolean matches(
		ConditionContext context, AnnotatedTypeMetadata metadata) {
		return true;
	}
}
