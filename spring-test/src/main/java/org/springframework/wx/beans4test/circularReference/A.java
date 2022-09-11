package org.springframework.wx.beans4test.circularReference;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wuxin
 * @date 2022/09/08 23:25:57
 */

@Component
public class A {




	public void saySomething(){
		System.out.println("say something you given upon me");
	}



}
