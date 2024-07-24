package org.springframework.wx.aop.intercept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Method;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {

	@Bean
	public AspectJExpressionPointcut myAspectJExpressionPointcut() {
		AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
		aspectJExpressionPointcut.setExpression("execution(* org.springframework.wx.aop.RandomService.*(..))");
		return aspectJExpressionPointcut;
	}

	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor(AspectJExpressionPointcut myAspectJExpressionPointcut) {
		TracingInterceptor tracingInterceptor = new TracingInterceptor();
		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
		defaultPointcutAdvisor.setPointcut(myAspectJExpressionPointcut);
		defaultPointcutAdvisor.setAdvice(tracingInterceptor);
		return defaultPointcutAdvisor;
	}

	@Bean
	public DefaultPointcutAdvisor defaultAfterPointcutAdvisor(AspectJExpressionPointcut myAspectJExpressionPointcut) {
		AfterInterceptor tracingInterceptor = new AfterInterceptor();
		DefaultPointcutAdvisor defaultPointcutAdvisor = new DefaultPointcutAdvisor();
		defaultPointcutAdvisor.setPointcut(myAspectJExpressionPointcut);
		defaultPointcutAdvisor.setAdvice(tracingInterceptor);
		return defaultPointcutAdvisor;
	}

	public static class TracingInterceptor implements MethodInterceptor {

		@Override
		public Object invoke(MethodInvocation invocation) throws Throwable {
			Method method = invocation.getMethod();
			String name = method.getName();
			System.out.println(name + "方法开始执行！");
			Object proceed = invocation.proceed();
			System.out.println(name + "方法执行结束！");
			return proceed;
		}
	}



	public static class AfterInterceptor implements AfterReturningAdvice {
		@Override
		public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
			System.out.println("这是一个后置切面");
		}
	}


}
