package org.springframework.wx.beans4test.condition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/08/02 22:31:49
 */
@Component
@PropertySource("props.properties")  // 会在ConfigurationClassPostProcessor中被处理
// 处理完毕之后会将,文件的k-v存入DefaultListableBeanFactory中的environment对象中
public class Bean2PropSource {

	@Value("wx")
	private String wx;



}
