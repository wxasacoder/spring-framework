package org.springframework.wx.beans4test.populateBean;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/09/04 23:48:54
 */
@Component
public class AInterImpl implements AInter{
	@Override
	public void itsOk() {
		System.out.println("sou");
	}
}
