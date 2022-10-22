package org.springframework.wx.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.framework.AopContext;

import javax.management.RuntimeMBeanException;

/**
 * @author wuxin
 * @date 2022/10/12 22:28:36
 */
public class MyAdvisor2 {


	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println("around advice before.........");
//		if(1 == 1){ 注意可以抛出异常但是一定要在target方法中抛出异常  不然无法正确的抛出业务异常
//			throw new RuntimeException("............");
//		}
		Object o = AopContext.currentProxy();

		Object proceed = proceedingJoinPoint.proceed();

		System.out.println("around advice after........");

		return proceed;

	}


}
