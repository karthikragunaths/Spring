package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.journaldev.spring.aspect.Loggable)")
	public void myAdvice() {
		System.out.println("Executing myAdvice!!");
	}
}

/**

myAdvice() method will advice only setName() method. 
This is a very safe approach and whenever we want to apply the advice on any method, all we need is to annotate it with Loggable annotation.

*/