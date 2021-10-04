package com.arpan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomAOPProxyObject {
	
	@Pointcut("execution(* com.arpan.service.MyService.v*(..))")
	public void myServiceValidMethods() {	}
	
	@Pointcut("execution(* com.arpan.service.MyService.h*(..))")
	public void myServiceValidHello() {	}
	
	@Pointcut("execution(* com.arpan.service.MyService.t*(..))")
	public void myServiceValidTMethod() {	}
	
//	@Before("myServiceValidMethods()")
//	public void beforeAdvice(JoinPoint jp)
//	{
//		System.out.println("Before execution of the method: "+jp.getSignature());
//	}
//	
//	@After("myServiceValidMethods()")
//	public void afterAdvice(JoinPoint jp)
//	{
//		System.out.println("After execution of the method: "+jp.getSignature());
//	}
//	
//	@AfterThrowing("myServiceValidMethods()")
//	public void afterThrowing(JoinPoint jp)
//	{
//		System.out.println("After Throwing execution of the method: "+jp.getSignature());
//	}
//	@AfterReturning("myServiceValidMethods()")
//	public void afterReturning(JoinPoint jp)
//	{
//		System.out.println("After Returning execution of the method: "+jp.getSignature());
//	}
	
//	@Around("myServiceValidMethods()")
//	public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable
//	{
//		System.out.println("Before execution of the method: "+jp.getSignature());
//		jp.proceed();
//		System.out.println("After execution of the method: "+jp.getSignature());
//	}
//	
//	@AfterReturning(value="myServiceValidHello()", returning="result")
//	public void afterReturning(JoinPoint jp ,String result)
//	{
//		System.out.println("Method which was called is : "+jp.getSignature());
//		System.out.println("Result return from this methid is : "+result);
//	}
	
	@AfterThrowing(value="myServiceValidTMethod()",throwing = "e")
	public void afterThrowing(JoinPoint jp, Exception e)
	{
		System.out.println("Method which was called is : "+jp.getSignature());
		System.out.println("Exception occured was: "+e);
	}
}
