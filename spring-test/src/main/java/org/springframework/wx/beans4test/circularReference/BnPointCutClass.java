package org.springframework.wx.beans4test.circularReference;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/09/21 01:36:14
 */
@Aspect
@Component
public class BnPointCutClass {


	@Pointcut("execution(* org.springframework.wx.beans4test.circularReference.B.saySomething(..))")
	public  void pointCut(){

	}

	@Before("pointCut()")
	public void before(){
		System.out.println("before................................................................");
	}



}
