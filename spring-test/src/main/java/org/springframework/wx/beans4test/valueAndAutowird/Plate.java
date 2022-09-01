package org.springframework.wx.beans4test.valueAndAutowird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wuxin
 * @date 2022/08/31 13:54:55
 */
public class Plate {

	/**
	 *
	 * @value
	 * @Autowired
	 * 上述2注解都是由AutowiredAnnotationBeanPostProcessor 进行解析处理
	 * 解析得到得信息和@Resourse一样存放到mergeBeanDefinition中的externallyManagedConfigMembers集合中
	 *
	 * 随后在populate的时候进行注入
	 */

	@Value("${wx}")
	private String wx;

	@Autowired
	private Jackfruit jackfruit;

	public String getWx() {
		return wx;
	}

	public void setWx(String wx) {
		this.wx = wx;
	}

	public Jackfruit getJackfruit() {
		return jackfruit;
	}

	public void setJackfruit(Jackfruit jackfruit) {
		this.jackfruit = jackfruit;
	}
}
