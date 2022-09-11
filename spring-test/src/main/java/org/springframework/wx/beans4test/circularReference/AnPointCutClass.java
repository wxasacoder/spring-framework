package org.springframework.wx.beans4test.circularReference;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wuxin
 * @date 2022/09/08 23:37:44
 */
@Aspect
@Component
public class AnPointCutClass {


	@Pointcut("execution(* org.springframework.wx.beans4test.circularReference.A.saySomething(..))")
	public  void pointCut(){

	}

	@Before("pointCut()")
	public void before(){
		System.out.println("before................................................................");
	}



}
