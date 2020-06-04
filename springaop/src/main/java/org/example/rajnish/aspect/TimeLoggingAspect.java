package org.example.rajnish.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class TimeLoggingAspect {
	@Before("execution(* org.example.rajnish.service.*.*(..))")
	public void logBefore(){
		System.out.println("@Before:"+new Date());
	}

	@After("execution(* org.example.rajnish.service.*.*(..))")
	public void logAfter(){
		System.out.println("@After:"+new Date());
	}

	@Around("execution(* org.example.rajnish.service.*.*(..))")
	public void userAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("@Around: Before calculation-"+ new Date());
		joinPoint.proceed();
		System.out.println("@Around: After calculation-"+ new Date());
	}

	@AfterReturning(pointcut = "execution(* org.example.rajnish.service.*.*(..))",
			returning="val")
	public void logAfterReturning(Object val){
		System.out.println("Method return value:"+ val);
		System.out.println("@AfterReturning:"+new Date());
	}

	@AfterThrowing(pointcut = "execution(* org.example.rajnish.service.*.*(..))",
			throwing="exception")
	public void logAfterThrowing(Exception exception){
		System.out.println("@AfterReturning:"+new Date());
		System.out.println("Exception caught:"+ exception.getMessage());
	}
}  