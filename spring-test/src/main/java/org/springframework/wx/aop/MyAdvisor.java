package org.springframework.wx.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

/**
 * @author wuxin
 * @date 2022/10/08 09:49:43
 */
public class MyAdvisor {

	public void myBefore(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		Signature signature = joinPoint.getSignature();
		System.out.println("*******************************************");
		System.out.println(args);
		System.out.println(signature);
		System.out.println(signature.getName());
		System.out.println("*******************************************");

		System.out.println("------before advisor------");
	}

	public void myAfter(){
		System.out.println("后置通知......");
	}

	public void myAfterReturning(){
		System.out.println("返回通知.............");
	}

	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println("环绕通知 前执行.........");

		Object proceed = proceedingJoinPoint.proceed();

		System.out.println("环绕通知 后执行........");

		return proceed;

	}

	public void myAfterThrow(){
		System.out.println("异常通知........");
	}











}
